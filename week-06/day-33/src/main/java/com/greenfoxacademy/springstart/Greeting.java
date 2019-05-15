package com.greenfoxacademy.springstart;

import java.util.concurrent.atomic.AtomicLong;

public class Greeting {
  String content = "Good day, sir";
  private static AtomicLong id = new AtomicLong(); // why it starts from n+1??


  public Greeting(String content){
    this.content = content;
  }

  public Greeting(){
  }


  public AtomicLong getId() {
    return id;
  }

  public void setId(AtomicLong id) {
    this.id = id;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }
}
