package com.anothertry.demo.services;

import com.anothertry.demo.model.Todo;
import com.anothertry.demo.repository.ITodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import java.util.List;

public interface IService {


  List<Todo> findAll();

  void save(Todo todo);

  void deleteById(long id);

  Todo findById(long id);




  void search(String title, Model model);

//  void active(String isActive, Model model);

}
