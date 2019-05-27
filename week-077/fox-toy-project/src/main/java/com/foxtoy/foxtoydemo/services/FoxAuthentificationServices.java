package com.foxtoy.foxtoydemo.services;

import com.foxtoy.foxtoydemo.models.FoxList;
import com.foxtoy.foxtoydemo.models.GreenFox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.Collections;
import java.util.stream.Collectors;

@Service
public class FoxAuthentificationServices {

  @Autowired
  FoxList foxList;

  @Autowired
  FoxAuthentificationServices foxSerives;

//  public GreenFox foxCheck(String name){
//    for (GreenFox each : foxList.getListFoxes()){
//      if (each.getName().toLowerCase().equals(name.toLowerCase())){
//        return each;
//      }
//    }
//    return new GreenFox("PlaceHolder");
//  }

  public GreenFox foxCheck(String name){
    return foxList.getListFoxes()
        .stream().
            filter(fox -> fox.getName().toLowerCase().equals(name.toLowerCase()))
        .findFirst().orElse(new GreenFox("PlaceHolder"));
  }

  public String register(String name){
    if(!loginCheck(name)) {
      foxList.addFox(name);
    }
    return name;
  }

  public boolean loginCheck(String name){
    return foxList.getListFoxesNames()
        .stream().map(x -> x.toLowerCase())
        .collect(Collectors.toList()).contains(name.toLowerCase());
  }

  public void updateFoxFood(GreenFox fox){
    foxList.getListFoxes()
        .stream()
        .filter(x -> x.getName().toLowerCase().equals(fox.getName().toLowerCase()))
        .forEach(x -> x.setDrink(fox.getDrink()));
    foxList.getListFoxes()
        .stream()
        .filter(x -> x.getName().toLowerCase().equals(fox.getName().toLowerCase()))
        .forEach(x -> x.setFood(fox.getFood()));
  }

  public void learnTricks(GreenFox fox){
    foxList.getListFoxes()
        .stream()
        .filter(x -> x.getName().toLowerCase().equals(fox.getName().toLowerCase()))
        .forEach(x -> x.learn(fox.getNewTrick()));
  }



}
