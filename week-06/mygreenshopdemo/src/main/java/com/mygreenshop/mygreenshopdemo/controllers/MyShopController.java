package com.mygreenshop.mygreenshopdemo.controllers;

import com.mygreenshop.mygreenshopdemo.MyShop;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyShopController {
  MyShop myshop;

  @RequestMapping("/myshop")
  public String greeting(Model model, @RequestParam String name) {
    myshop = new MyShop(name);
    model.addAttribute("name",myshop.getName());
    return "myshop";
  }
}
