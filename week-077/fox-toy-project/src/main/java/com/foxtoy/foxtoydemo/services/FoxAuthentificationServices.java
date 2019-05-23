package com.foxtoy.foxtoydemo.services;

import com.foxtoy.foxtoydemo.models.FoxList;
import com.foxtoy.foxtoydemo.models.GreenFox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FoxAuthentificationServices {

  @Autowired
  FoxList foxList;

  public GreenFox indexPageCheck(String name){
    GreenFox thisFox = new GreenFox();
    for(GreenFox each : foxList.getListFoxes()){
      if (each.getName().toLowerCase().equals(name.toLowerCase())) {
        thisFox = each;
      }
    }
    return thisFox;
  }
}
