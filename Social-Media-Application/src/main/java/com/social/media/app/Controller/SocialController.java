package com.social.media.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.social.media.app.Entity.SocialUser;
import com.social.media.app.Service.SocialService;

@RestController
public class SocialController {
	@Autowired
	private SocialService socialService;
	
	@GetMapping("/social/users")
	public ResponseEntity<List<SocialUser>> getUsers(){
		return  new ResponseEntity<>(socialService.getAllUsers(),HttpStatus.OK);
	}
	
	@PostMapping("/save/users")
	public ResponseEntity<SocialUser> saveUsers(@RequestBody SocialUser socialUser){
		return  new ResponseEntity<>(socialService.saveUsers(socialUser),HttpStatus.OK);
	}
}
