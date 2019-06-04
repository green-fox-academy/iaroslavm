package com.example.demo.service;

import com.example.demo.model.Company;
import com.example.demo.repository.BranchRepo;
import com.example.demo.repository.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;


@Service
public class CompanyServiceImp implements ICompanyService{

  @Autowired
  CompanyRepo companyRepo;

  @Autowired
  BranchRepo branchRepo;

  @Override
  public List<Company> findAll() {
    return companyRepo.findAll();
  }

  @Override
  public List<Company> selectedCompanyList(String search) {
    switch (search.toLowerCase()) {
      case "oil":
        return companyRepo.findByIsOilTrue();
        default:
          return findAll();
    }
  }

  @Override
  public List<Company> findBySearch(String search, String keyword) {
    if(search != null ) return selectedCompanyList(search);
    if(keyword != null ) return findbyKeyWord(keyword);
    else return findAll();
  }

  @Override
  public List<Company> findbyKeyWord(String keyWord) {
    return companyRepo.findByNameContaining(keyWord);
  }


}
