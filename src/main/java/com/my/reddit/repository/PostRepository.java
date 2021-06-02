package com.my.reddit.repository;

import com.my.reddit.model.Post;
import com.my.reddit.model.Subreddit;
import com.my.reddit.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);

    Optional<Post> findById(Long postId);

}