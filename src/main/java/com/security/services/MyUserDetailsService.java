package com.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.security.config.MyUserDetails;
import com.security.persistence.domain.User;
import com.security.persistence.repo.UserRepo;

@Component
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepo repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User found = this.repo.findByUsername(username)
				.orElseThrow(() -> new UsernameNotFoundException("No user exists with name: " + username));
		return new MyUserDetails(found);

	}

}