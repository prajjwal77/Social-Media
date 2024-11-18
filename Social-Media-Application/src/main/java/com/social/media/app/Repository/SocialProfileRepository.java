package com.social.media.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social.media.app.Entity.SocialProfile;

public interface SocialProfileRepository extends JpaRepository<SocialProfile, Long>{

}
