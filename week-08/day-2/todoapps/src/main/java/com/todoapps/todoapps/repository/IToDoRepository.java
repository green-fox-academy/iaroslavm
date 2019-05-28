package com.todoapps.todoapps.repository;

import com.todoapps.todoapps.models.ToDo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.CrudRepositoryExtensionsKt;

public interface IToDoRepository extends CrudRepository<ToDo, Long> {
}
