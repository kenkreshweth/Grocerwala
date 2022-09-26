package com.app.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name="feedback")
public class Feedback {

	@Id
	private int user_id;
	private String description;
	private int rating;
	
	
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Feedback(int user_id, String description, int rating) {
		super();
		this.user_id = user_id;
		this.description = description;
		this.rating = rating;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Feedback [user_id=" + user_id + ", "
				+ "description=" + description + ", "
						+ "rating=" + rating + "]";
	}
	
	
}
