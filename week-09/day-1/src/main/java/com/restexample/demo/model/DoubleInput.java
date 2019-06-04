package com.restexample.demo.model;

import org.springframework.stereotype.Component;

import java.security.PublicKey;

public class DoubleInput extends MessageObject {
  Integer received;
  Integer result;

  public DoubleInput(){}

  public DoubleInput(Integer input){
    received = input;
    result = input * 2;
  }

  public Integer getReceived() {
    return received;
  }

  public void setReceived(Integer received) {
    this.received = received;
  }

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }
}
