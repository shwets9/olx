package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Userprofile1;

@Repository
public interface UserRepository extends MongoRepository<Userprofile1, String> {
	public Userprofile1 findByUseremail(String useremail);
	public Userprofile1 findByUserphone(String userphone);
	public Userprofile1 findByUserNameAndUserpassword(String userName, String serpassword);
	public Userprofile1 findByUseremailAndUserpassword(String useremail, String userpassword);
	public List<Userprofile1> findByUseraddress(String userName);
}
