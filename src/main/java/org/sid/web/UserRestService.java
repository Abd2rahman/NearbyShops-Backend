package org.sid.web;

import java.util.Date;

import org.sid.dao.UserRepository;
import org.sid.entities.User;
import org.sid.security.SecurityConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@RestController
@RequestMapping("api")
public class UserRestService {

	@Bean
	private BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Autowired
	private UserRepository userRepo;

	@RequestMapping(value = "/sign-up", method = RequestMethod.POST)
	public void signUp(@RequestBody User user) {
		user.setPassword(bCryptPasswordEncoder().encode(user.getPassword()));
		userRepo.save(user);
	}


}
