package com.fabinatix.vuedoapi.domain.entities;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Table(name = "todolists")
public class TodoList {

  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(updatable=false, nullable=false)
  private UUID id;

  private String title;

  private String description;

  @OneToMany(cascade = CascadeType.ALL)
  private List<Todo> todos;

}
