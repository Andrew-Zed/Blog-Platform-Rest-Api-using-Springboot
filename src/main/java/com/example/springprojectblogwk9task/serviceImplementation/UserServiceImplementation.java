package com.example.springprojectblogwk9task.serviceImplementation;

import com.example.springprojectblogwk9task.entity.Users;
import com.example.springprojectblogwk9task.repositories.UserRepository;
import com.example.springprojectblogwk9task.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class UserServiceImplementation implements UserService {

    private final UserRepository userRepository;

    public UserServiceImplementation(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Users addUser(Users users) {
        return userRepository.save((users));
    }

    @Override
    public Optional<Users> logInUser(Users users) {
        return userRepository.findUsersByEmailAndAndPassword(users.getEmail(), users.getPassword());
    }

    @Override
    public Optional<Users> findUserById(Long id) {
        return userRepository.findById(id);
    }

//    public Users addUser(Users users) {
//        return userRepository.save(users);
//    }




}
