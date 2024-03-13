package com.example.socialmedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.socialmedia.bean.Users;

public interface UsersRepository extends JpaRepository<Users,Integer>{

	Users findByUserID(int userID);

}
