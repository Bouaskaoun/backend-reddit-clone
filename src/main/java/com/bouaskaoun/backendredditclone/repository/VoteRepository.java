package com.bouaskaoun.backendredditclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bouaskaoun.backendredditclone.models.Post;
import com.bouaskaoun.backendredditclone.models.User;
import com.bouaskaoun.backendredditclone.models.Vote;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}