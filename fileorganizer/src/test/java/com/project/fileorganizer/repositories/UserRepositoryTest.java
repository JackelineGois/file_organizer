package com.project.fileorganizer.repositories;

import com.project.fileorganizer.entities.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ActiveProfiles("test")
@ExtendWith(SpringExtension.class)
@SpringBootTest
public class UserRepositoryTest {

  @Autowired
  private UserRepository repository;

  @Test
  public void CheckEmailExistence() {
    User user = User
      .builder()
      .name("Jacke")
      .password("asfda")
      .course("jidji")
      .email("kdlsjfiz")
      .build();

    repository.save(user);
    boolean results = repository.existsByEmail("kdlsjfiz");
    Assertions.assertThat(results).isTrue();
  }
}
