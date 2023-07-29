package com.graphql.demo;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;
import org.springframework.graphql.data.method.annotation.QueryMapping;

import java.util.List;

@Controller
public class VehicleController {

    private final VehicleService vehicleService;

    public VehicleController(VehicleService service) {
        this.vehicleService = service;
    }

    @QueryMapping
    public List<Vehicle> vehicles(@Argument int count) {
        return vehicleService.getAllVehicles(count);
    }

    @QueryMapping
    public Vehicle vehicle(@Argument int id) {
        return vehicleService.getVehicle(id).orElseGet(null);
    }

    @MutationMapping
    public Vehicle createVehicle(@Argument String type, @Argument String modelCode,
                                 @Argument String brandName, @Argument String launchDate) {
        return vehicleService.createVehicle(type, modelCode, brandName, launchDate);
    }

}
