package com.anothertry.demo.model;

import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Entity
public class Todo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String title;
  private String description;
  @ColumnDefault(value = "false")
  private boolean isDone;
  @ColumnDefault(value = "false")
  private boolean isUrgent;

  public Todo(){ }


  public Todo(String title, boolean done, boolean urgent, String description) {
    this.title = title;
    this.isDone = done;
    this.isUrgent = urgent;
    this.description = description;
  }

  public Todo(String title) {
    this.title = title;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
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

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
