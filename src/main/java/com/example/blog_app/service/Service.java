package com.example.blog_app.service;

import com.example.blog_app.dao.PostDAO;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.blog_app.Entity.Post;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private PostDAO postDAO;

    public Post createPost(Post post){
        return postDAO.save(post);
    }

    public Post getPostById(Long id){
        return postDAO.findById(id).orElseThrow(()->new RuntimeException(id + " This Id Doesn't Exits"));
    }

    public List<Post> getAllPost(){
        return postDAO.findAll();
    }
}
