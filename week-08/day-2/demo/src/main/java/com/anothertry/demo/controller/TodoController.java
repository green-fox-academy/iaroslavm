package com.anothertry.demo.controller;

import com.anothertry.demo.model.Asignee;
import com.anothertry.demo.model.Todo;
import com.anothertry.demo.services.AsService;
import com.anothertry.demo.services.IService;
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
  IService service;

  @Autowired
  AsService asService;

  @RequestMapping(value = {"/list", "/"}, method = RequestMethod.GET)
  public String list(Model model, @RequestParam(name = "isActive", required = false) String isActive,
                     @RequestParam(name = "searchKey", required = false) String searchKey) {
    List<Todo> todos = new ArrayList<>();
    service.findAll().forEach(todos::add);

    model.addAttribute("assigneelist",asService.findAll());


    if (isActive != null) {
      if (isActive.equals("true")) {
        model.addAttribute("todos", todos.stream().filter(todo -> !todo.isDone()).collect(Collectors.toList()));
      } else {
        model.addAttribute("todos", todos.stream().filter(Todo::isDone).collect(Collectors.toList()));
      }
    } else {
      if(searchKey == null) {
        model.addAttribute("todos", todos);
      } else {
       service.search(searchKey, model);
      }
    }
    return "list";
  }

  @GetMapping("/aslist")
  public String aslist(Model model) {
    model.addAttribute("aslist", asService.findAll());
    return "list-as";
  }

  @GetMapping("/addas")
  public String addAs(Model model) {
    model.addAttribute("newAs", new Asignee());
    return "add-as";
  }


  @PostMapping("/addas")
  public String postAs(@ModelAttribute Asignee newAsignee) {
    asService.addAsignee(newAsignee);
    return "redirect:/todo/aslist";
  }

  @GetMapping("/add")
  public String addTask(Model model) {
    model.addAttribute("newTodo", new Todo());
    return "add-todo";
  }

  @PostMapping("/add")
  public String postTask(@ModelAttribute Todo newTodo) {
    service.save(newTodo);
    return "redirect:/todo/";
  }



  @GetMapping("/{id}/delete")
  public String deleteTask(@PathVariable Long id) {
    service.deleteById(id);
    return "redirect:/todo/";
  }

  @GetMapping("/{id}//edit")
  public String editTask(Model model, @PathVariable Long id) {
    model.addAttribute("todoEdit", service.findById(id));
    return "edit-todo";
  }


  @PostMapping("/edit")
  public String editTask(@ModelAttribute Todo thisTodo) {
    service.save(thisTodo);
    return "redirect:/todo/";
  }

  @GetMapping("/{id}/editas")
  public String editAs(Model model, @PathVariable Long id) {
    model.addAttribute("asEdit", asService.findById(id));
    return "edit-as";
  }

  @PostMapping("/editas")
  public String editAs(@ModelAttribute Asignee thisAs) {
    asService.addAsignee(thisAs);
    return "redirect:/todo/aslist";
  }

  @GetMapping("/item/{id}")
  public String getDescription(@PathVariable Long id, Model model){
    model.addAttribute("todoObject", service.findById(id));
    return "item-description";
  }

  @PostMapping("/search")
  public String search(String searchKey){
    return "redirect:/todo/list?searchKey=" + searchKey;
  }


}
