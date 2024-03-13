package com.example.socialmedia.bean;

import java.sql.Timestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Posts {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int postID;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userID")
	private Users userID;

	@Column(name = "content", columnDefinition = "TEXT")
	private String content;

	@Column(name = "timestamp", columnDefinition = "Timestamp")
	private Timestamp timestamp;

	public int getPostID() {
		return postID;
	}

	public void setPostID(int postID) {
		this.postID = postID;
	}

	public Users getUserID() {
		return userID;
	}

	public void setUserID(Users userID) {
		this.userID = userID;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public Posts(int postID, Users userID, String content, Timestamp timestamp) {

		this.postID = postID;
		this.userID = userID;
		this.content = content;
		this.timestamp = timestamp;
	}

	public Posts() {

	}

}
