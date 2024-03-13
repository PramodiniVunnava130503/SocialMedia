package com.example.socialmedia.bean;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Groups1")
public class Groups {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int groupID;

	private String groupName;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userID")
	private Users adminID;

	public Groups(int groupID,String groupName, Users adminID) {
		this.groupID=groupID;
		this.groupName = groupName;
		this.adminID = adminID;
	}

	public int getGroupID() {
		return groupID;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Users getAdminID() {
		return adminID;
	}

	public void setAdminID(Users adminID) {
		this.adminID = adminID;
	}

	public Groups() {

	}

}
