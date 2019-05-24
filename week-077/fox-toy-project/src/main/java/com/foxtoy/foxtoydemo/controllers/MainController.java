package com.foxtoy.foxtoydemo.controllers;

import com.foxtoy.foxtoydemo.models.AccessoirLists;
import com.foxtoy.foxtoydemo.models.FoxList;
import com.foxtoy.foxtoydemo.models.GreenFox;
import com.foxtoy.foxtoydemo.services.FoxAuthentificationServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("/index")
public class MainController {

  @Autowired
  FoxList foxList;

  @Autowired
  FoxAuthentificationServices foxSerives;

  @Autowired
  AccessoirLists usefulLists;

  @GetMapping("/")
  public String getMain(Model model, @RequestParam(required = false, name="name") String name){
    if(name == null){
      return "redirect:/simplelogin";
    } else {
      model.addAttribute("foxObject", foxSerives.foxCheck(name));
      model.addAttribute("tricklist",usefulLists.getTrickList());
      return "index";
    }
  }

  @GetMapping("/simplelogin")
  public String getSimpleLogin(Model model, @RequestParam(required = false, name="name") String login) {
    if (login != null) {
      if (login.length() != 0) {
        model.addAttribute("message", "is not registered in Fox Club");
        model.addAttribute("name", login);
      } else {
        model.addAttribute("message", "Please provide a name");
        model.addAttribute("name", login);
      }
    }
    return "simplelogin";
  }

  @PostMapping("/simplelogin")
  public String postSimpleLogin(@RequestParam(name="login",required = false) String login,
                                @RequestParam(name="register", required = false) String register) {
    if (register == null & login == null) {
      return "redirect:/simplelogin";

    } else if (login != null) {

      if(foxSerives.loginCheck(login)){
        return "redirect:/?name=" + login;

      } else {
        return "redirect:/simplelogin?name=" + login;

      }
    } else {
      if(register.length() != 0) {
        return "redirect:/?name=" + foxSerives.register(register);
      } else {
        return "redirect:/simplelogin?name=" + register;
      }

    }
  }

  @GetMapping("/list")
  public String getList(Model model, @RequestParam(required = false, name="name") String name){
    model.addAttribute("foxlist", foxList.getListFoxes());
    model.addAttribute("name", name);
    return "list";
  }

  @GetMapping("/nutritionStore")
  public String getStore(Model model, @RequestParam(name="name", required = false) String name){
    model.addAttribute("foxObject", foxSerives.foxCheck(name));
    model.addAttribute("foodlist",usefulLists.getFoodList());
    model.addAttribute("drinklist",usefulLists.getDrinkList());
    return "foodstore";
  }

  @PostMapping("/nutritionStore")
  public String postStore(@ModelAttribute GreenFox thisFox){
    foxSerives.updateFoxFood(thisFox);
    return "redirect:/?name=" + thisFox.getName();
  }

  @GetMapping("/trickcenter")
  public String getTrick(Model model, @RequestParam(name="name", required = false) String name){
    model.addAttribute("foxObject", foxSerives.foxCheck(name));
    model.addAttribute("tricklist",usefulLists.getTrickList());
    return "trickcenter";
  }

  @PostMapping("/trickcenter")
  public String postTrick(@ModelAttribute GreenFox thisFox){
    foxSerives.learnTricks(thisFox);
    return "redirect:/?name=" + thisFox.getName();
  }
}


