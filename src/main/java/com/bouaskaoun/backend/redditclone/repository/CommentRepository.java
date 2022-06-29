package com.bouaskaoun.backend.redditclone.repository;

import com.bouaskaoun.backend.redditclone.model.Comment;
import com.bouaskaoun.backend.redditclone.model.Post;
import com.bouaskaoun.backend.redditclone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
