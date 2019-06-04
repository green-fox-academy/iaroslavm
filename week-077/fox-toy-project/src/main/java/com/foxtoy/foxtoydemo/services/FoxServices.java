package com.foxtoy.foxtoydemo.services;

import com.foxtoy.foxtoydemo.models.GreenFox;

import java.util.List;
import java.util.stream.Collectors;

public interface FoxServices {

  void addFox(String name);

  List<GreenFox> getFoxesList();

  GreenFox foxCheck(String name);

  String register(String name);

  boolean loginCheck(String name);

  void updateFoxFood(GreenFox fox);

  void learnTricks(GreenFox fox);


  List<String> getTricks();


  List<String> getFoods();


  List<String> getDrinks();
}
