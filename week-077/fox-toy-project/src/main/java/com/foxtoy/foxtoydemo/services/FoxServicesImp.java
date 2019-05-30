package com.foxtoy.foxtoydemo.services;

import com.foxtoy.foxtoydemo.models.FoxList;
import com.foxtoy.foxtoydemo.models.GreenFox;
//import com.foxtoy.foxtoydemo.repository.IFoxRepository;
import com.foxtoy.foxtoydemo.models.ExtraList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FoxServicesImp {

  @Autowired
  FoxList foxList;

  @Autowired
  ExtraList extraList;

//  @Autowired
//  IFoxRepository repository;

  public void addFox(String name){
    foxList.getListFoxes().add(new GreenFox(name));
  }

  public List<GreenFox> getFoxesList() {
    return foxList.getListFoxes();
  }

  public GreenFox foxCheck(String name){
    return getFoxesList()
        .stream().
            filter(fox -> fox.getName().toLowerCase().equals(name.toLowerCase()))
        .findFirst().orElse(new GreenFox("PlaceHolder"));
  }

  public String register(String name){
    if(!loginCheck(name)) {
      addFox(name.toUpperCase());
//      repository.save(new GreenFox(name.toUpperCase()));
    }
    return name;
  }

  public boolean loginCheck(String name){
    return getFoxesList()
        .stream().map(x -> x.getName().toLowerCase())
        .collect(Collectors.toList()).contains(name.toLowerCase());
  }

  public void updateFoxFood(GreenFox fox){
    getFoxesList()
        .stream()
        .filter(x -> x.getName().toLowerCase().equals(fox.getName().toLowerCase()))
        .forEach(x -> x.setDrink(fox.getDrink()));
    getFoxesList()
        .stream()
        .filter(x -> x.getName().toLowerCase().equals(fox.getName().toLowerCase()))
        .forEach(x -> x.setFood(fox.getFood()));
//    repository.save(fox);
  }

  public void learnTricks(GreenFox fox){
    getFoxesList()
        .stream()
        .filter(x -> x.getName().toLowerCase().equals(fox.getName().toLowerCase()))
        .forEach(x -> x.learn(fox.getNewTrick()));
//    repository.save(fox);
  }

  public List<String> getTricks() {
    return extraList.getTrickList();
  }


  public List<String> getFoods() {
    return extraList.getFoodList();
  }


  public List<String> getDrinks() {
    return extraList.getDrinkList();
  }

}
