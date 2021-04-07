package com.galvanize.guestbook.controller;

import com.galvanize.guestbook.models.PostDTO;
import com.galvanize.guestbook.service.GuestBookService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

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
