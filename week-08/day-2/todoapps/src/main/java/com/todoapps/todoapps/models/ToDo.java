package com.todoapps.todoapps.models;

import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;

@Entity
@Table(name="ToDo")
public class ToDo {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(nullable = false)
  private long id;
  private String title;
  @ColumnDefault(value = "false")
  private boolean isUrgent;
  @ColumnDefault(value = "false")
  private boolean isDone;

  public ToDo(String title){
    this.title = title;
  }

  public ToDo(String title, boolean done, boolean urgent){
    this.title = title;
    this.isDone = done;
    this.isUrgent = urgent;
  }

  public ToDo(){
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

  public boolean isUrgent() {
    return isUrgent;
  }

  public void setUrgent(boolean urgent) {
    isUrgent = urgent;
  }

  public boolean isDone() {
    return isDone;
  }

  public void setDone(boolean done) {
    isDone = done;
  }
}


