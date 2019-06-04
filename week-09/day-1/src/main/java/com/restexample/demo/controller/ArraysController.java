package com.restexample.demo.controller;

import com.restexample.demo.model.*;
import com.restexample.demo.repository.LogRepository;
import com.restexample.demo.service.LogServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController("/")
public class ArraysController {

  @Autowired
  LogServiceImp service;

  @RequestMapping(value = "/arrays", method = RequestMethod.POST)
  public MessageObject doArrays(@RequestBody(required = false) ArraysObjectInput arraysObjectInput){
    service.add("/doubling", "input="+ arraysObjectInput.getNumbers());
    if(arraysObjectInput != null) {
      return new ArraysObject(arraysObjectInput.getWhat(), arraysObjectInput.getNumbers());
    } else {
      return new ErrorObject("Please provide a number!");
    }

  }
}
