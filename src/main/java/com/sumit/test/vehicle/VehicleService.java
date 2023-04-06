package com.sumit.test.vehicle;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {
    private VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    public List<Vehicle> getVehicleDetails() {
        return vehicleRepository.findAll();
    }

    public void insertVehicleDetails(Vehicle vehicle) {
        vehicleRepository.save(vehicle);
    }
}
