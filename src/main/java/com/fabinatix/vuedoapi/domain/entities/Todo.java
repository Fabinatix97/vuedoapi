package com.fabinatix.vuedoapi.domain.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "todos")
public class Todo {

  @Id
  private UUID id;

  private String title;

  private String description;

  private TodoStatus status;

  private TodoPriority priority;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "todo_list_id")
  private TodoList todoList;

}
