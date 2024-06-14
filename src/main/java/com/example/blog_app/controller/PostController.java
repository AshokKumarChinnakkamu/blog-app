package com.example.blog_app.controller;
import com.example.blog_app.Entity.Post;
import com.example.blog_app.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {
    @Autowired
    private Service postService;
    @PostMapping("/createPost")
    public ResponseEntity<String> createPost(@RequestBody Post post){
        Post response=postService.createPost(post);
        return new ResponseEntity<>("Post Created Successfully, ID ->"+response.getId(), HttpStatus.CREATED);
    }
@GetMapping("/getPostById/{id}")
    public ResponseEntity<Post> getPostById(@PathVariable Long id){
        Post response=postService.getPostById(id);
        return ResponseEntity.ok(response);
}
@GetMapping("/getAllPost")
    public List<Post> getAllPost(){
        return postService.getAllPost();
}

}
