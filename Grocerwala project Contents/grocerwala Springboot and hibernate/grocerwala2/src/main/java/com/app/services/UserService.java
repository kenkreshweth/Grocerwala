package com.app.services;

import com.app.entity.User;

public interface UserService {

	
	//add user
	public User addUser(User user);
	//update
	public User updateUser(User user);
	//delete
	
	//get single user using id
	public User getUser(int parseInt);
	//delete user
	public void deleteUser(int parseInt);
	
	

}
