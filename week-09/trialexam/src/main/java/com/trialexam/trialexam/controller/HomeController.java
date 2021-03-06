package com.trialexam.trialexam.controller;

import com.trialexam.trialexam.model.UrlClass;
import com.trialexam.trialexam.service.IUrlService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Random;

@Controller
public class HomeController {

  private IUrlService urlService;

  public HomeController(IUrlService urlService) {
    this.urlService = urlService;
  }

  @GetMapping("/")
  public String getIndex(Model model, String urlName, String aliasName, String newUrlID){
    if(urlName == null & newUrlID == null){
      return "index";
    } else if (newUrlID != null){
      model.addAttribute("aliasName", urlService.findAllById(newUrlID).getAlias());
      model.addAttribute("codeName", urlService.findAllById(newUrlID).getSecretCode());
      return "index";
    } else {
      model.addAttribute("existingUrlName",urlName);
      model.addAttribute("existingAliasName",aliasName);
      return "index";
    }
  }

  @PostMapping("/save-link")
  public String saveLink(String urlName, String aliasName){
    if(urlService.checkIfAliasNameExists(aliasName)){
      return "redirect:/?urlName="
          + urlName
          + "&aliasName="
          + aliasName;
    } else {
      UrlClass newUrlObject = new UrlClass();
      newUrlObject.setSecretCode(
          String.format("%04d", new Random().nextInt(10000)));
      newUrlObject.setUrl(urlName);
      newUrlObject.setAlias(aliasName);
      urlService.save(newUrlObject);
      return "redirect:/?newUrlID=" + newUrlObject.getId();
    }
  }

  @GetMapping("/a/{alias}")
  public ResponseEntity getURL(@PathVariable String alias) {
    if (urlService.checkIfAliasNameExists(alias)) {
      UrlClass urlObject = urlService.findByAlias(alias);
      String urlString = urlObject.getUrl();
      urlObject.incrementHitCount();
      urlService.save(urlObject);
      HttpHeaders headers = new HttpHeaders();
      headers.add("Location", urlString);
      return new ResponseEntity<String>(headers, HttpStatus.FOUND);
    } else return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }


  @GetMapping("/test")
  public String getURLTest(){
    return "redirect:https://football.ua/";
  }

}

