package com.foxtoy.foxtoydemo;

//import com.foxtoy.foxtoydemo.repository.IFoxRepository;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FoxtoydemoApplication implements CommandLineRunner {

//  @Autowired
//  IFoxRepository repository;

  public static void main(String[] args) {
    SpringApplication.run(FoxtoydemoApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {

  }
}
