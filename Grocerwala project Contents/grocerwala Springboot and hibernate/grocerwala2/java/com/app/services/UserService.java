package com.app.services;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.app.entity.User;

public interface UserService {

	//public User getUser(int id);
	public User addUser(User user);
	public User updateUser(User user);
	public ResponseEntity<HttpStatus> deleteUser(int id);
	public User getUser(int parseInt);
	
	

}
