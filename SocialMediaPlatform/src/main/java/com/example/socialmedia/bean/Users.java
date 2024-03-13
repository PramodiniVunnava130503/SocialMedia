package com.example.socialmedia.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userID;
	private String userName;
	private String email;
	private String password;
	private String profile_picture;
	
	//Getters And Setters
	public int getUserID() {
		return userID;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getProfile_picture() {
		return profile_picture;
	}

	public void setProfile_picture(String profile_picture) {
		this.profile_picture = profile_picture;
	}
	
	
	public Users() {

	}

	//Argument Constructor
	public Users(int userID, String userName, String email, String password, String profile_picture) {
		this.userID = userID;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.profile_picture = profile_picture;
	}

}
