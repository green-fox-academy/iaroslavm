package com.trialexam.trialexam.service;

import com.trialexam.trialexam.model.UrlClass;
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
  public boolean checkIfAliasExists(UrlClass urlObject) {
    List<String> listAliases = findAll()
        .stream()
        .map(UrlClass::getAlias).collect(Collectors.toList());
    if(listAliases.contains(urlObject.getAlias())) return true;
    else return false;
  }

  @Override
  public boolean checkIfAliasNameExists(String name) {
    List<String> listAliases = findAll()
        .stream()
        .map(UrlClass::getAlias).collect(Collectors.toList());
    if(listAliases.contains(name)) return true;
    else return false;
  }

  @Override
  public UrlClass findAllById(Long id) {
    return repository.findAllById(id);
  }

  @Override
  public UrlClass findByIdOrGenerateEmpty(Long id) {
    if(id == null) return new UrlClass();
    else return findAllById(id);
  }

  @Override
  public UrlClass findByAlias(String alias) {
    return repository.findByAlias(alias);
  }


}
