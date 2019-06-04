package com.restexample.demo.controller;

import com.restexample.demo.model.DoubleInput;
import com.restexample.demo.model.ErrorObject;
import com.restexample.demo.model.MessageObject;
import com.restexample.demo.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.rmi.runtime.Log;

import java.util.Date;

@RestController
public class DoubleController {

  @Autowired
  LogService logService;

  @RequestMapping(value = "/doubling", method = RequestMethod.GET)
  public MessageObject getDouble(Integer input){
    logService.add("/doubling", "input="+ input);
    if(input != null) {
      return  new DoubleInput(input);
    } else {
      return new ErrorObject("Please provide an input!");
    }
  }
}
