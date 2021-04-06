package com.galvanize.guestbook.service;

import com.galvanize.guestbook.models.PostDTO;
import com.galvanize.guestbook.models.PostEntity;
import com.galvanize.guestbook.repository.GuestBookRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

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
    @Test
    public void getAllPosts(){
        PostDTO postDto= PostDTO.builder().name("John").build();
        PostDTO postDto2= PostDTO.builder().name("Raj").build();
        when(guestBookRepository.findAll())
                .thenReturn(List.of(PostEntity.builder().name("Raj")
                        .build(),PostEntity.builder().name("John").build()));
        List<PostDTO> results=guestBookService.getAllPosts();
        assertTrue(results.contains(postDto));
        assertTrue(results.contains(postDto2));
        assertEquals(2,results.size());



    }

}
