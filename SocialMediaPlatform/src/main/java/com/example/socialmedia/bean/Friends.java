package com.example.socialmedia.bean;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Friends {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int friendshipID;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "userID1", referencedColumnName = "userID")
	private Users userID1;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "userID2", referencedColumnName = "userID")
	private Users userID2;

	@Enumerated(EnumType.STRING)
	@Column(name = "status")
	private FriendsStatus status;

	public int getFriendshipID() {
		return friendshipID;
	}

	public void setFriendshipID(int friendshipID) {
		this.friendshipID = friendshipID;
	}

	public Users getUserID1() {
		return userID1;
	}

	public void setUserID1(Users userID1) {
		this.userID1 = userID1;
	}

	public Users getUserID2() {
		return userID2;
	}

	public void setUserID2(Users userID2) {
		this.userID2 = userID2;
	}

	public FriendsStatus getStatus() {
		return status;
	}

	public void setStatus(FriendsStatus status) {
		this.status = status;
	}

	public Friends(int friendshipID, Users userID1, Users userID2, FriendsStatus status) {
		this.friendshipID = friendshipID;
		this.userID1 = userID1;
		this.userID2 = userID2;
		this.status = status;
	}

	public Friends() {

	}

}
