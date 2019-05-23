package com.dependency.dependencydemo.controller;

import com.dependency.dependencydemo.model.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserUtilitiesController {

  @Autowired
  UtilityService utilityService;

  @GetMapping("/useful")
  public String getUseful() {
    return "useful";
  }

  @GetMapping("/useful/colored")
  public String getRandomColored(Model model) {
    model.addAttribute("backColor", utilityService.randomColor());
    return "colored";
  }

  @GetMapping("/useful/email")
  public String getEmail(@RequestParam String email, Model model) {
    model.addAttribute("emailCondition", utilityService.validateEmail(email));
    model.addAttribute("email", email);
    return "email";
  }

  @GetMapping("/useful/code")
  public String code(@RequestParam(value = "str", required = false) String str,
                     @RequestParam(value = "num", required = false) Integer num, Model model) {
    if (num == null) {
      num = 0;
    }
    if (str == null) {
      str = "example";
    }

    String toPrintCodedWord = utilityService.caesar(str, num);
    model.addAttribute("word", toPrintCodedWord);
    return "code";
  }

//  @GetMapping("/decode")
//  public String deCode(@RequestParam String str,@RequestParam Integer num, Model model){
//    String toPrintDeCodedWord = utilityService.caesar(str,num);
//    model.addAttribute("word", toPrintDeCodedWord);
//    return "code";
}
