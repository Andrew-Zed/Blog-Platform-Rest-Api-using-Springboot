package com.example.springprojectblogwk9task.repositories;

import com.example.springprojectblogwk9task.entity.Comment;
import com.example.springprojectblogwk9task.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

    Comment findByCommentId(Long id);

    List<Comment> findCommentByPost(Post post);

    void deleteCommentByCommentId(Long commentId);

    void deleteAllByPost(Post post);
}
