package com.example.demo.repository;

import com.example.demo.model.Branch;
import com.example.demo.model.Company;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BranchRepo extends CrudRepository<Branch, Long> {

  Branch findByNameContaining(String name);

  Branch findByNameEquals(String name);

  List<Branch> findByCompanyNameContaining(String companyName);

}
