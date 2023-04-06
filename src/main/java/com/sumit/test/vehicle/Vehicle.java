package com.sumit.test.vehicle;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "vehicle")
public class Vehicle {
    @Id
    @SequenceGenerator(name = "vehicle_sequence",
            sequenceName = "vehicle_sequence",allocationSize = 1)
    @GeneratedValue(generator = "vehicle_sequence",strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private int capacity;

    private String destination;

    private String source;

}
