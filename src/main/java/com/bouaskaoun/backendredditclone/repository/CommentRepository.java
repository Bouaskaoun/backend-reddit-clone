package com.bouaskaoun.backendredditclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bouaskaoun.backendredditclone.models.Comment;
import com.bouaskaoun.backendredditclone.models.Post;
import com.bouaskaoun.backendredditclone.models.User;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}