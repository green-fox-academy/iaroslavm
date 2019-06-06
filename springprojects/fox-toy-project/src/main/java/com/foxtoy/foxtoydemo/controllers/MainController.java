package com.foxtoy.foxtoydemo.controllers;

import com.foxtoy.foxtoydemo.models.ExtraList;
import com.foxtoy.foxtoydemo.models.FoxList;
import com.foxtoy.foxtoydemo.models.GreenFox;
//import com.foxtoy.foxtoydemo.repository.IFoxRepository;
import com.foxtoy.foxtoydemo.services.FoxServices;
import com.foxtoy.foxtoydemo.services.FoxServicesImp;
//import com.foxtoy.foxtoydemo.services.SaveService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller("/index")
public class MainController {

//  @Autowired
//  IFoxRepository repository;

  @Autowired
  FoxServices foxSerives;


//  @Autowired
//  SaveService savings;

  @GetMapping("/")
  public String getMain(Model model, @RequestParam(required = false, name="name") String name){
    if(name == null || !foxSerives.loginCheck(name)){
      return "redirect:/login";
    } else {
//      savings.restoreData("foxInfo.csv");
      model.addAttribute("foxObject", foxSerives.foxCheck(name));
      model.addAttribute("tricklist",foxSerives.getTricks());

      return "index";
    }
  }

  @GetMapping("/register")
  public String register(Model model, @RequestParam(required = false, name="name") String register) {
    if (register != null) {
      if (register.length() == 0) {
        model.addAttribute("message", "Please provide a name");
        model.addAttribute("name", register);
      }
    }
    return "register";
  }

  @PostMapping("/register")
  public String postRegister(@RequestParam(name="register", required = false) String register) {
    if (register == null) {
      return "redirect:/register";
    } else {
      if(register.length() != 0) {
        return "redirect:/?name=" + foxSerives.register(register);
      } else {
        return "redirect:/register?name=" + register;
      }
    }
  }

  @GetMapping("/login")
  public String getSimpleLogin(Model model, @RequestParam(required = false, name="name") String login) {
    if (login != null) {
      if (login.length() != 0) {
        model.addAttribute("message", "is not registered in Fox Club. Please register!");
        model.addAttribute("name", login);
      } else {
        model.addAttribute("message", "Please provide a name");
        model.addAttribute("name", login);
      }
    }
    return "login";
  }

  @PostMapping("/login")
  public String postSimpleLogin(@RequestParam(name="login",required = false) String login,
                                @RequestParam(name="register", required = false) String register) {
    if (login == null) {
      return "redirect:/login";
    } else {
      if(foxSerives.loginCheck(login)){
        return "redirect:/?name=" + login;
      } else {
        return "redirect:/login?name=" + login;
      }
    }
  }

  @GetMapping("/list")
  public String getList(Model model, @RequestParam(required = false, name="name") String name){
    model.addAttribute("foxlist", foxSerives.getFoxesList());
    model.addAttribute("name", name);
    return "list";
  }

  @GetMapping("/nutritionStore")
  public String getStore(Model model, @RequestParam(name="name", required = false) String name){
    model.addAttribute("foxObject", foxSerives.foxCheck(name));
    model.addAttribute("foodlist",foxSerives.getFoods());
    model.addAttribute("drinklist",foxSerives.getDrinks());
    return "foodstore";
  }

  @PostMapping("/nutritionStore")
  public String postStore(@ModelAttribute GreenFox foxObject){
    foxSerives.updateFoxFood(foxObject);
    return "redirect:/?name=" + foxObject.getName();
  }

  @GetMapping("/trickcenter")
  public String getTrick(Model model, @RequestParam(name="name", required = false) String name){
    model.addAttribute("foxObject", foxSerives.foxCheck(name));
    model.addAttribute("tricklist",foxSerives.getTricks());
    return "trickcenter";
  }

  @PostMapping("/trickcenter")
  public String postTrick(@ModelAttribute GreenFox thisFox){
    foxSerives.learnTricks(thisFox);
    return "redirect:/?name=" + thisFox.getName();
  }

  @GetMapping("/history")
  public String getHistory(Model model, @RequestParam(name="name", required = false) String name){
    model.addAttribute("foxObject", foxSerives.foxCheck(name));
    return "history";
  }
}


