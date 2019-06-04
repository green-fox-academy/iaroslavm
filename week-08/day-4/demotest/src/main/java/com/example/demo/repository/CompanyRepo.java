package com.example.demo.repository;

import com.example.demo.model.Branch;
import com.example.demo.model.Company;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepo extends CrudRepository<Company, Long> {

  List<Company>  findByNameContaining(String name);


//  @Query("select company.name from company, branch where company.id=branch.company_id and branch.name like %?1")
//  List<Company>  findByBranchName(String name);

  List<Company> findAllByBranches(Branch branch);
  List<Company> findAllByBranchesName(String name);
  

  List<Company> findByNameEquals(String name);

  List<Company> findByIsOilTrue();
  List<Company> findByIsOilFalse();

  List<Company> findAll();
}
