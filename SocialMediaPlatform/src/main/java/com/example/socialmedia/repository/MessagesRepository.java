package com.example.socialmedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.socialmedia.bean.Messages;



public interface MessagesRepository extends JpaRepository<Messages,Integer>{

}
