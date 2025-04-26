package com.jparelations2.SpringDataJpaRelations2.unidirectional.oneToOne;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;



@Entity(name = "uni_Employee_one_to_one")
@Table(name = "uni_Employee_one_to_one")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "full_name")
    String fullName;
    @OneToOne
    @JoinColumn(name = "parking_spot_id")
    ParkingSpot parkingSpot;





}
