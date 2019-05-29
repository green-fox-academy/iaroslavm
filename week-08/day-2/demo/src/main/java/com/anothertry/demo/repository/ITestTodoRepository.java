package com.anothertry.demo.repository;

import com.anothertry.demo.model.TestTodo;
import com.anothertry.demo.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITestTodoRepository extends CrudRepository<TestTodo,Long> {

}
