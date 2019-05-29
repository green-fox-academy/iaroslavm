package com.anothertry.demo;

import com.anothertry.demo.model.TestTodo;
import com.anothertry.demo.model.Todo;
import com.anothertry.demo.repository.ITestTodoRepository;
import com.anothertry.demo.repository.ITodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

  @Autowired
  ITodoRepository repository;

  public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
//    repository.save(new Todo("Make Photo",true,true));
//    repository.save(new Todo("Eat Lunch",true,true));
//    repository.save(new Todo("Check",true,true));
//    repository.save(new Todo("Rest",false,true));
//    repository.save(new Todo("Shop",false,false));

  }
}
