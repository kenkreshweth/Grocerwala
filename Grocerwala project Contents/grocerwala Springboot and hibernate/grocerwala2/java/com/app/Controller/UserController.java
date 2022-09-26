package com.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.entity.User;
import com.app.services.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService uservice;
	
	@GetMapping("/home")
	public String home()
	{
		return "this is home";
	}
	
	//get details of a specific user
	@GetMapping(value="/userid/{id}",produces = "application/json")
	public User getUser(@PathVariable("id") String id)
	{
		return this.uservice.getUser(Integer.parseInt(id));
	}
	
	//adding a user
	@PostMapping(value="/addUser",produces = "application/json")
	public User adduser(@RequestBody User user) {
		return uservice.addUser(user);
	}
	
	//Update User
	@PutMapping(value="/updateUser",produces = "application/json")
	public User updateUser(User user) {
		return uservice.updateUser(user);
	}
	
	
	//delete user
	@DeleteMapping(value="/deleteUser/{id}",produces = "application/json")
	public ResponseEntity<HttpStatus> deleteUser(@PathVariable("id") String id ) {
		try {
			this.uservice.deleteUser(Integer.parseInt(id));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
