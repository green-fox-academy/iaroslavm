package com.todoapplication.newapplication.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("todo")
public class TodoController {

  @RequestMapping(value = {"/list", "/"}, method = RequestMethod.GET)
  @ResponseBody
  public String list(Model model){
    return "hello";
  }


}
