package com.develhope.spring.Rent;

import com.develhope.spring.User.User;
import com.develhope.spring.Vehicles.EntityofVehicles.Vehicles;
import com.develhope.spring.Vehicles.VehiclesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class RentService {
    private VehiclesRepository vehiclesRepository;
    private RentRepository rentRepository;
    @Autowired
    public RentService (VehiclesRepository vehiclesRepository, RentRepository rentRepository){
        this.vehiclesRepository=vehiclesRepository;
        this.rentRepository=rentRepository;
    }
    //Creare un noleggio per un utente (Admin, Seller)
    public Vehicles createRentForCustomers( Long id, Rents rents){
        if (vehiclesRepository.existsById(id)){
            rents.setStartRent(rents.getStartRent());
            rents.setEndRent(rents.getEndRent());
            rents.setDailyRent(rents.getDailyRent());
            rents.setTotalRent(rents.getTotalRent());
            rents.setPayed(rents.isPayed());
            rents.setRentedVehicle(rents.getRentedVehicle());
            rentRepository.save(rents);
        }
        return null;
    }

    //Cancellare un noleggio per un utente (Admin, Seller)
    public Vehicles deleteRentForCustomers(@PathVariable Long id, @RequestBody Rents rents){
        if (rentRepository.existsById(id)){
            rentRepository.delete(rents);
        }
        return null;
    }

    //Modificare un noleggio per un utente (Admin, Seller)
    public Vehicles updateRentForCustomers(@PathVariable Long id, @RequestBody Rents rents){
        if (rentRepository.existsById(id)){
            rents.setStartRent(rents.getStartRent());
            rents.setEndRent(rents.getEndRent());
            rents.setDailyRent(rents.getDailyRent());
            rents.setTotalRent(rents.getTotalRent());
            rents.setPayed(rents.isPayed());
            rents.setRentedVehicle(rents.getRentedVehicle());
            rentRepository.save(rents);
        }
        return null;
    }

    //Creare un noleggio (Customer)
    //      ------ METODO------

    //Vedere i propri noleggi (Customer)
    public List <Rents> rentList(){
        return rentRepository.findAll();
    }

    //Cancellare un noleggio (Customer)


}
