package com.anothertry.demo.services;

import com.anothertry.demo.model.Asignee;

import java.util.List;

public interface AsService {

  List<Asignee> findAll();

  void addAsignee(Asignee thisAs);

  Asignee findById(Long id);

}
