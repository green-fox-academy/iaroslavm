package com.mygreenshop.mygreenshopdemo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MyShop {
  private String name;
  private List<ShopItem> shopItems = new ArrayList<>();

  public MyShop(){
    this.name = "My Green Shop";
    launchShop();
    stockUp();
  }

  public MyShop(String name){
    this.name = name;
    launchShop();
    stockUp();
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void launchShop(){
    shopItems.add(new Cola());
    shopItems.add(new Printer());
    shopItems.add(new Tshirt());
    shopItems.add(new Wokin());
    shopItems.add(new RunningShoes());
  }

//  public void stockUp(){
//        this.shopItems.forEach(ShopItem::buyMore());
//  }

  public void stockUp(){
    this.shopItems
        .forEach(item -> item.buyMore(10)); // why can't I use it with :: ? as above?
  }

  public List<ShopItem> availableOnly(){
    return shopItems
        .stream()
        .filter(item -> item.getQuantityOfStock() != 0)
        .collect(Collectors.toList());
  }

  public List<ShopItem> cheapFirst(){
    return shopItems
        .stream()
        .sorted(Comparator.naturalOrder()) // compareTo works only with ints
        .collect(Collectors.toList());
  }

  public List<ShopItem> nikeOnly(){
    return shopItems
        .stream()
        .filter(item -> item.getDescription().toLowerCase().contains("nike") | item.getName().toLowerCase().contains("nike"))
        .collect(Collectors.toList());
  }

  public double averageStock(){
    return shopItems
        .stream()
        .map(ShopItem::getQuantityOfStock)
        .mapToDouble(i -> i)
        .average()
        .orElse(Double.NaN);
  }

  public List<ShopItem> mostExpensiveName(){
    return shopItems
        .stream()
        .sorted(Comparator.reverseOrder())
        .limit(1)
        .collect(Collectors.toList());
  }

  public List<ShopItem> getShopItems() {
    return shopItems;
  }

  public void setShopItems(List<ShopItem> shopItems) {
    this.shopItems = shopItems;
  }
}
