package com.anothertry.demo.services;


import com.anothertry.demo.model.User;
import com.anothertry.demo.model.Todo;
import com.anothertry.demo.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

  @Autowired
  IUserRepository userRepository;

  @Override
  public List<User> findAll() {
    return userRepository.findAll();
  }

  @Override
  public void addUser(User thisUser) {
    userRepository.save(thisUser);
  }

  @Override
  public User findById(Long id) {
    return userRepository.findAllById(id);
  }

  @Override
  public void addTask(Todo todo) {
    userRepository.findAllById(todo.getUser().getId()).getTasks().add(todo);
  }

  @Override
  public void deleteByID(long id) {
    userRepository.deleteById(id);
  }

  @Override
  public void addUserList(Model model) {
    model.addAttribute("userList", userRepository.findAll());
  }


}
