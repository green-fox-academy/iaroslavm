package com.restexample.demo.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SithObject extends MessageObject {
  private String sith_text;

  public SithObject(String input){
    this.sith_text = swapWord(input);
  }

  public SithObject(){}

  public String swapWord(String input){
    List<String> lines = Arrays.asList(input.split("."));
    String str = "";
    for (String line : lines){
      List<String> stringList = new ArrayList<>();
      if(line.length() % 2 == 0) {
        String[] tempString = line.split(" ");
        for (int i = 0; i < tempString.length; i += 2) {
          stringList.add(i, tempString[i + 1]);
          stringList.add(i + 1, tempString[i]);
        }
      } else {
        String[] tempString = line.split(" ");
        for (int i = 0; i < tempString.length -1; i += 2) {
          stringList.add(i, tempString[i + 1]);
          stringList.add(i + 1, tempString[i]);
        }
        stringList.add(tempString.length-1, tempString[tempString.length-1]);
      }
      for(String each : stringList){
        str += each;
        str += " ";
      }
    }
    return str;
  }

  public String getSith_text() {
    return sith_text;
  }

  public void setSith_text(String sith_text) {
    this.sith_text = sith_text;
  }
}
