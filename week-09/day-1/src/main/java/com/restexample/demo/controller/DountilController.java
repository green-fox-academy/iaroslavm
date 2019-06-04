package com.restexample.demo.controller;

import com.restexample.demo.model.Dountil;
import com.restexample.demo.model.DountilObject;
import com.restexample.demo.model.ErrorObject;
import com.restexample.demo.model.MessageObject;
import org.hibernate.validator.internal.util.DomainNameUtil;
import org.springframework.web.bind.annotation.*;

@RestController
public class DountilController {

  @RequestMapping(value = "/dountil/{action}", method = RequestMethod.POST)
  public MessageObject doUntil(@PathVariable String action, @RequestBody(required = false) DountilObject until){
    if(until != null) {
      return new Dountil(action, until.getUntil());
    } else {
      return new ErrorObject("Please provide a number!");
    }

  }

}
