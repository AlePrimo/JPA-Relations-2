package com.jparelations2.SpringDataJpaRelations2.unidirectional.manytoOne;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity(name = "uni_Student_many_to_one")
@Table(name = "uni_Student_many_to_one")
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
