package com.greenfoxtoy.y.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller("/index")
public class MainController {

  @Autowired
  GreenFox myFox;

  @GetMapping("/")
  public String getMain(Model model, GreenFox fox){
    model.addAttribute("foxObject", fox);
    return "index";
  }
}
