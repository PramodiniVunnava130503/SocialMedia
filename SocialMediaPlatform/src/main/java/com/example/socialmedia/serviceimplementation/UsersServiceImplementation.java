package com.example.socialmedia.serviceimplementation;

import org.springframework.stereotype.Service;

import com.example.socialmedia.bean.Users;
import com.example.socialmedia.repository.UsersRepository;
import com.example.socialmedia.service.UsersService;

@Service
public class UsersServiceImplementation implements UsersService {

	private UsersRepository userRepository;

	@Override
	public Users saveuser(Users user) {
		// TODO Auto-generated method stub
		Users user1 = new Users(user.getUserID(), user.getUserName(), user.getEmail(), user.getPassword(),
				user.getProfile_picture());

		return user1;
	}

	@Override
	public Users getByUserID(int UserID) {
		Users user = userRepository.findByUserID(UserID);
		// TODO Auto-generated method stub
		return user;

	}

}