package com.resale.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.resale.model.UserProfile;
import com.resale.model.Users;
import com.resale.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	/*public UserProfile create(String userName, String userPassword, String userPhone, String userEmail, String userAddress) {
		return userRepository.save(new UserProfile(userName,userPassword,userPhone,userEmail,userAddress));
		
	}
	
	public UserProfile findByUserEmail(String userEmail) {
		return userRepository.findByUserEmail(userEmail);
	}
	
	public UserProfile findByPhone(String userPhone) {
		return userRepository.findByUserPhone(userPhone);
	}
	
	public UserProfile findByUserNameAndUserpassword(String userName, String userPassword) {
		return userRepository.findByUserNameAndUserPassword(userName,userPassword);
	}
*/
	public Users findByUserName(String userName) {
		return userRepository.findByUserName(userName);
	
	}
	
	
}
