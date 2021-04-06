package com.galvanize.guestbook.service;

import com.galvanize.guestbook.models.PostDTO;
import com.galvanize.guestbook.models.PostEntity;
import com.galvanize.guestbook.repository.GuestBookRepository;
import org.springframework.stereotype.Service;

@Service
public class GuestBookService {

private final GuestBookRepository guestBookRepository;

    public GuestBookService(GuestBookRepository guestBookRepository) {
        this.guestBookRepository = guestBookRepository;
    }

    public void createPost(PostDTO postDto) {
        guestBookRepository.save(new PostEntity(postDto.getName(),postDto.getComment()));

    }
}
