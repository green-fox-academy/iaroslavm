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
  public String addTask(Model model) {
    model.addAttribute("newTodo", new Todo());
    return "add";
  }

  @PostMapping("/add")
  public String postTask(@ModelAttribute Todo newTodo) {
    repository.save(newTodo);
    return "redirect:/todo/";
  }

  @GetMapping("/{id}/delete")
  public String deleteTask(@PathVariable Long id) {
    repository.delete(repository.findById(id).orElse(null));
    return "redirect:/todo/";
  }

  @GetMapping("/{id}//edit")
  public String editTask(Model model, @PathVariable Long id) {
    model.addAttribute("todoEdit", repository.findById(id).orElse(null));
    return "edit";
  }

  @PostMapping("/edit")
  public String editTask(@ModelAttribute Todo thisTodo) {
    System.out.println(thisTodo.getId());
    System.out.println(thisTodo.getTitle());
    repository
        .findById(thisTodo.getId())
        .orElse(null)
        .setDone(thisTodo.isDone());
    repository
        .findById(thisTodo.getId())
        .orElse(null)
        .setUrgent(thisTodo.isUrgent());
    repository
        .findById(thisTodo.getId())
        .orElse(null)
        .setTitle(thisTodo.getTitle());
    repository.save(repository
        .findById(thisTodo.getId())
        .orElse(null));
    return "redirect:/todo/";
  }


}
