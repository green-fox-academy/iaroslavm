package com.example.demo.service;

import com.example.demo.repository.BranchRepo;
import com.example.demo.repository.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BranchServiceImp implements IBranchService {

  @Autowired
  CompanyRepo companyRepo;

  @Autowired
  BranchRepo branchRepo;
}
