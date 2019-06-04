package com.anothertry.demo.controller;

import com.anothertry.demo.model.User;
import com.anothertry.demo.model.Todo;
import com.anothertry.demo.services.UserService;
import com.anothertry.demo.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/todo")

public class UserController {

  @Autowired
  TodoService service;

  @Autowired
  UserService userService;


  @GetMapping("/userList")
  public String usertListGet(Model model) {
    model.addAttribute("userList", userService.findAll());
    return "list-user";
  }

  @GetMapping("/addUser")
  public String addUserGet(Model model) {
    model.addAttribute("newUser", new User());
    return "add-user";
  }


  @PostMapping("/addUser")
  public String addUserPost(@ModelAttribute User newUser) {
    userService.addUser(newUser);
    return "redirect:/todo/userList";
  }


  @GetMapping("/deleteUser/{id}")
  public String deleteUser(@PathVariable Long id) {
    userService.deleteByID(id);
    return "redirect:/todo/userList/";
  }


  @GetMapping("/editUser/{id}")
  public String editUserGet(Model model, @PathVariable Long id) {
    model.addAttribute("asEdit", userService.findById(id));
    return "edit-user";
  }

  @PostMapping("/editUser")
  public String editUserPost(@ModelAttribute User thisAs) {
    userService.addUser(thisAs);
    return "redirect:/todo/userList";
  }

  @GetMapping("/user/{id}")
  public String getAsDescription(@PathVariable Long id, Model model){
    model.addAttribute("asObject", userService.findById(id));
    return "description-user";
  }


}
