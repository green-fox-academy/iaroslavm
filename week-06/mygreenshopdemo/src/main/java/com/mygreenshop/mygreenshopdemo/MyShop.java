package com.mygreenshop.mygreenshopdemo;

public class MyShop {
  private String name;

  public MyShop(){
    this.name = "My Green Shop";
  }

  public MyShop(String name){
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
