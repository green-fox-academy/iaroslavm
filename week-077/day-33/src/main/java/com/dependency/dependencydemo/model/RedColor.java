package com.dependency.dependencydemo.model;

import com.dependency.dependencydemo.interfaces.MyColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedColor implements MyColor {

  @Autowired
  Printer printer;

  @Override
  public void printColor() {
    printer.log(RedColor.class.getSimpleName());
  }
}
