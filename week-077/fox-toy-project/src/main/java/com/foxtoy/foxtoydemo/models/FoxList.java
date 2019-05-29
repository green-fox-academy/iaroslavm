package com.foxtoy.foxtoydemo.models;

import com.foxtoy.foxtoydemo.services.FoxAuthentificationServices;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class FoxList {
  private List<GreenFox> listFoxes = new ArrayList<>();
  private List<String> listFoxesNames = new ArrayList<>();


  public FoxList(){}

  public void addFox(String name){
    listFoxes.add(new GreenFox(name));
  }

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
