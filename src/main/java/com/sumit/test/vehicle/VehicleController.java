package com.sumit.test.vehicle;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/vehicle")
public class VehicleController {
    private VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @GetMapping
    public List<Vehicle> getVehicleDetails(){
        return vehicleService.getVehicleDetails();
    }

    @PostMapping
    public void insertVehicleDetails(@RequestBody Vehicle vehicle){
        vehicleService.insertVehicleDetails(vehicle);

    }

}
