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
public class Likes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int likeID;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userID")
	private Users userID;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "postID")
	private Users postID;

	@Column(name = "timestamp", columnDefinition = "Timestamp")
	private Timestamp timestamp;

	public Likes(int likeID, Users userID, Users postID, Timestamp timestamp) {

		this.likeID = likeID;
		this.userID = userID;
		this.postID = postID;
		this.timestamp = timestamp;
	}

	public int getLikeID() {
		return likeID;
	}

	public void setLikeID(int likeID) {
		this.likeID = likeID;
	}

	public Users getUserID() {
		return userID;
	}

	public void setUserID(Users userID) {
		this.userID = userID;
	}

	public Users getPostID() {
		return postID;
	}

	public void setPostID(Users postID) {
		this.postID = postID;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public Likes() {

	}

}
