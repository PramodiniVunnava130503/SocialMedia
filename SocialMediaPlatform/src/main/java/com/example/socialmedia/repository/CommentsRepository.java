package com.example.socialmedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.socialmedia.bean.Comments;

public interface CommentsRepository extends JpaRepository<Comments,Integer>{

}
