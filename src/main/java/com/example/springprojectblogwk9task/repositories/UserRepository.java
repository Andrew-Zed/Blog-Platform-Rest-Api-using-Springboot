package com.example.springprojectblogwk9task.repositories;

import com.example.springprojectblogwk9task.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

    Optional<Users> getUsersByEmail(String email);
    Optional<Users> findUsersByEmailAndAndPassword(String email, String password);

}
