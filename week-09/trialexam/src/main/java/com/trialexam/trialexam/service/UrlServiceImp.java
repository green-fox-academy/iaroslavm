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
  public boolean checkIfAliasExists(UrlClass urlObject) {
    List<String> listAliases = findAll()
        .stream()
        .map(UrlClass::getAlias).collect(Collectors.toList());
   return listAliases.contains(urlObject.getAlias());
  }

  @Override
  public boolean checkIfAliasNameExists(String name) {
    List<String> listAliases = findAll()
        .stream()
        .map(UrlClass::getAlias).collect(Collectors.toList());
    return listAliases.contains(name);
  }

  @Override
  public boolean checkIfIdExists(Long id) {
    List<Long> listID = findAll()
        .stream()
        .map(UrlClass::getId)
        .collect(Collectors.toList());
    return listID.contains(id);
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

  @Override
  public List<UrlClassDTO> returnAllUrlClassDto(){
    return findAll()
        .stream()
        .map(object -> new UrlClassDTO(object.getId(), object.getUrl(), object.getAlias(), object.getHitCount()))
        .collect(Collectors.toList());
  }

  @Override
  public void deleteUrlClassbySecretCode(String secretCode) {
    repository.deleteBySecretCode(secretCode);
  }

  @Override
  public boolean checkIfIdMatchesSecretCode(Long id, String secretCode) {
    UrlClass urlObject = findAllById(id);
    return urlObject.getSecretCode().equals(secretCode);
  }

}

