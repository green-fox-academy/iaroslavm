package com.foxtoy.foxtoydemo.models;

import org.springframework.stereotype.Component;

import java.sql.SQLOutput;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;


public class GreenFox {
  private String name;
  private String food = "PIZZA";
  private String drink = "LEMONADE";
  private List<String> triks = new ArrayList<>();
  private String newTrick;
  private List<String> history = new ArrayList<>();
  DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");


  public GreenFox(String name){
    this.name = name;
    Date date = Calendar.getInstance().getTime();
    history.add(dateFormat.format(date) + " : " + this.name + " registered at the Fox Club" );
  }

  public GreenFox(String [] data){
    this.name = data[0];
    this.food = data[1];
    this.drink = data[2];
    this.triks = Arrays.asList(data[3]);
    this.history = Arrays.asList(data[4]);
  }

  public GreenFox(){}

  public void learn(String trick){
    if(!this.getTriks().contains(trick)) {
      this.getTriks().add(trick);
    }
    Date date = Calendar.getInstance().getTime();
    history.add(dateFormat.format(date) + " : " + this.name + " learned the art of " + trick);
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
    String tempFood = this.food;
    Date date = Calendar.getInstance().getTime();
    if(!this.food.equals(food)) {
      history.add(dateFormat.format(date) + " : " + this.name + " changed food from " + tempFood + " to " + food);
      this.food = food;
    }

  }

  public String getDrink() {
    return drink;
  }

  public void setDrink(String drink) {
    String tempDrink = this.drink;
    Date date = Calendar.getInstance().getTime();
    if(!this.drink.equals(drink)) {
      history.add(dateFormat.format(date) + " : " + this.name + " changed drink from " + tempDrink + " to " + drink);
      this.drink = drink;
    }
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

  public List<String> getHistory() {
    return history;
  }

  public List<String> getShortReverseHistory() {
    return history.stream().sorted(Comparator.reverseOrder()).limit(5).collect(Collectors.toList());
  }

  public void setHistory(List<String> history) {
    this.history = history;
  }

  public DateFormat getDateFormat() {
    return dateFormat;
  }

  public void setDateFormat(DateFormat dateFormat) {
    this.dateFormat = dateFormat;
  }
}
