package com.anothertry.demo.model;

import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Entity
public class TestTodo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String name;
  @ColumnDefault(value = "false")
  private boolean isDone;
  @ColumnDefault(value = "false")
  private boolean isUrgent;

  public TestTodo(){ }


  public TestTodo(String title, boolean done, boolean urgent) {
    this.name = title;
    this.isDone = done;
    this.isUrgent = urgent;
  }

  public TestTodo(String title) {
    this.name = title;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return name;
  }

  public void setTitle(String title) {
    this.name = title;
  }

  public boolean isDone() {
    return isDone;
  }

  public void setDone(boolean done) {
    isDone = done;
  }

  public boolean isUrgent() {
    return isUrgent;
  }

  public void setUrgent(boolean urgent) {
    isUrgent = urgent;
  }
}
