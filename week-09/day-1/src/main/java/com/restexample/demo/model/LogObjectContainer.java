package com.restexample.demo.model;

import com.restexample.demo.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sun.rmi.runtime.Log;

import java.util.List;

@Component
public class LogObjectContainer {

  List<LogObject> entries;
  int entry_count;

  public LogObjectContainer(LogService logService){
    entries = logService.findAll();
    entry_count = entries.size();
  }




  public List<LogObject> getEntries() {
    return entries;
  }

  public void setEntries(List<LogObject> entries) {
    this.entries = entries;
  }

  public int getEntry_count() {
    return entry_count;
  }

  public void setEntry_count(int entry_count) {
    this.entry_count = entry_count;
  }
}
