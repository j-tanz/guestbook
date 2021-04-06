package com.galvanize.guestbook.controller;

import com.galvanize.guestbook.models.PostDTO;
import com.galvanize.guestbook.service.GuestBookService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    GuestBookService guestBookService;

    public PostController(GuestBookService guestBookService) {
        this.guestBookService = guestBookService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addPost(@RequestBody PostDTO post) {

        guestBookService.createPost(post);


    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<PostDTO> getAllPosts() {

        return guestBookService.getAllPosts();


    }

}
