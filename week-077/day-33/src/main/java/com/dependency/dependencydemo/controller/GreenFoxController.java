package com.dependency.dependencydemo.controller;

import com.dependency.dependencydemo.model.gfa.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreenFoxController {

  @Autowired
  StudentService service;

  @GetMapping("/gfa")
  public String getMain(){
    return "gfa/gfa";
  }

  @GetMapping("/gfa/list")
  public String getList(Model model){
    model.addAttribute("list",service.findAll());
    return "gfa/list";
  }

  @GetMapping("/gfa/add")
  public String addStudent(){
    return "gfa/add";
  }

  @GetMapping("/gfa/save")
  public String saveStudent(@ModelAttribute(name="str") String name){
    service.save(name);
    return "redirect:/gfa/list";
  }

}
