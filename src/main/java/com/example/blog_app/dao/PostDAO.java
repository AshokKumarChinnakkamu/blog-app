package com.example.blog_app.dao;
import  com.example.blog_app.Entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostDAO extends JpaRepository<Post, Long> {

}
