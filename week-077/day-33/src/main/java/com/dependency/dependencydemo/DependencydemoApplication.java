package com.dependency.dependencydemo;

import com.dependency.dependencydemo.interfaces.MyColor;
import com.dependency.dependencydemo.model.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencydemoApplication implements CommandLineRunner {

  @Autowired
  Printer printer;

  @Autowired
  MyColor myColor;

  public static void main(String[] args) {
    SpringApplication.run(DependencydemoApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    printer.log("first message from Command Line Runner");
    myColor.printColor();
  }
}
