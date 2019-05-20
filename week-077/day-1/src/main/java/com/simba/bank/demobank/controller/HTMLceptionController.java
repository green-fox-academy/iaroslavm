package com.simba.bank.demobank.controller;

import com.simba.bank.demobank.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HTMLceptionController {

  @GetMapping("/test")
  public String show(){
    return "test";
  }
}