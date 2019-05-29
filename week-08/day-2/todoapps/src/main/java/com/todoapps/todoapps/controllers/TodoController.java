package com.todoapps.todoapps.controllers;

import com.todoapps.todoapps.models.ToDo;
import com.todoapps.todoapps.repository.IToDoRepository;
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
  IToDoRepository repository;

  @RequestMapping(value = {"/list","/"}, method = RequestMethod.GET)
  public String list(Model model, @RequestParam(name="isActive", required = false) String isActive){
    List<ToDo> todos = new ArrayList<>();
    repository.findAll().forEach(todos::add);
    if(isActive == null) {
      model.addAttribute("todos", todos);
    } else {
      if(isActive.equals("false")){
        model.addAttribute("todos", todos.stream().filter(todo -> !todo.isDone()).collect(Collectors.toList()));
      } else {
        model.addAttribute("todos", todos.stream().filter(ToDo::isDone).collect(Collectors.toList()));
      }
    }
    return "todolist";
  }
}
