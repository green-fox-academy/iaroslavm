package com.todoapps.todoapps.controllers;

import com.todoapps.todoapps.models.ToDo;
import com.todoapps.todoapps.repository.IToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/todo")
public class TodoController {

  @Autowired
  IToDoRepository repository;

  @RequestMapping(value = {"/list","/"}, method = RequestMethod.GET)
  public String list(Model model){
    List<ToDo> todos = new ArrayList<>();
    repository.findAll().forEach(todos::add);
    model.addAttribute("todos",todos);
    return "todolist";
  }
}
