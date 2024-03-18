package com.develhope.spring.Rent;

import com.develhope.spring.Vehicles.EntityofVehicles.Vehicles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/Rent")
public class RentController {
    @Autowired
    RentService rentService;
    @PostMapping("/new/{id}")
    public Vehicles newRents (@PathVariable Long id, @RequestBody Rents rents ){
        return rentService.createRentForCustomers(id,rents);
    }

    @GetMapping("/getAll")
    public List <Rents> getAllRent(){
      return rentService.rentList();
    }
}
