package com.restexample.demo.service;

import com.restexample.demo.model.LogObject;
import com.restexample.demo.repository.LogRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class LogServiceImp implements LogService {

  @Autowired
  LogRepository repository;

  public void add(String endpoint, String data){
    repository.save(new LogObject(endpoint, data));
  }

 public List<LogObject> findAll(){
    return repository.findAll();
 }


}
