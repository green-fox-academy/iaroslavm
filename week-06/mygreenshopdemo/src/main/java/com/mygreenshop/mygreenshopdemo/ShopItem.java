package com.mygreenshop.mygreenshopdemo;

public abstract class ShopItem implements Comparable<ShopItem>{
  protected String name;
  protected String description;
  protected double price;
  protected int quantityOfStock;

  public ShopItem(){
  }


  public ShopItem(String name,
                  String description,
                  double price,
                  int quantityOfStock){
    this.name = name;
    this.description = description;
    this.quantityOfStock = quantityOfStock;
    this.price = price;
  }

  public void buyMore(){
    this.quantityOfStock++;
  }

  public void buyMore(int amount){
    this.quantityOfStock += amount;
  }

  public void sell(){
    this.quantityOfStock--;
  }

  public void sell(int amount){
    this.quantityOfStock -= amount;
  }

  public int compareTo(ShopItem other){
    if(this.price > other.getPrice()) {
      return 1;
    } else if (this.price < other.getPrice()) {
      return -1;
    }
    return 0;
  }



  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQuantityOfStock() {
    return quantityOfStock;
  }

  public void setQuantityOfStock(int quantityOfStock) {
    this.quantityOfStock = quantityOfStock;
  }
}
