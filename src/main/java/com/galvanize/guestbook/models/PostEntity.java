package com.galvanize.guestbook.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
public class PostEntity {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    Long id;
    String name;
    String comment;

    public PostEntity(String name, String comment) {
        this.name=name;
        this.comment=comment;
    }
}
