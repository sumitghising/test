package com.sumit.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PassengerController {

    private PassengerService passengerService;

    PassengerController(PassengerService passengerService){
        this.passengerService =passengerService;
    }
    @GetMapping("/")
    public List<Passenger> showName(){

        return passengerService.showName();
    }
}
