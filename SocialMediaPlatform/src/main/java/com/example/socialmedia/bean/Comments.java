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
public class Comments {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int commentID;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "postID")
	private Posts postID;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userID")
	private Users user;

	@Column(name = "comment_text", columnDefinition = "TEXT")
	private String comment_text;

	@Column(name = "timestamp", columnDefinition = "Timestamp")
	private Timestamp timsestamp;

	public Comments(int commentID,Posts postID, Users user, String comment_text, Timestamp timsestamp) {
		this.commentID=commentID;
		this.postID = postID;
		this.user = user;
		this.comment_text = comment_text;
		this.timsestamp = timsestamp;
	}

	public int getCommentID() {
		return commentID;
	}

	public void setCommentID(int commentID) {
		this.commentID = commentID;
	}

	public Posts getPostID() {
		return postID;
	}

	public void setPostID(Posts postID) {
		this.postID = postID;
	}

	public Users getUser() {
		return user;
	}

	public void setUserID(Users user) {
		this.user = user;
	}

	public String getComment_text() {
		return comment_text;
	}

	public void setComment_text(String comment_text) {
		this.comment_text = comment_text;
	}

	public Timestamp getTimsestamp() {
		return timsestamp;
	}

	public void setTimsestamp(Timestamp timsestamp) {
		this.timsestamp = timsestamp;
	}

	public Comments() {

	}

}
