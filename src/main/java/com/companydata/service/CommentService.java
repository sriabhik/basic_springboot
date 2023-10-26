package com.companydata.service;

import com.companydata.entities.Comment;
import com.companydata.repositories.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private CommentRepo commentRepo;

    public Comment newComment(Comment comment){

        return this.commentRepo.save(comment);
    }

    public Comment commentById(int id){
        return this.commentRepo.findById(id).get();
    }
}
