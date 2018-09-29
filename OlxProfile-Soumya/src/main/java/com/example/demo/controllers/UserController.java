package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Userprofile1;
import com.example.demo.service.UserService;


@RestController
public class UserController {

	
	@Autowired
	private UserService service;
	@RequestMapping("/create")
	public Userprofile1 create(@RequestParam String userName,@RequestParam String userpassword,@RequestParam String userphone,@RequestParam String useremail,@RequestParam String useraddress)
	{
		Userprofile1 user= service.create(userName,userpassword,userphone,useremail,useraddress);
		return user;//.toString();
	}
	@RequestMapping("/getuser")
	public Userprofile1 findByUseremail(@RequestParam String useremail) {
	
		Userprofile1 user= service.findByUseremail(useremail);
		return user;
		
	}
	
	

	}
	
	

