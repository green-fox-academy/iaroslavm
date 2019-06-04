package com.restexample.demo.repository;

import com.restexample.demo.model.LogObject;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface LogRepository extends CrudRepository<LogObject, Long> {

  List<LogObject> findAll();
}
