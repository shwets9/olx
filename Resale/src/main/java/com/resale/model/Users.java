package com.resale.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class Users {
	
	  @Id
	  public ObjectId _id;
	  public String userName;
	  public String userPassword;
	  
	  public Users() {}

	    public Users(ObjectId _id, String userName, String userPassword) {
	    this._id = _id;
	    this.userName = userName;
	    this.userPassword = userPassword;
	  }

	  public void set_id(ObjectId _id) { 
		  this._id = _id; 
		  }

	  public String get_id() { 
		  return this._id.toHexString(); 
		  }

	  public void setUserPassword(String userPassword) { 
		  this.userPassword = userPassword; }

	  public String getUserPassword() { 
		  return userPassword; 
		  }

	  public void setUserName(String userName) {
		  this.userName = userName;
		  }

	  public String getUserName() {
		  return userName;
		  }


}
