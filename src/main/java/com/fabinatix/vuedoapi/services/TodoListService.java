package com.fabinatix.vuedoapi.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.fabinatix.vuedoapi.domain.entities.TodoList;

public interface TodoListService {

  TodoList save(TodoList todoList);

  List<TodoList> findAll();

  Optional<TodoList> findOne(UUID todoListId);

  TodoList update(UUID todoListId, TodoList todoList);
  
  void delete(UUID todoListId);

}
