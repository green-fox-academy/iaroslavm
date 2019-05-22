package com.dependency.dependencydemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserUtilities {

  @GetMapping("useful")
  public void index(){

  }
}
