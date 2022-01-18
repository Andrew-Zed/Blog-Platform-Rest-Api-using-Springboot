package com.example.springprojectblogwk9task.mapper;

import com.example.springprojectblogwk9task.entity.Comment;
import com.example.springprojectblogwk9task.entity.PostLikes;
import com.example.springprojectblogwk9task.entity.Users;
import lombok.Data;

import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Data
@Table
public class LikePosts {
    private Long postId;
    private String title;
    private String content;
    private Users users;
    private List<Comment> listOfComments = new ArrayList<>();
    private List<PostLikes> postLikes = new ArrayList<>();
    private boolean likePost;

    public boolean getLikedPost() {
        return likePost;
    }

    public void setLikedPost(boolean likedPost){
        this.likePost = likedPost;
    }
}
