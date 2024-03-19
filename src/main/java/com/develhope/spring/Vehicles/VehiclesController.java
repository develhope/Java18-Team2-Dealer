package com.develhope.spring.Vehicles;

import com.develhope.spring.Vehicles.EntityofVehicles.VehicleType;
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
	@GetMapping("/searchDetails")
	public List <Vehicles> searchDetails (@RequestParam(required = false) VehicleType type, @RequestParam (required = false) String brand, @RequestParam (required = false) String model, @RequestParam(required = false) Integer displacement, @RequestParam(required = false) String color, @RequestParam(required = false) String power, @RequestParam(required = false) String transmissionType,
										  @RequestParam(required = false) Integer yearOfRegistration, @RequestParam(required = false) String fuelType, @RequestParam(required = false) Double price, @RequestParam(required = false) Double discountPrice, @RequestParam(required = false) String accessories, @RequestParam(required = false) String condition){
		return vehiclesService.searchForParam(type,brand,model,displacement,color,power,transmissionType,
				yearOfRegistration,fuelType,price,discountPrice,accessories,condition);
	}
	@DeleteMapping("/delete/{id}")
	public Vehicles deleteVehicle(@PathVariable Long id){
		return vehiclesService.deleteAVeicles(id);
	}
}
