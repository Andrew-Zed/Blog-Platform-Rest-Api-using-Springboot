package com.example.springprojectblogwk9task.controller;

import com.example.springprojectblogwk9task.entity.Post;
import com.example.springprojectblogwk9task.entity.Users;
import com.example.springprojectblogwk9task.service.PostService;
import com.example.springprojectblogwk9task.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@Controller
@RequestMapping("/post")
public class PostController {

    private final PostService postService;
    private final UserService userService;

    public PostController(PostService postService, UserService userService) {
        this.postService = postService;
        this.userService = userService;
    }

    @PostMapping("/createPost/{id}")
    public ResponseEntity<String> CreatePost(@RequestBody Post post, @PathVariable Long id){
        Optional<Users> users = userService.findUserById(id);
        if(users.isPresent()){
            postService.addPost(id, post);
            return new ResponseEntity<>("Post Created!!",HttpStatus.CREATED);
        }
        return new ResponseEntity<>("Not created",HttpStatus.BAD_REQUEST);

//        return null; //"post created";
    }

    @PutMapping("/updatePost")
    public String UpdatePost(){
        return "post updated";
    }

    @DeleteMapping("/deletePost")
    public String DeletePost() {
        return "post deleted";
    }

    @GetMapping("/viewPost")
    public String viewPost(){
        return "view post";
    }
}
