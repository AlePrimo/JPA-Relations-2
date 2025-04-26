package com.jparelations2.SpringDataJpaRelations2.bidirectional.manytomany;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity(name = "bi_Book_many_to_many")
@Table(name = "bi_Book_many_to_many")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder

public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToMany(mappedBy = "bookList")
    List<Author> authorList;



}
