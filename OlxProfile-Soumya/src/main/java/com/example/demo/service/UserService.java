package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.model.Userprofile1;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public Userprofile1 create(String userName, String userpassword, String userphone, String useremail, String useraddress) {
		return repo.save(new Userprofile1(userName,userpassword,userphone,useremail,useraddress));
		
	}
	
	public Userprofile1 findByUseremail(String useremail) {
		return repo.findByUseremail(useremail);
	}
	
	public Userprofile1 findByPhone(String userphone) {
		return repo.findByUserphone(userphone);
	}
	
	public Userprofile1 findByUserNameAndUserpassword(String userName, String password) {
		return repo.findByUserNameAndUserpassword(userName,password);
	}
	
	
}
