package com.resale.repository;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.resale.model.UserProfile;
import com.resale.model.Users;


@Repository
public interface UserRepository extends MongoRepository<Users, String> {
	
	/*public UserProfile findByUserEmail(String userEmail);
	public UserProfile findByUserPhone(String userPhone);
	public UserProfile findByUserNameAndUserPassword(String userName, String userPassword);
	public UserProfile findByUseremailAndUserPassword(String userEmail, String userPassword);
	public List<UserProfile> findByUserAddress(String userName);*/
	public Users findByUserName(String userName);
	
}
