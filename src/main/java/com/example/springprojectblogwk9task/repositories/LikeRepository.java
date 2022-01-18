package com.example.springprojectblogwk9task.repositories;

import com.example.springprojectblogwk9task.entity.Post;
import com.example.springprojectblogwk9task.entity.PostLikes;
import com.example.springprojectblogwk9task.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface LikeRepository extends JpaRepository<PostLikes,Long>{
    @Transactional
    void deletePostLikesByPostAndUsers(Post post, Users users);

    List<PostLikes> findAllByPost(Post post);

    void deleteAllByPost(Post post);
}
