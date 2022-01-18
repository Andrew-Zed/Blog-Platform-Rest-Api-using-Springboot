package com.example.springprojectblogwk9task.repositories;

import com.example.springprojectblogwk9task.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllByPostIdIsNotNullOrderByPostIdDesc();

    Post findByPostId(Long id);

}

