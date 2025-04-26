package com.jparelations2.SpringDataJpaRelations2.bidirectional.manytoOne;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity(name = "bi_Student_many_to_one")
@Table(name = "bi_Student_many_to_one")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder

public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "full_name")
    String full_name;

    @ManyToOne
    @JoinColumn(name = "school_id")
    School school;








}
