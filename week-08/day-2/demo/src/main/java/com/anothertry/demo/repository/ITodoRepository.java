package com.anothertry.demo.repository;

import com.anothertry.demo.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITodoRepository extends CrudRepository<Todo,Long> {

}
