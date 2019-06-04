package com.restexample.demo.controller;

import com.restexample.demo.model.ErrorObject;
import com.restexample.demo.model.GreeterObject;
import com.restexample.demo.model.MessageObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class GreeterController {

  @RequestMapping(value = "/greeter", method = RequestMethod.GET)
  public MessageObject getGreeter(String name, String title){
    if(name == null & title == null) {
      return  new ErrorObject("Please provide a name and a title!");
    } else if (name == null){
      return new ErrorObject("Please provide a name!");
    } else if (title == null){
      return new ErrorObject("Please provide a title!");
    } else {
      return new GreeterObject(name, title);
    }
  }
}
