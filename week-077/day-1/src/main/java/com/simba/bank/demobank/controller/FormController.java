package com.simba.bank.demobank.controller;

import com.simba.bank.demobank.model.BankAccount;
import com.simba.bank.demobank.model.BigBank;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class FormController {
  BigBank bigBank = new BigBank();

  @GetMapping("/demonstrate")
  public String show(Model model){

    model.addAttribute("bankAccounts",bigBank.getBankAccounts());
    model.addAttribute("newAccount", new BankAccount());
    return "demonstrate";
  }


  @GetMapping("/form")
  public String formGet(Model model){
    model.addAttribute("clients", bigBank.getBankAccounts());
    return "form";
  }

  @PostMapping("/form")
  public String formPost(@ModelAttribute(name="name") String name){ ///if I put name="str" in submit part then I do not need to use model attribute
    if(name.toLowerCase().equals("simba")) {
      bigBank.getBankAccounts().stream()
          .filter(x -> x.getName().toLowerCase().equals(name.toLowerCase())).forEach(x -> x.setBalance(x.getBalance() + 100));
    } else {
      bigBank.getBankAccounts().stream()
          .filter(x -> x.getName().toLowerCase().equals(name.toLowerCase())).forEach(x -> x.setBalance(x.getBalance() + 10));
    }
    return "redirect:/demonstrate";
  }

  @PostMapping("/addAccount")
  public String addAccount(BankAccount newAccount){
    bigBank.addAccount(newAccount);
    return "redirect:/demonstrate";
  }
//  @ModelAttribute()
//  public void addAcounts(Model model){ //I need this to add list to model prior to returning to demonstrate page, otherwise I need to use redirect in form
//    model.addAttribute("bankAccounts",bigBank.getBankAccounts());
//  }
}
