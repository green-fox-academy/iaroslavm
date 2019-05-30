package com.anothertry.demo.repository;

import com.anothertry.demo.model.Asignee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAsigneeRepository extends CrudRepository<Asignee,Long> {

  List<Asignee> findAll();
  Asignee findAllById(long id);

}
