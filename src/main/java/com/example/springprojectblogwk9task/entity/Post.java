package com.example.springprojectblogwk9task.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long postId;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String content;

    private Instant createdOn;
    private Instant updatedOn;

    @ManyToOne
    private Users users;

    @OneToMany
    private List<Comment> listOfComment = new ArrayList<>();

    @OneToMany
    private List<PostLikes> postLikes = new ArrayList<>();
}
