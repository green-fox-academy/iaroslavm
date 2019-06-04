package com.example.demo.service;

import com.example.demo.model.Company;
import com.example.demo.repository.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import java.util.List;

public interface ICompanyService {

  List<Company> findAll();

  List<Company> selectedCompanyList(String search);

  List<Company> findBySearch(String search, String keyword);

  List<Company> findbyKeyWord(String keyWord);

}
