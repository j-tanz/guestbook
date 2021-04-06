package com.galvanize.guestbook.service;

import com.galvanize.guestbook.models.PostDTO;
import com.galvanize.guestbook.models.PostEntity;
import com.galvanize.guestbook.repository.GuestBookRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class GuestBookServiceTest {
    @InjectMocks
    GuestBookService guestBookService;
    @Mock
    GuestBookRepository guestBookRepository;
    @Test
    public void createPost(){
        PostDTO postDto= PostDTO.builder().name("John").build();
        guestBookService.createPost(postDto);
        verify(guestBookRepository).save(PostEntity.builder().name("John").build());


    }

}
