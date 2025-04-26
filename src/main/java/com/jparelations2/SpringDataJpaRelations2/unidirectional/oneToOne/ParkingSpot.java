package com.jparelations2.SpringDataJpaRelations2.unidirectional.oneToOne;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity(name = "uni_ParkingSpot_one_to_one")
@Table(name = "uni_ParkingSpot_one_to_one")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)

public class ParkingSpot {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Long id;
        @Column(name = "spot_number")
        Integer spotNumber;




}
