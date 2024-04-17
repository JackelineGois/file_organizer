package com.project.fileorganizer.service;

import com.project.fileorganizer.entities.User;

public interface UserService {
  User Authenticate(String email, String password);

  User saveUser(User user);

  void validateEmail(String email);
}
