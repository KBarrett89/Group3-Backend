package com.security.services;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.security.persistence.domain.User;
import com.security.persistence.repo.UserRepo;

@Service
public class UserService {

	private UserRepo repo;

	private BCryptPasswordEncoder encoder;

	public UserService(UserRepo repo, BCryptPasswordEncoder encoder) {
		super();
		this.repo = repo;
		this.encoder = encoder;
	}

	public String registerNewUser(User user) {
		user.setPassword(this.encoder.encode(user.getPassword()));
		User saved = this.repo.save(user);
		return saved.getUsername();
	}

}