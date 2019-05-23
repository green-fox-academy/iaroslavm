package com.greenfoxtoy.y.controllers;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class GreenFox {
  private String name;
  private String food;
  private String drink;
  private List<String> triks = new ArrayList<>();

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getFood() {
    return food;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    this.drink = drink;
  }

  public List<String> getTriks() {
    return triks;
  }

  public void setTriks(List<String> triks) {
    this.triks = triks;
  }
}
