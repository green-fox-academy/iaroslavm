package com.anothertry.demo.controller;

import com.anothertry.demo.model.User;
import com.anothertry.demo.model.Todo;
import com.anothertry.demo.services.UserService;
import com.anothertry.demo.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/todo")

public class TodoController {

  @Autowired
  TodoService service;

  @Autowired
  UserService userService;

  @RequestMapping(value = {"/list", "/"}, method = RequestMethod.GET)
  public String list(Model model, @RequestParam(name = "isActive", required = false) String isActive,
                     @RequestParam(name = "searchKey", required = false) String searchKey,
                     @RequestParam(name = "id", required = false) Long id) {
    List<Todo> todos = new ArrayList<>();
    service.findAll().forEach(todos::add);

    model.addAttribute("userList", userService.findAll());


    if (isActive != null) {
      if (isActive.equals("true")) {
        model.addAttribute("todos", todos.stream().filter(todo -> !todo.isDone()).collect(Collectors.toList()));
      } else {
        model.addAttribute("todos", todos.stream().filter(Todo::isDone).collect(Collectors.toList()));
      }
    } else {
      if(searchKey == null & id == null) {
        model.addAttribute("todos", todos);
      } else if (searchKey != null){
       service.search(searchKey, model);
      } else if (id == 0) {
        model.addAttribute("todos", todos);
      } else {
        model.addAttribute("todos", service.searchByUserID(id));
      }
    }
    return "list-todo";
  }



  @GetMapping("/addTask")
  public String addTask(Model model) {
    model.addAttribute("newTodo", new Todo());
    return "add-todo";
  }

  @PostMapping("/addTask")
  public String postTask(@ModelAttribute Todo newTodo) {
    service.save(newTodo);
    return "redirect:/todo/";
  }



  @GetMapping("/delete/{id}")
  public String deleteTask(@PathVariable Long id) {
    service.deleteById(id);
    return "redirect:/todo/";
  }


  @GetMapping("/edit/{id}")
  public String editTask(Model model, @PathVariable Long id) {
    model.addAttribute("todoEdit", service.findById(id));
    model.addAttribute("assigneelist", userService.findAll());
    return "edit-todo";
  }


  @PostMapping("/edit")
  public String editTask(@ModelAttribute Todo thisTodo) {
    service.save(thisTodo);
//    userService.addTask(thisTodo);
    return "redirect:/todo/";
  }

  @GetMapping("/item/{id}")
  public String getDescription(@PathVariable Long id, Model model){
    model.addAttribute("todoObject", service.findById(id));
    return "description-todo";
  }

  @PostMapping("/search")
  public String search(String searchKey){
    return "redirect:/todo/list?searchKey=" + searchKey;
  }

  @PostMapping("/searchByUserName")
  public String searchByUser(Long id){
    return "redirect:/todo/list/?id=" + id;
  }


}
