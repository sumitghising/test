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

    public void deletePassengerDetails() {

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
        return passengerRepository.findByNameAndDestination(name,destination);
    }

    public List<Passenger> getpassengerDetailByName(String name) {
        return passengerRepository.findByName(name);
    }

    public List<Passenger> getPassengersDetailByDestination(String destination) {
        return passengerRepository.findByDestination(destination);
    }
}
