package com.foxtoy.foxtoydemo.models;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ExtraList {
  List<String> trickList = Arrays.asList("Speak latin","Sick burns","Time management", "Backflip");
  List<String> foodList = Arrays.asList("Pizza","Pasta","Lasagnia", "Langos");
  List<String> drinkList = Arrays.asList("Lemonade","Juice","Water","Red Bull");

  public List<String> getTrickList() {
    return trickList;
  }

  public void setTrickList(List<String> trickList) {
    this.trickList = trickList;
  }

  public List<String> getFoodList() {
    return foodList;
  }

  public void setFoodList(List<String> foodList) {
    this.foodList = foodList;
  }

  public List<String> getDrinkList() {
    return drinkList;
  }

  public void setDrinkList(List<String> drinkList) {
    this.drinkList = drinkList;
  }
}
