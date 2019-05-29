package com.todoapplication.newapplication.model;

public class Todo {

  private long id;
  private String title;
  private boolean isDone;
  private boolean isUrgent;

  public Todo(){}

  public Todo(String title, boolean done, boolean urgent){
    this.title = title;
    this.isDone = done;
    this.isUrgent = urgent;
  }
}
