package com.restexample.demo.controller;

import com.restexample.demo.model.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sun.java2d.xr.GrowableRectArray;

@RestController()
public class AppendController {

  @RequestMapping(value = "/appenda/{appendable}", method = RequestMethod.GET)
  public AppendObject append(@PathVariable String appendable){
    return new AppendObject(appendable);
  }
}
