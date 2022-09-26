package com.app.services;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Dao.UserDao;
import com.app.entity.User;

@Service
public  class UserServiceImplement implements UserService {
 
	//object of the DAO for JPA 
	@Autowired
	private UserDao userdao;

	public UserServiceImplement() {
		
	}
	
	@SuppressWarnings("deprecation")
	@Override
	@Transactional
	public User getUser(int id) {
		return userdao.getById(id);	
	}

	@Override
	@Transactional
	public User addUser(User user) {
		userdao.save(user);
		return user;
	}

	@Override
	@Transactional
	public User updateUser(User user) {
		 userdao.save(user);
		 return user;
	}
	
	@SuppressWarnings("deprecation")
	@Override
	@Transactional
	public void deleteUser(int id) {
		User u = userdao.getById(id);
		this.userdao.delete(u);
		
	}

	

	
	
	
	
	
	
}
