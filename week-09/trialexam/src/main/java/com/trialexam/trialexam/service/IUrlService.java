package com.trialexam.trialexam.service;

    import com.trialexam.trialexam.model.UrlClass;
    import com.trialexam.trialexam.model.UrlClassDTO;
    import com.trialexam.trialexam.repository.UrlRepository;

    import java.util.List;
    import java.util.stream.Collectors;

public interface IUrlService {

  void save(UrlClass urlObject);

  List<UrlClass> findAll();

  boolean checkIfAliasExists(UrlClass urlObject);

  boolean checkIfAliasNameExists(String name);

  boolean checkIfIdExists(Long id);

  UrlClass findAllById(Long id);

  UrlClass findByIdOrGenerateEmpty(Long id);

  UrlClass findByAlias(String alias);

  List<UrlClassDTO> returnAllUrlClassDto();

  void deleteUrlClassbySecretCode(String secretCode);

  boolean checkIfIdMatchesSecretCode(Long id, String secretCode);

}
