package com.bouaskaoun.backendredditclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bouaskaoun.backendredditclone.models.Post;
import com.bouaskaoun.backendredditclone.models.Subreddit;
import com.bouaskaoun.backendredditclone.models.User;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}