package com.sumit.test.passenger;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PassengerService {
    private PassengerRepository passengerRepository;

    public PassengerService(PassengerRepository passengerRepository) {
        this.passengerRepository = passengerRepository;
    }

    public List<Passenger> getPassengersDetail(){
        return passengerRepository.findAll();
    }

    public Passenger insertPassengerDetails(Passenger passenger) {
        return passengerRepository.save(passenger);
    }

    public Passenger updatePassengerDetails(Passenger passenger) {
        return passengerRepository.save(passenger);
    }


    public String deletePassengerDetailById(Long id) {
        boolean exists=passengerRepository.existsById(id);
        if(exists){
            passengerRepository.deleteById(id);
            return "Deleted";
        }
        return "Bad Request";
    }

    public Optional<Passenger> getPassengerDetailById(Long id) {
        return passengerRepository.findById(id);
    }

    public List<Passenger> getPassengerDetailByNameAndDestination(String name, String destination) {
        return null;
//                passengerRepository.findPassengerByP_nameAndP_destination(name,destination);
    }

    public List<Passenger> getpassengerDetailByName(String name) {
        return passengerRepository.findByPassengerName(name);
    }

    public List<Passenger> getPassengersDetailByDestination(String destination) {
        return null;
//                passengerRepository.findPassengerByP_destination(destination);
    }
}
