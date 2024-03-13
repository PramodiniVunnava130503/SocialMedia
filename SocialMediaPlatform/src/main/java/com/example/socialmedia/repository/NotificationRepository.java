package com.example.socialmedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.socialmedia.bean.Notifications;


public interface NotificationRepository extends JpaRepository<Notifications,Integer>{

}
