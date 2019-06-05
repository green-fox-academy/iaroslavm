package com.trialexam.trialexam.controller;

import com.trialexam.trialexam.model.UrlClass;
import com.trialexam.trialexam.model.UrlClassDTO;
import com.trialexam.trialexam.service.IUrlService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestHomeController {

  private IUrlService urlService;

  public RestHomeController(IUrlService urlService) {
    this.urlService = urlService;
  }

  @GetMapping("/api/links")
  public List<UrlClassDTO> getDb(){
    return urlService.returnAllUrlClassDto();
  }

//  @PostMapping("/api/links/{id}")
//  public void getDb(String secretCode, @PathVariable Long id){
//    if(urlService.checkIfIdExists(id)) {
//      if(urlService.checkIfIdMatchesSecretCode(id, secretCode)) {
//        UrlClass urlObject = urlService.findAllById(id);
//        urlService.deleteUrlClassbySecretCode(secretCode);
//      } else ;
//    } esle;
//  }
}
