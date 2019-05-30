package com.todoapps.todoapps;

import com.todoapps.todoapps.models.ToDo;
import com.todoapps.todoapps.repository.IToDoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoappsApplication implements CommandLineRunner {

  @Autowired
  IToDoRepository repository;

  public static void main(String[] args) {
    SpringApplication.run(TodoappsApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    repository.save(new ToDo("Eat lunch",true, false));
    repository.save(new ToDo("Make Photo",true, false));
    repository.save(new ToDo("Checkout",false, false));
  }
}
