package com.develhope.spring.Vehicles;

import com.develhope.spring.Vehicles.EntityofVehicles.Vehicles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class VehiclesController {
    @Autowired
    private VehiclesRepository vehiclesRepository;
    @Autowired
    private VehiclesService vehiclesService;

    @GetMapping("/all")
    public List<Vehicles> allVehicles() {
        return vehiclesService.getAllVehicles();
    }
    @PostMapping("/create")
    public Vehicles createNew(@RequestBody Vehicles vehicles) {
        return vehiclesService.createVehicles(vehicles);
    }
    @DeleteMapping("/delete/{id}")
    public Vehicles deleteVehicles(@PathVariable Long id){
        return vehiclesService.deleteAVeicles(id);
    }

    @PutMapping("/update/{id}")
    public Vehicles updateVehicles(@PathVariable Long id,@RequestBody Vehicles vehicles){
        return vehiclesService.updateVehicles(id, vehicles);
    }
    @GetMapping("/{id}")
    public Optional<Vehicles> searchVehicleById(@PathVariable Long id){
        return vehiclesService.searchVehicleById(id);
    }

}
