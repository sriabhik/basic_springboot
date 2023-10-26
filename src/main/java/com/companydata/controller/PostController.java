package com.companydata.controller;


import com.companydata.entities.Post;
import com.companydata.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/post")
@CrossOrigin("*")
public class PostController {

    @Autowired
    private PostService postService;


    //addPost
    @PostMapping("/addPost")
    public Post addingPost(@RequestBody Post savePostDetail){
        return this.postService.addPost(savePostDetail);
    }
    @GetMapping("/postById/{id}")
    public Post postById(@PathVariable Integer id){
        return this.postService.postById(id);
    }

}




