package com.mygreenshop.mygreenshopdemo.controllers;

import com.mygreenshop.mygreenshopdemo.MyShop;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class MyShopController {
  private MyShop myShop = new MyShop();

  @RequestMapping("/myshop")
  public String index(Model model) {
    model.addAttribute("name", myShop.getName());
    model.addAttribute("items", myShop.getShopItems());
    model.addAttribute("condition", true);
    return "myshop";
  }

  @RequestMapping(value="/myshop/onlyAvailable", method = GET)
  public String available(Model model) {
    model.addAttribute("name", myShop.getName());
    model.addAttribute("items", myShop.availableOnly());
    model.addAttribute("condition", true);
    return "myshop";
  }

  @RequestMapping(value="/myshop/cheapFirst", method = GET)
  public String cheapFirst(Model model) {
    model.addAttribute("name", myShop.getName());
    model.addAttribute("items", myShop.cheapFirst());
    model.addAttribute("condition", true);
    return "myshop";
  }

  @RequestMapping("/myshop/nikeOnly")
  public String nike(Model model) {
    model.addAttribute("name", myShop.getName());
    model.addAttribute("items", myShop.nikeOnly());
    model.addAttribute("condition", true);
    return "myshop";
  }

  @RequestMapping("/myshop/averageStock")
  public String averageStock(Model model) {
    model.addAttribute("name", myShop.getName());
    model.addAttribute("items", myShop.nikeOnly());
    model.addAttribute("condition", false);
    model.addAttribute("averageStock", myShop.averageStock());
    return "myshop";
  }

  @RequestMapping("/myshop/mostExpensive")
  public String expensive(Model model) {
    model.addAttribute("name", myShop.getName());
    model.addAttribute("items", myShop.mostExpensiveName());
    model.addAttribute("condition", true);
    return "myshop";
  }

  @RequestMapping(value = "/ex/foos", method = POST)
  @ResponseBody
  public String postFoos() {
    return "Post some Foos";
  }


  //THis is a method to get name of the shop from @RequestParam
//  @RequestMapping("/myshop")
//  public String greeting(Model model, @RequestParam String name) {
//    myshop = new MyShop();
//    model.addAttribute("name",myshop.getName());
//    return "myshop";
//  }
}
