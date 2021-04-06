package com.galvanize.guestbook.controller;

import com.galvanize.guestbook.models.PostDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {
    public static List<PostDTO> postList=new ArrayList<>();

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addPost(@RequestBody PostDTO post) {

        postList.add(post);


    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<PostDTO> getAllPosts() {

        return postList;


    }

}
