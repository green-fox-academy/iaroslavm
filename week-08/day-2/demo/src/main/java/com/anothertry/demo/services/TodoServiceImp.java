package com.anothertry.demo.services;

import com.anothertry.demo.model.Todo;
import com.anothertry.demo.repository.ITodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TodoServiceImp implements TodoService {

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
      model.addAttribute("todos",

          findAll()
              .stream().
              filter(todo -> todo.getTitle()
                  .toLowerCase().contains(title.toLowerCase()) ||
                  todo.getDescription().toLowerCase().contains(title.toLowerCase()))
              .collect(Collectors.toList()));
    }
  }

  @Override
  public List<Todo> searchByUserID(Long id) {
    return repository.findAllByUser_Id(id);
  }

  @Override
  public boolean isActiveNotNull(String isActive) {
    return isActive != null;
  }

  @Override
  public boolean isKeywordNotNull(String keyWord) {
    return keyWord != null;
  }

  @Override
  public boolean isIdNotNull(Long id) {
    return id != null;
  }

  @Override
  public void generateIndexLayout(Model model, String isActive, String keyWord, Long id) {
    if (isActiveNotNull(isActive)) model.addAttribute("todos", findAll()
        .stream().filter(todo -> !todo.isDone()).collect(Collectors.toList()));

    if (isKeywordNotNull(keyWord)) model.addAttribute("todos", findAll()
        .stream()
        .filter(todo -> todo.getDescription().toLowerCase().contains(keyWord) || todo.getTitle().toLowerCase().contains(keyWord))
        .collect(Collectors.toList()));

    if (isIdNotNull(id))  {
      if(id != 0) model.addAttribute("todos", searchByUserID(id));
      else model.addAttribute("todos", findAll());
    }

    if (!isIdNotNull(id) & !isKeywordNotNull(keyWord) & !isActiveNotNull(isActive)) {
        model.addAttribute("todos", findAll());

    }
  }


//  @Override
//  public List<Todo> findAllByDone(int i) {
//    return repository.findAllByDoneIs(i);
//  }
}
