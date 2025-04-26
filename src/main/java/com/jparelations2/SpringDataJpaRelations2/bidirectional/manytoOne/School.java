package com.jparelations2.SpringDataJpaRelations2.bidirectional.manytoOne;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity(name = "bi_School_many_to_one")
@Table(name = "bi_School_many_to_one")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder

public class School {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    @OneToMany(mappedBy = "school")
    List<Student> studentList;







}
