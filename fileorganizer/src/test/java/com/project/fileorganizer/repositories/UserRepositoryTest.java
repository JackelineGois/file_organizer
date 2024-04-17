package com.project.fileorganizer.repositories;

import com.project.fileorganizer.entities.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ActiveProfiles("test")
@ExtendWith(SpringExtension.class)
@DataJpaTest
 public class UserRepositoryTest {

  @Autowired
  TestEntityManager entityManager;

  @Autowired
  private UserRepository repository;

  @Test
  public void CheckEmailExistence() {
    User user = User
      .builder()
      .name("Jacke")
      .password("12345")
      .course("Sistemas de Informação")
      .email("Jacke@gmail.com")
      .build();

    entityManager.persist(user);

    boolean results = repository.existsByEmail("Jacke@gmail.com");
    Assertions.assertThat(results).isTrue();
  }

  @Test
  public void ReturnFalseIfEmailIsNotRegistered() {
    boolean results = repository.existsByEmail("Jacke@gmail.com");
    Assertions.assertThat(results).isFalse();
  }
}
