package com.restexample.demo.controller;

import com.restexample.demo.model.LogObject;
import com.restexample.demo.model.LogObjectContainer;
import com.restexample.demo.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LogController {

  @Autowired
  LogObjectContainer allLogs;

  @RequestMapping(value = "/log", method = RequestMethod.GET)
  public LogObjectContainer getLogs(){
    return allLogs;
  }
}
