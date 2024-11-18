package com.social.media.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social.media.app.Entity.SocialGroup;

public interface GroupRepository extends JpaRepository<SocialGroup, Long> {

}
