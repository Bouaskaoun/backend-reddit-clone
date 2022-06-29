package com.bouaskaoun.backend.redditclone.repository;

import com.bouaskaoun.backend.redditclone.model.Post;
import com.bouaskaoun.backend.redditclone.model.User;
import com.bouaskaoun.backend.redditclone.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
