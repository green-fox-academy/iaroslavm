package com.foxtoy.foxtoydemo.models;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FoxList {
  private List<GreenFox> listFoxes = new ArrayList<>();

  private static int foxCount = -1;

  public void addFox(String name){
    foxCount++;
    listFoxes.add(new GreenFox());
  }

  public List<GreenFox> getListFoxes() {
    return listFoxes;
  }

  public void setListFoxes(List<GreenFox> listFoxes) {
    this.listFoxes = listFoxes;
  }

  public static int getFoxCount() {
    return foxCount;
  }

  public static void setFoxCount(int foxCount) {
    FoxList.foxCount = foxCount;
  }
}
