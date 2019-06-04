package com.example.demo.model;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Company {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @OneToMany(fetch = FetchType.EAGER, mappedBy = "company")
  private List<Branch> branches = new ArrayList<>();
  private String name;
  private boolean isOil;
  private int yearFoundation;
  private int annualProfit;

  public Company(String name, boolean oil, int yearFoundation, int annualProfit) {
    this.name = name;
    this.isOil = oil;
    this.yearFoundation = yearFoundation;
    this.annualProfit = annualProfit;
  }
  public Company(){};

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public List<Branch> getBranches() {
    return branches;
  }

  public void setBranches(List<Branch> branches) {
    this.branches = branches;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isOil() {
    return isOil;
  }

  public void setOil(boolean oil) {
    isOil = oil;
  }

  public int getYearFoundation() {
    return yearFoundation;
  }

  public void setYearFoundation(int yearFoundation) {
    this.yearFoundation = yearFoundation;
  }

  public int getAnnualProfit() {
    return annualProfit;
  }

  public void setAnnualProfit(int annualProfit) {
    this.annualProfit = annualProfit;
  }
}