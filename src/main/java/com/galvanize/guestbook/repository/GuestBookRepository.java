package com.galvanize.guestbook.repository;

import com.galvanize.guestbook.models.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestBookRepository extends JpaRepository<PostEntity,Long>{


}
