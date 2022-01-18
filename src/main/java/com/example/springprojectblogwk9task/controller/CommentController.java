package com.example.springprojectblogwk9task.controller;

import com.example.springprojectblogwk9task.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentController {

    @GetMapping()
    public String getEditCommentPage() {
        return getEditCommentPage();
    }

}
