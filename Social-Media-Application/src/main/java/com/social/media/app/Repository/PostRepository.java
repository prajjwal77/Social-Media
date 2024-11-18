package com.social.media.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social.media.app.Entity.Post;

public interface PostRepository extends JpaRepository<Post, Long>{

}
