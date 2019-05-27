package com.foxtoy.foxtoydemo.services;

import ch.qos.logback.classic.pattern.SyslogStartConverter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.foxtoy.foxtoydemo.models.FoxList;
import com.foxtoy.foxtoydemo.models.GreenFox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SaveService {
  String filePath;

  @Autowired
  FoxList foxList;



  public void createFile(String path){
     this.filePath = path;
    try {
      FileWriter write = new FileWriter(filePath);
    } catch (IOException e) {
      System.out.println("Cannot create file");
      e.printStackTrace();
    }
  }

  public void saveFile(String path) {
    List<String> dataList = new ArrayList<>();

    for (GreenFox each : foxList.getListFoxes()){
      StringBuilder data = new StringBuilder();
      data.append(each.getName());
      data.append(";");
      data.append(each.getFood());
      data.append(";");
      data.append(each.getDrink());
      data.append(";");
      data.append(each.getTriks());
      data.append(";");
      data.append(each.getHistory());
      data.append(";");
      dataList.add(data.toString());
    }

    try {
      Files.write(Paths.get(path), dataList);
    } catch (IOException e) {
      System.out.println("Cannot write the file");
      e.printStackTrace();
    }
  }

  public List<String> loadData(String str){
    try {
     return Files
          .lines(Paths.get(str))
          .collect(Collectors.toList());
    } catch (IOException e) {
      e.printStackTrace();
      return new ArrayList<>();
    }
  }

//  public void restoreData(String str){
//    for (String each : loadData(str)){
//      foxList.getListFoxes().add(new GreenFox(each.split(";")));
//    }
//
//
//  }
}
