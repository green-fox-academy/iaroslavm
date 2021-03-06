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
  public String list(Model model, String isActive, String searchKey, Long id) {
    userService.addUserList(model);
    service.generateIndexLayout(model,isActive, searchKey,id);


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
    model.addAttribute("userList", userService.findAll());
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
