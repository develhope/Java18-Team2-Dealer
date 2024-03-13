package com.develhope.spring.Vehicles;

import com.develhope.spring.Vehicles.EntityofVehicles.Vehicles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehiclesController {

	@Autowired
	private VehiclesService vehiclesService;

	@PostMapping("/create")
	public Vehicles createNew(@RequestBody Vehicles vehicles){
		return vehiclesService.createVehicles(vehicles);
	}
	@GetMapping("/all")
	public List<Vehicles> allVehicles(){
		return vehiclesService.getAllVehicles();
	}
}
