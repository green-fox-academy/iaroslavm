package com.anothertry.demo.repository;

import com.anothertry.demo.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IUserRepository extends CrudRepository<User,Long> {

  List<User> findAll();
  User findAllById(long id);

  User findByName(String name);

}
