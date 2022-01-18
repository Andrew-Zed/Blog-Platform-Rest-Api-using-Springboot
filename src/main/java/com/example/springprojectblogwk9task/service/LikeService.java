package com.example.springprojectblogwk9task.service;

import com.example.springprojectblogwk9task.entity.Post;
import com.example.springprojectblogwk9task.entity.Users;

public interface LikeService {
    boolean likePost(Users users, Long postId, String action);
    void deleteAllLikesInPost(Post post);

}
