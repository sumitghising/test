package com.sumit.test;

import jakarta.persistence.*;

@Entity
@Table(name = "passenger")
public class Passenger {
    @Id

    @SequenceGenerator(name = "passenger_sequence",
                        sequenceName = "passenger_sequence",
                        allocationSize = 1)
    @GeneratedValue(generator = "passenger_sequence",strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(name = "name",length = 50)
    private String name;
    @Column(name = "destination",length = 50)

    private String destination;
    @Column(name = "from",length = 50)

    private String from;

    public Passenger() {
    }

    public Passenger(Long id, String name, String destination, String from) {
        this.id = id;
        this.name = name;
        this.destination = destination;
        this.from = from;
    }

    public Passenger(String name, String destination, String from) {
        this.name = name;
        this.destination = destination;
        this.from = from;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }


}
