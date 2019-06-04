package com.example.demo.model;

import sun.jvm.hotspot.memory.Generation;

import javax.persistence.*;

@Entity
public class Branch {


  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @ManyToOne
//  @JoinColumn(name = "companyId")
  private Company company;
  private String name;
  private int size;

  public Branch(){}

  public Branch(String name){
    this.name = name;
  }

  public Branch(String name, Company company, int size){
    this.name = name;
    this.company = company;
    this.size = size;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Company getCompany() {
    return company;
  }

  public void setCompany(Company company) {
    this.company = company;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSize() {
    return size;
  }

  public void setSize(int size) {
    this.size = size;
  }
}