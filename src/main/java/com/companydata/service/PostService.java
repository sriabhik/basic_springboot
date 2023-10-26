package com.companydata.service;


import com.companydata.entities.Comment;
import com.companydata.entities.Post;
import com.companydata.repositories.PostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepo postRepo;

    public Post addPost(Post savedPost){
       ;
        return this.postRepo.save(savedPost);

    }
    public Post postById(int id){
        return this.postRepo.findById(id).get();
    }
}
