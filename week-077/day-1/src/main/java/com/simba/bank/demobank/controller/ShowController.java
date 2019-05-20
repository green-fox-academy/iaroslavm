package com.simba.bank.demobank.controller;

import com.simba.bank.demobank.model.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ShowController {
  BankAccount newAccount;

  @GetMapping("/show")
  public String show(Model model){
    newAccount = new BankAccount("Simba","lion",2000, "good");
    model.addAttribute("newAccount",newAccount);
    return "show";
  }
}
