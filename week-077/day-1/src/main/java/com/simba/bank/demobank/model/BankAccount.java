package com.simba.bank.demobank.model;

public class BankAccount {
  private String name = "Simba";
  private String animalType = "lion";
  private double balance = 2000;
  private int index;
  private static int indexID = 0;
  private boolean king;
  private String status;

  public BankAccount(String name, String animalType, double balance, String status) {
    this.animalType = animalType;
    this.balance = balance;
    this.name = name;
    this.index = indexID++;
    this.status = status;
  }

  public BankAccount() {
    this.index = indexID++;

  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getAnimalType() {
    return animalType;
  }

  public void setAnimalType(String animalType) {
    this.animalType = animalType;
  }

  public double getBalance() {
    return balance;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public int getIndex() {
    return index;
  }

  public void setIndex(int index) {
    this.index = index;
  }

  public static int getIndexID() {
    return indexID;
  }

  public static void setIndexID(int indexID) {
    BankAccount.indexID = indexID;
  }

  public boolean isKing() {
    return king;
  }

  public void setKing(boolean king) {
    this.king = king;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }
}
