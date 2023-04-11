package com.sumit.test.passenger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger,Long> {


//    List<Passenger> findPassengerByP_nameAndP_destination(String name, String destination);
//    List<Passenger> findPassengerByP_name(String name);
//    List<Passenger> findPassengerByP_destination(String destination);
    List<Passenger> findByPassengerName(String name);
}
