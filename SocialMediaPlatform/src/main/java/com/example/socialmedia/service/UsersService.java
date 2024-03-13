package com.example.socialmedia.service;

import com.example.socialmedia.bean.Users;

public interface UsersService {
	Users saveuser(Users user);

	Users getByUserID(int UserID);
}