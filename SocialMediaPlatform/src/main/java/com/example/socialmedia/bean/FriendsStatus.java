package com.example.socialmedia.bean;

public enum FriendsStatus {
	Accepted("ACCEPTED"), 
	PENDING("PENDING");

	private String message;

	private FriendsStatus(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	private FriendsStatus() {
	}

}
