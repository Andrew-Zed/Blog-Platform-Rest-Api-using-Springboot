package com.example.springprojectblogwk9task.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity(name = "comment")
@Table
@AllArgsConstructor
@NoArgsConstructor

public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long commentId;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String commentBody;

    @ManyToOne
    private Post post;

    @ManyToOne
    private Users users;

    private String comments;

    public Comment(String comment, Post post, Users users) {
        this.commentBody = comment;
        this.post = post;
        this.users =users;
    }
    public Comment(Long commentId, String comment) {
        this.commentId = commentId;
        this.commentBody = comment;
    }
}
