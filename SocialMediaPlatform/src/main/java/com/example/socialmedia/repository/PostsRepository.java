package com.example.socialmedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.socialmedia.bean.Posts;

public interface PostsRepository extends JpaRepository<Posts,Integer>{

}
