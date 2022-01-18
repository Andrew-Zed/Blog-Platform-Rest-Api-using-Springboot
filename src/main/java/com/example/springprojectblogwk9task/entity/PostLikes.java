package com.example.springprojectblogwk9task.entity;

import lombok.Data;

import javax.persistence.*;
@Data
@Table
@Entity(name = "likes")
public class PostLikes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postLikeId;

    @ManyToOne
    private Post post;

    @ManyToOne
    private Users users;
}
