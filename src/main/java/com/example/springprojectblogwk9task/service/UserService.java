package com.example.springprojectblogwk9task.service;

import com.example.springprojectblogwk9task.entity.Users;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface UserService {

    Users addUser(Users users);

    Optional<Users> logInUser(Users users);

    Optional<Users>findUserById(Long id);
}
