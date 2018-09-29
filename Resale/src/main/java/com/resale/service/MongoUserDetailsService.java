package com.resale.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import com.resale.model.UserProfile;
import com.resale.model.Users;
import com.resale.repository.UserRepository;

@Component
public class MongoUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		 Users user = userRepository.findByUserName(userName);
		
		 if(user == null) {
		      throw new UsernameNotFoundException("User not found");
		    }
		 
		 List<SimpleGrantedAuthority> authorities = Arrays.asList(new SimpleGrantedAuthority("user"));
		 
		 return new User(user.getUserName(), user.getUserPassword(), authorities);
	}
}
