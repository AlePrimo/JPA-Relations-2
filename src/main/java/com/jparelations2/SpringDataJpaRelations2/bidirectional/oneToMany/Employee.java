package com.jparelations2.SpringDataJpaRelations2.bidirectional.oneToMany;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity(name = "bi_Employee_one_to_many")
@Table(name = "bi_Employee_one_to_many")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "full_name")
    String fullName;
    @ManyToOne
    @JoinColumn(name = "department_id")
    Department department;





}
