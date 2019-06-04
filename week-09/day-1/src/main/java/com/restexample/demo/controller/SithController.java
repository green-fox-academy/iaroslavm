package com.restexample.demo.controller;


import com.restexample.demo.model.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class SithController {



  @RequestMapping(value = "/sith", method = RequestMethod.POST)
  public MessageObject postSith(@RequestBody(required = false) SithObjectIntput input){
    if(input != null) {
      return new SithObject(input.getText());
    } else {
      return new ErrorObject("Please provide a number!");
    }

  }
}
