package com.fabinatix.vuedoapi.repositories;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fabinatix.vuedoapi.domain.entities.Todo;

@Repository
public interface TodoRepository extends CrudRepository<Todo, UUID> {

    // Additional methods specific to Todo can be added here if needed

}
