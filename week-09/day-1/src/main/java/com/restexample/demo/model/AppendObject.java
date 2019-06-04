package com.restexample.demo.model;

public class AppendObject extends MessageObject {
  private String appended;

  public AppendObject(String appendable){
    this.appended = appendable + "a";
  }

  public String getAppended() {
    return appended;
  }

  public void setAppended(String appended) {
    this.appended = appended;
  }
}
