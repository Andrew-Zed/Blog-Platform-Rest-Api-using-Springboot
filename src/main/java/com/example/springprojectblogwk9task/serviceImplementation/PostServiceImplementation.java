package com.example.springprojectblogwk9task.serviceImplementation;

import com.example.springprojectblogwk9task.entity.Post;
import com.example.springprojectblogwk9task.entity.Users;
import com.example.springprojectblogwk9task.mapper.LikePosts;
import com.example.springprojectblogwk9task.repositories.PostRepository;
import com.example.springprojectblogwk9task.repositories.UserRepository;
import com.example.springprojectblogwk9task.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImplementation implements PostService {

    private  final PostRepository postRepository;
    private  final UserRepository userRepository;

    @Autowired
    public PostServiceImplementation(PostRepository postRepository, UserRepository userRepository) {
        this.postRepository = postRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void addPost(Long userId, Post post) {
        Users user = userRepository.findById(userId).get();
        Post newPost = new Post();
        newPost.setTitle(post.getTitle());
        newPost.setContent(post.getContent());
        if(user != null){
            post.setUsers(user);
            newPost.setUsers(user);
            postRepository.save(newPost);
        }

    }

    @Override
    public List<LikePosts> getAllPost(Users users) {
        return null;
    }

    @Override
    public void updatePost(Post post) {

    }

    @Override
    public void deletePost(Post post) {

    }

    @Override
    public Post getPostById(Long id) {
        return null;
    }
}
