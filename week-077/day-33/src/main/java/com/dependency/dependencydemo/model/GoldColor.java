package com.dependency.dependencydemo.model;

import com.dependency.dependencydemo.interfaces.MyColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@Service
public class GoldColor implements MyColor {

  @Autowired
  Printer printer;

  @Override
  public void printColor() {
    printer.log(GoldColor.class.getSimpleName());
  }
}
