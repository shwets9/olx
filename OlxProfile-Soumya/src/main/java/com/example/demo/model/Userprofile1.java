package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "profile")
public class Userprofile1 {

	@Id
	String id;
	String userName;
	String userpassword;
	String userphone;
	String useremail;
	String useraddress;
	
	public Userprofile1( String userName, String userpassword, String userphone, String useremail, String useraddress ) {
		this.userName = userName;
		this.userpassword = userpassword;
		this.userphone=userphone;
		this.useremail=useremail;
		this.useraddress = useraddress;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	public String getUserphone() {
		return userphone;
	}

	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}

	public String getUseraddress() {
		return useraddress;
	}

	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", userpassword=" + userpassword + ", userphone="
				+ userphone + ", useremail=" + useremail + ", useraddress=" + useraddress + "]";
	}
	


	
}
