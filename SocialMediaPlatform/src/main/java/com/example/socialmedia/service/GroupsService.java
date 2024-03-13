package com.example.socialmedia.service;

import com.example.socialmedia.bean.Groups;

public interface GroupsService {
	Groups savegroup(Groups group);

	Groups getByGroupID(int GroupID);
}
