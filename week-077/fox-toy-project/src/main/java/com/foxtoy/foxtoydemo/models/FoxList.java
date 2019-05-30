package com.foxtoy.foxtoydemo.models;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FoxList {
  private List<GreenFox> listFoxes = new ArrayList<>();
  private List<String> listFoxesNames = new ArrayList<>();


  public FoxList(){}


  public List<GreenFox> getListFoxes() {
    return listFoxes;
  }

  public void setListFoxes(List<GreenFox> listFoxes) {
    this.listFoxes = listFoxes;
  }


  public List<String> getListFoxesNames() {
    return listFoxesNames;
  }

  public void setListFoxesNames(List<String> listFoxesNames) {
    this.listFoxesNames = listFoxesNames;
  }
}
