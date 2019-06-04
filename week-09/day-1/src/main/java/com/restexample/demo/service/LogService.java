package com.restexample.demo.service;

import com.restexample.demo.model.LogObject;

import java.util.Date;
import java.util.List;

public interface LogService {

  void add(String endpoint, String data);

  List<LogObject> findAll();

}
