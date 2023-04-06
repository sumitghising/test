package com.sumit.test.passenger;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/passenger")
public class PassengerController {
    private PassengerService passengerService;
    PassengerController(PassengerService passengerService){
        this.passengerService =passengerService;
    }
    @GetMapping
    public List<Passenger> getPassengersDetail(@RequestParam(required = false) String name,
                                               @RequestParam(required = false) String destination){
        if (StringUtils.hasLength(name) && StringUtils.hasLength(destination)){
            return passengerService.getPassengerDetailByNameAndDestination(name,destination);
        }else if(StringUtils.hasLength(name)){
            return passengerService.getpassengerDetailByName(name);
        }else if(StringUtils.hasLength(destination)){
            return passengerService.getPassengersDetailByDestination(destination);
        }
            return passengerService.getPassengersDetail();
    }
    @GetMapping("/{id}")
    public Optional<Passenger> getPassengerDetailById(@PathVariable("id") Long id){
        return passengerService.getPassengerDetailById(id);
    }

    @PostMapping
    public ResponseEntity<Passenger> insertPassengerDetails(@RequestBody Passenger passenger){
        return new ResponseEntity(passengerService.insertPassengerDetails(passenger), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity <Passenger> updatepassengerDetails(@RequestParam("id") Long id, @RequestBody Passenger passenger){
        if(id!=passenger.getId())
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        return new ResponseEntity(passengerService.updatePassengerDetails(passenger), HttpStatus.OK);
    }



    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePassengerDetailById(@PathVariable("id") Long id){
        String response = passengerService.deletePassengerDetailById(id);
        if(response.equals("Bad Request")){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity(HttpStatus.OK);
    }
}
