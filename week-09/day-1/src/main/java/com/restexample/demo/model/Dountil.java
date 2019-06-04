package com.restexample.demo.model;

public class Dountil extends MessageObject {
  private int result;

  public Dountil(String action, int until){
    if(action.toLowerCase().equals("sum")){
      this.result = getSum(until);
    }
    if(action.toLowerCase().equals("factor")) {
      this.result = getFactor(until);
    }
  }


  public int getSum(Integer until){
    int temp = 0;
    for(int i = 1; i <= until; i++){
      temp +=i;
    }
    return temp;
  }

  public int getFactor(Integer until){
    int temp = 1;
    for(int i = 1; i <= until; i++){
      temp *=i;
    }
    return temp;
  }


  public int getResult() {
    return result;
  }

  public void setResult(int result) {
    this.result = result;
  }
}
