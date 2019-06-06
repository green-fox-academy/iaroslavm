package com.trialexam.trialexam.controller;

import com.trialexam.trialexam.model.SecretCodeInput;
import com.trialexam.trialexam.model.UrlClass;
import com.trialexam.trialexam.model.UrlClassDTO;
import com.trialexam.trialexam.service.IUrlService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestHomeController {

  private IUrlService urlService;

  public RestHomeController(IUrlService urlService) {
    this.urlService = urlService;
  }

  @GetMapping("/api/links")
  public List<UrlClassDTO> getDb() {
    return urlService.returnAllUrlClassDto();
  }

  @PostMapping("/api/links/{id}")
  public ResponseEntity getDb(@RequestBody(required = false) SecretCodeInput secretCode, @PathVariable String id) {
    if (urlService.checkIfIdExists(id)) {
      if (urlService.checkIfIdMatchesSecretCode(id, secretCode.getSecretCode())) {
        urlService.deleteUrlClassbySecretCode(secretCode.getSecretCode());
        return new ResponseEntity(HttpStatus.OK);
      } else {
        return new ResponseEntity(HttpStatus.FORBIDDEN);
      }
    } else {
      return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
  }
}
