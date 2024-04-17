package com.project.fileorganizer.entities;

import com.project.fileorganizer.enums.LevelEducation;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "admin-user")
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

  @Id
  @Column
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "name")
  private String name;

  @Column(name = "course")
  private String course;

  @Column(name = "email")
  private String email;

  @Column(name = "password")
  private String password;

  @Column(name = "level_education")
  @Enumerated(value = EnumType.STRING)
  private LevelEducation levelEducation;
}
