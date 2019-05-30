package com.anothertry.demo.services;


import com.anothertry.demo.model.Asignee;
import com.anothertry.demo.repository.IAsigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsServiceImp implements AsService {

  @Autowired
  IAsigneeRepository asrepository;

  @Override
  public List<Asignee> findAll() {
    return asrepository.findAll();
  }

  @Override
  public void addAsignee(Asignee thisAs) {
    asrepository.save(thisAs);
  }

  @Override
  public Asignee findById(Long id) {
    return asrepository.findAllById(id);
  }

}
