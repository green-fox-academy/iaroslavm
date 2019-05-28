package com.anothertry.demo.controller;

import com.anothertry.demo.model.Todo;
import com.anothertry.demo.repository.ITodoRepository;
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
  ITodoRepository repository;

  @RequestMapping(value = {"/list", "/"}, method = RequestMethod.GET)
  public String list(Model model, @RequestParam(name = "isActive", required = false) String isActive) {
    List<Todo> todos = new ArrayList<>();
    repository.findAll().forEach(todos::add);

    if (isActive != null) {
      if (isActive.equals("true")) {
        model.addAttribute("todos", todos.stream().filter(todo -> !todo.isDone()).collect(Collectors.toList()));
      } else {
        model.addAttribute("todos", todos.stream().filter(Todo::isDone).collect(Collectors.toList()));
      }
    } else {
      model.addAttribute("todos", todos);
    }

    return "listtodo";
  }

  @GetMapping("/add")
  public String addGet(Model model) {
    model.addAttribute("newTodo", new Todo());
    return "add";
  }

  @PostMapping("/add")
  public String addPost(@ModelAttribute Todo newTodo) {
    repository.save(newTodo);
    return "redirect:/todo/";
  }

}
