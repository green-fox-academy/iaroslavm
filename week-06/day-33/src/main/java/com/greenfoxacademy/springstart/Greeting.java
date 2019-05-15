package com.greenfoxacademy.springstart;

public class Greeting {
  long id = 100;
  String content = "Good day, sir";

  public Greeting(long id, String content){
    this.id = id;
    this.content = content;
  }

  public Greeting(){
  }


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
}
