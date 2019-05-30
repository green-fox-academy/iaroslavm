package com.foxtoy.foxtoydemo.repository;

import com.foxtoy.foxtoydemo.models.GreenFox;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFoxRepository extends CrudRepository<GreenFox,Long> {
}
