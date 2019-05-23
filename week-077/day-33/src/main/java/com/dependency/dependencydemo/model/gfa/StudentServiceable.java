package com.dependency.dependencydemo.model.gfa;

import java.util.List;

public interface StudentServiceable {

  public List<String> findAll();

  public void save(String student);

  public boolean check(String student);
}
