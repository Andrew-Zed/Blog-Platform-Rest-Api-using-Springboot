package com.example.springprojectblogwk9task.service;

import com.example.springprojectblogwk9task.entity.Post;
import com.example.springprojectblogwk9task.entity.Users;
import com.example.springprojectblogwk9task.mapper.LikePosts;

import java.util.List;

public interface PostService {
    void addPost(Long userId, Post post);

    List<LikePosts> getAllPost(Users users);

    void updatePost(Post post);

    void deletePost(Post post);

    Post getPostById(Long id);

}
