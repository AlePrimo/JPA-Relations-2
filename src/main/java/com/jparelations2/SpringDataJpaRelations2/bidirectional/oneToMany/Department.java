package com.jparelations2.SpringDataJpaRelations2.bidirectional.oneToMany;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity(name = "bi_Department_one_to_many")
@Table(name = "bi_Department_one_to_many")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder

public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    @OneToMany(mappedBy = "department")
    List<Employee> employeeList;



}
