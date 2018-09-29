package com.resale.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.resale.model.UserProfile;
import com.resale.model.Users;
import com.resale.service.UserService;



@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
		@RequestMapping("/oo")
	    public ModelAndView getView() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		return mav;
	
	}
	
/*	@RequestMapping("/profile")
	public ModelAndView getView() {
		ModelAndView mav = new ModelAndView();
        mav.addObject("user", user);
        mav.setViewName("profile");  
        return mav;
	}
	*/
/*	
	@RequestMapping("/create")
	public String create(@RequestParam String userName,@RequestParam String userPassword,@RequestParam String userPhone,@RequestParam String userEmail,@RequestParam String userAddress)
	{
		UserProfile user= userService.create(userName,userPassword,userPhone,userEmail,userAddress);
		return user.toString();
	}
	
	@RequestMapping("/getUser")
	public UserProfile findByUserEmail(@RequestParam String userEmail) {
		 return userService.findByUserEmail(userEmail);
	}
	*/
	@RequestMapping("/getCurUser")
	public Users findByUserName(@RequestParam String userName) {
		return userService.findByUserName(userName);
	}
	

	}
	
	

