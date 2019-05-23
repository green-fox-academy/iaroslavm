package com.simba.bank.demobank.model;

import java.util.ArrayList;
import java.util.List;

public class BigBank {
  List<BankAccount> bankAccounts = new ArrayList<>();

  public BigBank() {
    bankAccounts.add(new BankAccount("Simba", "lion", 2000, "good"));
    bankAccounts.add(new BankAccount("Aladin", "homo sapiens", 10, "good"));
    bankAccounts.add(new BankAccount("Belle", "homo sapiens", 500, "good"));
    bankAccounts.add(new BankAccount("Balu", "bear", 20, "good"));
    bankAccounts.add(new BankAccount("Beast", "neanderthal", 1500, "good"));
    bankAccounts.add(new BankAccount("Grumpy", "gnome", 200, "good"));
    bankAccounts.add(new BankAccount("Timon", "mangust", 10, "good"));
    bankAccounts.add(new BankAccount("Pumba", "hog", 10, "good"));
    bankAccounts.add(new BankAccount("Jafar", "homo sapiens", 1000, "bad"));
    bankAccounts.add(new BankAccount("Scar", "lion", 200, "bad"));
    bankAccounts.add(new BankAccount("Guston", "homo sapiens", 200, "bad"));
    bankAccounts.add(new BankAccount("Lefou", "homo sapiens", 50, "neutral"));
  }

  public void addAccount(BankAccount newAccount) {
    bankAccounts.add(newAccount);
  }

  public List<BankAccount> getBankAccounts() {
    return bankAccounts;
  }

  public void setBankAccounts(List<BankAccount> bankAccounts) {
    this.bankAccounts = bankAccounts;
  }
}
