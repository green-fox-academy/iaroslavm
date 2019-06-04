package com.restexample.demo.model;

public class ErrorObject extends MessageObject {
  private String error;

  public ErrorObject(String error){
    this.error = error;
  }

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }
}
