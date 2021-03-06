package com.anothertry.demo.services;

import com.anothertry.demo.model.Todo;
import com.anothertry.demo.repository.ITodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import java.util.List;

public interface TodoService {


  List<Todo> findAll();

  void save(Todo todo);

  void deleteById(long id);

  Todo findById(long id);

  void search(String title, Model model);

  List<Todo> searchByUserID(Long id);

  boolean isActiveNotNull(String isActive);

  boolean isKeywordNotNull(String keyWord);

  boolean isIdNotNull(Long id);

  void generateIndexLayout(Model model, String isActive, String keyWord, Long id);

//  List<Todo> findAllByDone(int i);

//  void active(String isActive, Model model);

}
