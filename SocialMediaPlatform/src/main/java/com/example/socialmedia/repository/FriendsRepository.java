package com.example.socialmedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.socialmedia.bean.Friends;

public interface FriendsRepository extends JpaRepository<Friends,Integer>{

}
