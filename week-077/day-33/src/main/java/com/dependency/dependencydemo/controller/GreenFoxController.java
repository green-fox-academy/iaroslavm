package com.dependency.dependencydemo.controller;

import com.dependency.dependencydemo.model.gfa.StudentService;
import com.dependency.dependencydemo.model.gfa.StudentServiceText;
import com.dependency.dependencydemo.model.gfa.StudentServiceable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreenFoxController {

  @Autowired
  @Qualifier("textwriter")
  StudentServiceable service;

  @GetMapping("/gfa")
  public String getMain() {
    return "gfa/gfa";
  }

  @GetMapping("/gfa/list")
  public String getList(Model model) {
    model.addAttribute("list", service.findAll());
    return "gfa/list";
  }

  @GetMapping("/gfa/add")
  public String addStudent() {
    return "gfa/add";
  }

  @GetMapping("/gfa/save")
  public String saveStudent(@ModelAttribute(name = "str") String name) {
    service.save(name);
    return "redirect:/gfa/list";
  }

  @GetMapping("/gfa/check")
  public String checkStudent(Model model) {
    model.addAttribute("checkactivation", false);
    return "gfa/check";
  }

  @PostMapping("/gfa/check")
  public String checkStudent(@ModelAttribute(name = "str") String str, Model model) {
    if (!str.isEmpty()) {
      model.addAttribute("checkCondition", service.check(str));
      model.addAttribute("checkactivation", true);
      return "gfa/check";
    } else {
      return "redirect:/gfa/check";
    }
  }

}
