package com.project.fileorganizer.service.impl;

import com.project.fileorganizer.entities.User;
import com.project.fileorganizer.exceptions.ExceptionsRule;
import com.project.fileorganizer.repositories.UserRepository;
import com.project.fileorganizer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserSericeImpl implements UserService {

  @Autowired
  private UserRepository repository;

  @Override
  public User Authenticate(String email, String password) {
    throw new UnsupportedOperationException(
      "Unimplemented method 'Authenticate'"
    );
  }

  @Override
  public User saveUser(User user) {
    throw new UnsupportedOperationException("Unimplemented method 'saveUser'");
  }

  @Override
  public void validateEmail(String email) {
    boolean exist = repository.existsByEmail(email);
    if (exist) {
      throw new ExceptionsRule("Email successfully registered");
    }
  }
}
