package com.restexample.demo.model;

import java.util.ArrayList;

public class ArraysObject extends MessageObject {
  Object result;

  public ArraysObject(String what, ArrayList<Integer> array){
    if(what.toLowerCase().equals("sum")){

      this.result = sum(array);
    }
    if(what.toLowerCase().equals("multiply")){
      this.result = product(array);
    }
    if(what.toLowerCase().equals("double")){
      this.result = new ArrayList<>();
      this.result = doubling(array);
    }
  }

  public Integer sum(ArrayList<Integer> array){
    return array.stream().mapToInt(i -> i).sum();
  }

  public Integer product(ArrayList<Integer> array){
    return  array.stream().reduce(1, (a, b) -> a * b);
  }

  public ArrayList<Integer> doubling(ArrayList<Integer> array){
    ArrayList<Integer> newArray = new ArrayList<>();
    for(Integer each : array){
      newArray.add(each*2);
    }
    return newArray;

  }

  public Object getResult() {
    return result;
  }

  public void setResult(Object result) {
    this.result = result;
  }
}
