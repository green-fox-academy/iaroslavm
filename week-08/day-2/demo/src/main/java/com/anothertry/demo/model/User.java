package com.anothertry.demo.model;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String name;
  private String email;
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
  private List<Todo> tasks = new ArrayList<>();


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public List<Todo> getTasks() {
    return tasks;
  }

  public void setTasks(List<Todo> tasks) {
    this.tasks = tasks;
  }
}
