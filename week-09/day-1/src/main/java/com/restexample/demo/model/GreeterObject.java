package com.restexample.demo.model;


import javax.persistence.Entity;

public class GreeterObject extends MessageObject{
  public String welcome_message;


  public GreeterObject(){}

  public GreeterObject(String name, String title){
    this.welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
  }

  public String getWelcome_message() {
    return welcome_message;
  }

  public void setWelcome_message(String welcomeMessage) {
    this.welcome_message = welcomeMessage;
  }
}
