package com.anothertry.demo.services;

import com.anothertry.demo.model.User;
import com.anothertry.demo.model.Todo;

import java.util.List;

public interface UserService {

  List<User> findAll();

  void addUser(User thisUser);

  User findById(Long id);

  void addTask(Todo todo);

  void deleteByID(long id);

}
