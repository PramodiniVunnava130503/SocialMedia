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
public class Messages {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int messageID;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "senderID", referencedColumnName = "userID")
	private Users senderID;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "recieverID", referencedColumnName = "userID")
	private Users recieverID;

	@Column(name = "message_text", columnDefinition = "TEXT")
	private String message_text;

	@Column(name = "timestamp", columnDefinition = "Timestamp")
	private Timestamp timestamp;

	public int getMessageID() {
		return messageID;
	}

	public void setMessageID(int messageID) {
		this.messageID = messageID;
	}

	public Users getSenderID() {
		return senderID;
	}

	public void setSenderID(Users senderID) {
		this.senderID = senderID;
	}

	public Users getRecieverID() {
		return recieverID;
	}

	public void setRecieverID(Users recieverID) {
		this.recieverID = recieverID;
	}

	public String getMessage_text() {
		return message_text;
	}

	public void setMessage_text(String message_text) {
		this.message_text = message_text;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public Messages(int messageID, Users senderID, Users recieverID, String message_text, Timestamp timestamp) {

		this.messageID = messageID;
		this.senderID = senderID;
		this.recieverID = recieverID;
		this.message_text = message_text;
		this.timestamp = timestamp;
	}

	public Messages() {

	}

}
