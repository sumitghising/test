package com.sumit.test.passenger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger,Long> {


    List<Passenger> findByNameAndDestination(String name, String destination);
    List<Passenger> findByName(String name);
    List<Passenger> findByDestination(String destination);

}
