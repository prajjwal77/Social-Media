package com.social.media.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.social.media.app.Entity.SocialUser;
import com.social.media.app.Repository.SocialUserRepository;

@Service
public class SocialService {

	@Autowired
	SocialUserRepository socialUserRepository;
	
	public List<SocialUser> getAllUsers() {
		return socialUserRepository.findAll();
	}

	public SocialUser saveUsers(SocialUser socialUser) {
		return socialUserRepository.save(socialUser);
	}

}
