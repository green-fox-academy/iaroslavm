package com.trialexam.trialexam.repository;

import com.trialexam.trialexam.model.UrlClass;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UrlRepository extends CrudRepository<UrlClass, Long> {

  List<UrlClass> findAll();

  UrlClass findAllById(Long id);

  UrlClass findByAlias(String alias);

  UrlClass findBySecretCode(String secretCode);
}
