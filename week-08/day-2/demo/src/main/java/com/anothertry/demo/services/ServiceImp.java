package com.anothertry.demo.services;

import com.anothertry.demo.model.Todo;
import com.anothertry.demo.repository.ITodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ServiceImp implements IService {

  @Autowired
  ITodoRepository repository;


  @Override
  public List<Todo> findAll() {
    return repository.findAll();
  }

  @Override
  public void save(Todo todo) {
    repository.save(todo);
  }

  @Override
  public void deleteById(long id) {
    repository.deleteById(id);
  }

  @Override
  public Todo findById(long id) {
    return repository.findAllById(id);
  }


  @Override
  public void search(String title, Model model) {
    if (title != null) {
      model.addAttribute("todos", findAll().stream().filter(todo -> todo.getTitle().toLowerCase().contains(title.toLowerCase()) ||
          todo.getDescription().toLowerCase().contains(title.toLowerCase())).collect(Collectors.toList()));
    }
  }

}
