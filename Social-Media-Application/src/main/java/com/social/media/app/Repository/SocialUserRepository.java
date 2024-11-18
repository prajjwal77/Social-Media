package com.social.media.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social.media.app.Entity.SocialUser;

public interface SocialUserRepository extends JpaRepository<SocialUser, Long>{

}
