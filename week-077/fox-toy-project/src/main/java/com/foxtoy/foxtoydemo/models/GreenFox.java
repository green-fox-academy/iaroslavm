package com.foxtoy.foxtoydemo.models;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class GreenFox {
  private String name;
  private String food;
  private String drink;
  private List<String> triks = new ArrayList<>();
  private String newTrick;


  public GreenFox(String name){
    this.name = name;
  }

  public void learn(String trick){
    if(!this.getTriks().contains(trick)) {
      this.getTriks().add(trick);
    }
  }

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

  public String getNewTrick() {
    return newTrick;
  }

  public void setNewTrick(String newTrick) {
    this.newTrick = newTrick;
  }
}
