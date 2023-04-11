package com.sumit.test.vehicle;

import com.sumit.test.passenger.Passenger;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Table(name = "vehicle")
@NoArgsConstructor
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
