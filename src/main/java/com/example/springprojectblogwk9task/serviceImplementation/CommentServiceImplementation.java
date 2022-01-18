package com.example.springprojectblogwk9task.serviceImplementation;

import com.example.springprojectblogwk9task.repositories.CommentRepository;
import com.example.springprojectblogwk9task.repositories.PostRepository;
import com.example.springprojectblogwk9task.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImplementation  {

    @Autowired
    CommentRepository commentRepository;

    @Autowired
    PostRepository postRepository;

}
