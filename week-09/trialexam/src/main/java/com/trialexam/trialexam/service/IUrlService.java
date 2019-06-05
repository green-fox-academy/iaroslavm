package com.trialexam.trialexam.service;

import com.trialexam.trialexam.model.UrlClass;

import java.util.List;

public interface IUrlService {

  void save(UrlClass urlObject);

  List<UrlClass> findAll();

  boolean checkIfAliasExists(UrlClass urlObject);

  boolean checkIfAliasNameExists(String name);

  UrlClass findAllById(Long id);

  UrlClass findByIdOrGenerateEmpty(Long id);

  UrlClass findByAlias(String alias);
}
