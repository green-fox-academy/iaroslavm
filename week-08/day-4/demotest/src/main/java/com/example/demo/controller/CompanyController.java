package com.example.demo.controller;

import com.example.demo.repository.BranchRepo;
import com.example.demo.repository.CompanyRepo;
import com.example.demo.service.IBranchService;
import com.example.demo.service.ICompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.persistence.GeneratedValue;

@Controller("/")
public class CompanyController {

  @Autowired
  ICompanyService companyService;

  @Autowired
  IBranchService branchService;

  @GetMapping("/listCompany")
  public String getCompanyList(Model model, String search, String keyWord){
    model.addAttribute("companies",companyService.findBySearch(search, keyWord));
    return "list-company";
  }

  @PostMapping("/listCompany")
  public String changeCompanyList(String search, String keyWord){
    if (search != null) return "redirect:/listCompany?search=" + search;
    else return "redirect:/listCompany?keyWord=" + keyWord;
  }


}
