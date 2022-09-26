package com.app.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.app.Dao.UserDao;
import com.app.entity.User;

@Service
public  class UserServiceImplement implements UserService {
 
	@Autowired
	private UserDao userdao;

	public UserServiceImplement() {
		
	}
	
	@Override
	public User getUser(int parseInt) {
		
		return userdao.getById(parseInt);
	
		
	}

	@Override
	public User addUser(User user) {
		userdao.save(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		 userdao.save(user);
		 return user;
	}
	@Override
	public ResponseEntity<HttpStatus> deleteUser(int id) {
		User u = userdao.getById((Integer)id);
		return null;
	}

	

	
	
	
	
	
	
}
