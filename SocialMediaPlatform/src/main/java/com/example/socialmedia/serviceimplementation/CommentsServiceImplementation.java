package com.example.socialmedia.serviceimplementation;

import java.util.ArrayList;

import com.example.socialmedia.bean.Comments;

public class CommentsServiceImplementation {
	ArrayList<Comments> commentsList = new ArrayList<Comments>();
	
	public ArrayList<Comments> getCommentsList() {
		return commentsList;
	}

}
//methods implementation like getby commentid ala...