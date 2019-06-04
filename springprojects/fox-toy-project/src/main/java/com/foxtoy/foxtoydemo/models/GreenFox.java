package com.foxtoy.foxtoydemo.models;

import org.springframework.stereotype.Component;

//import javax.persistence.*;
import java.sql.SQLOutput;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

//@Entity
public class GreenFox {

//  @Id
//  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String name;
  private String food = "PIZZA";
  private String drink = "LEMONADE";
//  @Column
//  @ElementCollection(targetClass=String.class)
  private List<String> tricks = new ArrayList<>();
  private String newTrick;
//  @Column
//  @ElementCollection(targetClass=String.class)
  private List<String> history = new ArrayList<>();



  public GreenFox(String name){
    DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
    this.name = name;
    Date date = Calendar.getInstance().getTime();
    history.add(dateFormat.format(date) + " : " + this.name + " registered at the Fox Club" );
  }

//  public GreenFox(String [] data){
//    this.name = data[0];
//    this.food = data[1];
//    this.drink = data[2];
//    this.tricks = Arrays.asList(data[3]);
//    this.history = Arrays.asList(data[4]);
//  }

  public GreenFox(){}

  public void learn(String trick){
    DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
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
    DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
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
    DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
    String tempDrink = this.drink;
    Date date = Calendar.getInstance().getTime();
    if(!this.drink.equals(drink)) {
      history.add(dateFormat.format(date) + " : " + this.name + " changed drink from " + tempDrink + " to " + drink);
      this.drink = drink;
    }
  }

  public List<String> getTriks() {
    return tricks;
  }

  public void setTriks(List<String> triks) {
    this.tricks = triks;
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

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }
}
