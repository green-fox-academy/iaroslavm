package com.example.demo;

import com.example.demo.model.Branch;
import com.example.demo.model.Company;
import com.example.demo.repository.BranchRepo;
import com.example.demo.repository.CompanyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

  @Autowired
  BranchRepo branchRepo;

  @Autowired
  CompanyRepo companyRepo;

  public static void main(String[] args)  {
    SpringApplication.run(DemoApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    System.out.println(companyRepo.findAllByBranches(branchRepo.findByNameContaining("first")).get(0).getName());
    System.out.println(companyRepo.findAllByBranchesName("first").get(0).getName());
//    companyRepo.save(new Company("Exxon", true, 1900, 1000));
//    companyRepo.save(new Company("KPMG", false,1990, 2000));
//    companyRepo.save(new Company("Gazprom", true, 1995, 2000));
//    companyRepo.save(new Company("Amazon", false, 1995, 2000));
//    companyRepo.save(new Company("Apple", false, 1980, 1500));
//    Company exxon = companyRepo.findByNameContaining("Exxon");
//    Company kpmg = companyRepo.findByNameEquals("kpmg");
//    Company gazprom = companyRepo.findByNameEquals("gazprom");
//    Company apple = companyRepo.findByNameEquals("apple");
//    Company amazon = companyRepo.findByNameEquals("amazon");
//
//
//
////    branchRepo.save(new Branch("First"));
//    Branch first = new Branch("First");
//    first.setSize(200);
////    branchRepo.findByNameContaining("First").setCompany(exxon);
//    first.setCompany(exxon);
//    //exxon.getBranches().add(branchRepo.findByNameContaining("First"));
//    exxon.getBranches().add(first);
//
//    //companyRepo.save(companyRepo.findByNameContaining("exxon"));
//    companyRepo.save(exxon);
//    //branchRepo.save(branchRepo.findByNameContaining("First"));
//    branchRepo.save(first);
//
//    Branch second = new Branch("Second");
//    second.setSize(500);
//    second.setCompany(gazprom);
//    gazprom.getBranches().add(second);
//    companyRepo.save(gazprom);
//    branchRepo.save(second);
//
//
//
//    branchRepo.save(new Branch("Third", exxon, 300));
//    Branch third = branchRepo.findByNameContaining("Third");
//    exxon.getBranches().add(third);
//    companyRepo.save(exxon);
//    branchRepo.save(third);
//
//
//
//    Branch fourth = new Branch("Fourth", kpmg, 500);
//    kpmg.getBranches().add(fourth);
//    companyRepo.save(kpmg);
//    branchRepo.save(fourth);
//
//    Branch fifth = new Branch("Fifth", apple, 200);
//    apple.getBranches().add(fifth);
//    companyRepo.save(apple);
//    branchRepo.save(fifth);
//
//    Branch sixth = new Branch("Sixth", amazon, 1000);
//    amazon.getBranches().add(sixth);
//    companyRepo.save(amazon);
//    branchRepo.save(sixth);
//
//    Branch seventh = new Branch("Seventh", amazon, 2000);
//    amazon.getBranches().add(seventh);
//    companyRepo.save(amazon);
//    branchRepo.save(seventh);
//
//
//
//    companyRepo.findByIsOilTrue().stream().forEach(com -> System.out.println("Oil company:" + com.getName()));
//    companyRepo.findByIsOilFalse().stream().forEach(com -> System.out.println("Non-Oil company:" + com.getName()));
//
//    branchRepo.findByCompanyNameContaining("Gazprom")
//        .stream().
//        forEach(branch -> System.out.println("Company name:" + branch.getCompany().getName() + ", Branch name: " + branch.getName()));
//
//    branchRepo.findByCompanyNameContaining("exxon")
//        .stream().
//        forEach(branch -> System.out.println("Company name:" + branch.getCompany().getName() + ", Branch name: " + branch.getName()));
//
//    companyRepo.findByNameContaining("exxon")
//        .getBranches()
//        .stream()
//        .forEach(branch -> System.out.println("Exxon's brach: " + branch.getName()));
//
//    companyRepo.findByNameContaining("amazon")
//        .getBranches()
//        .forEach(branch -> System.out.println(branch.getCompany().getName() + "'s branch: " + branch.getName()));
//
//    amazon.getBranches()
//        .forEach(branch -> System.out.println(branch.getCompany().getName() + "'s branch: " + branch.getName()));
//
//    exxon.getBranches()
//        .forEach(branch -> System.out.println(branch.getCompany().getName() + "'s branch: " + branch.getName()));
//

  }

}
