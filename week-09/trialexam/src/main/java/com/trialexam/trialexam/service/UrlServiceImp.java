package com.trialexam.trialexam.service;

import com.trialexam.trialexam.model.UrlClass;
import com.trialexam.trialexam.model.UrlClassDTO;
import com.trialexam.trialexam.repository.UrlRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UrlServiceImp implements IUrlService {

  private UrlRepository repository;

  public UrlServiceImp(UrlRepository repository){
    this.repository = repository;
  }


  public void save(UrlClass urlObject){
    repository.save(urlObject);
  }

  @Override
  public List<UrlClass> findAll() {
    return repository.findAll();
  }


  @Override
  public boolean checkIfAliasNameExists(String name) {
    List<String> listAliases = findAll()
        .stream()
        .map(UrlClass::getAlias).collect(Collectors.toList());
    return listAliases.contains(name);
  }

  @Override
  public boolean checkIfIdExists(String id) {
    List<Long> listID = findAll()
        .stream()
        .map(UrlClass::getId)
        .collect(Collectors.toList());
    return listID.contains(Long.parseLong(id));
  }

  @Override
  public UrlClass findAllById(String id) {
    return repository.findAllById(Long.parseLong(id));
  }


  @Override
  public UrlClass findByAlias(String alias) {
    return repository.findByAlias(alias);
  }

  @Override
  public List<UrlClassDTO> returnAllUrlClassDto(){
    return findAll()
        .stream()
        .map(object -> new UrlClassDTO(object.getId(), object.getUrl(), object.getAlias(), object.getHitCount()))
        .collect(Collectors.toList());
  }

  @Override
  public void deleteUrlClassbySecretCode(String secretCode) {
    repository.findBySecretCode(secretCode);
    repository.delete(repository.findBySecretCode(secretCode));
  }

  @Override
  public boolean checkIfIdMatchesSecretCode(String id, String secretCode) {
    UrlClass urlObject = findAllById(id);
    return urlObject.getSecretCode().equals(secretCode);
  }

}

