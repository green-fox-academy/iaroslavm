package com.anothertry.demo.repository;

import com.anothertry.demo.model.Asignee;
import com.anothertry.demo.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITodoRepository extends CrudRepository<Todo,Long> {


//  List<Todo> findAllByDoneFalse();
//
//  List<Todo> findAllByDoneTrue();

  Todo findAllById(long id);

  List<Todo> findAll();


}
