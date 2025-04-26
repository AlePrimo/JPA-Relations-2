package com.jparelations2.SpringDataJpaRelations2.unidirectional.oneToMany;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity(name = "uni_Department_one_to_many")
@Table(name = "uni_Department_one_to_many")
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
    @OneToMany(targetEntity = Employee.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "department_id")
    List<Employee> employeeList;



}
