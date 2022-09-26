package com.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity(name="user")
public class User {
	@Id
//	@OneToMany(mappedBy="admin_id")
//	@OneToOne
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int u_id;
	private String u_name;
	private String u_email;
	private String u_phone;
	private String u_address;
	private String roles;
	private String username;
	private String password;
	
	
	
	//contructor
	public User() {
		super();
	}
	
	//paramaterized constructor
	public User(int u_id, String u_name, String u_email, String u_phone, String u_address, String roles,
			String username, String password) {
		super();
		this.u_id = u_id;
		this.u_name = u_name;
		this.u_email = u_email;
		this.u_phone = u_phone;
		this.u_address = u_address;
		this.roles = roles;
		this.username = username;
		this.password = password;
	}
	
	
	
	//getter setter
	public int getU_id() {
		return u_id;
	}
	public void setU_id(int u_id) {
		this.u_id = u_id;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public String getU_email() {
		return u_email;
	}
	public void setU_email(String u_email) {
		this.u_email = u_email;
	}
	public String getU_phone() {
		return u_phone;
	}
	public void setU_phone(String u_phone) {
		this.u_phone = u_phone;
	}
	public String getU_address() {
		return u_address;
	}
	public void setU_address(String u_address) {
		this.u_address = u_address;
	}
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//ToString
	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", u_name=" + u_name + ", u_email=" + u_email + ", u_phone=" + u_phone
				+ ", u_address=" + u_address + ", roles=" + roles + ", username=" + username + ", password="
				+ password + "]";
	}
	
}
