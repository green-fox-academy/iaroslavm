package com.dependency.dependencydemo.model.gfa;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Service
@Qualifier("textwriter")
public class StudentServiceText implements StudentServiceable {

  String path;
  ArrayList<String> names;

  public StudentServiceText() {
    path = "names.txt";
    try {
      FileWriter write = new FileWriter(path);
    } catch (IOException e) {
      System.out.println("Cannot create file");
      e.printStackTrace();
    }
    names = new ArrayList<>();
    names.add("Sanyi");
    names.add("Lilla");
    names.add("John");
  }


  @Override
  public List<String> findAll() {
    return names;
  }

  @Override
  public void save(String student) {
    names.add(student);

    try {
      Files.write(Paths.get(path), names);
    } catch (IOException e) {
      System.out.println("Cannot write the file");
      e.printStackTrace();
    }

  }

  @Override
  public boolean check(String student) {
    return names.contains(student);
  }
}
