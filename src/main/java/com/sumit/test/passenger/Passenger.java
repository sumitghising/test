package com.sumit.test.passenger;

import com.sumit.test.vehicle.Vehicle;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "passenger")
@NoArgsConstructor
public class Passenger{
    @Id
    @SequenceGenerator(name = "passenger_sequence",
                        sequenceName = "passenger_sequence",
                        allocationSize = 1)
    @GeneratedValue(generator = "passenger_sequence",strategy = GenerationType.SEQUENCE)
    private Long passengerId;

    @Column(length = 50)
    private String passengerName;
    @Column(length = 50)
    private String passengerDestination;
    @Column(length = 50)
    private String PassengerFrom;

    @ManyToOne
    @JoinColumn(name = "v_id" )
    private Vehicle vehicle;

    public Passenger(String passengerName, String passengerDestination, String passengerFrom) {
        this.passengerName = passengerName;
        this.passengerDestination = passengerDestination;
        PassengerFrom = passengerFrom;
    }

    public Passenger(String passengerName, String passengerDestination, String passengerFrom, Vehicle vehicle) {
        this.passengerName = passengerName;
        this.passengerDestination = passengerDestination;
        PassengerFrom = passengerFrom;
        this.vehicle = vehicle;
    }
}
