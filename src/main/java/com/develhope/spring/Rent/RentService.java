package com.develhope.spring.Rent;

import com.develhope.spring.Vehicles.EntityofVehicles.Vehicles;
import com.develhope.spring.Vehicles.VehiclesRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class RentService {
    private VehiclesRepository vehiclesRepository;
    private RentRepository rentRepository;
    //Creare un noleggio per un utente (Admin, Seller)
    public Vehicles createRentForCustomers(@PathVariable Long id, @RequestBody Rent rent){
        if (vehiclesRepository.existsById(id)){
            rent.setStartRent(rent.getStartRent());
            rent.setEndRent(rent.getEndRent());
            rent.setDailyRent(rent.getDailyRent());
            rent.setTotalRent(rent.getTotalRent());
            rent.setPayed(rent.isPayed());
            rent.setRentedVehicle(rent.getRentedVehicle());
            rentRepository.save(rent);
        }
        return null;
    }

    //Cancellare un noleggio per un utente (Admin, Seller)
    public Vehicles deleteRentForCustomers(@PathVariable Long id, @RequestBody Rent rent){
        if (rentRepository.existsById(id)){
            rentRepository.delete(rent);
        }
        return null;
    }

    //Modificare un noleggio per un utente (Admin, Seller)
    public Vehicles updateRentForCustomers(@PathVariable Long id, @RequestBody Rent rent){
        if (rentRepository.existsById(id)){
            rent.setStartRent(rent.getStartRent());
            rent.setEndRent(rent.getEndRent());
            rent.setDailyRent(rent.getDailyRent());
            rent.setTotalRent(rent.getTotalRent());
            rent.setPayed(rent.isPayed());
            rent.setRentedVehicle(rent.getRentedVehicle());
            rentRepository.save(rent);
        }
        return null;
    }

    //Creare un noleggio (Customer)
    //      ------ METODO------

    //Vedere i propri noleggi (Customer)
    //      ------ METODO------

    //Cancellare un noleggio (Customer)
    //      ------ METODO------

}
