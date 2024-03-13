package com.develhope.spring.Vehicles;

import com.develhope.spring.Vehicles.EntityofVehicles.Status;
import com.develhope.spring.Vehicles.EntityofVehicles.Vehicles;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class VehiclesService {
    private VehiclesRepository vehiclesRepository;
    //Lista veicoli
    public List<Vehicles> getAllVehicles(){
        return vehiclesRepository.findAll();
    }

    //Aggiungere un veicolo (Admin)
    public Vehicles createVehicles(@RequestBody Vehicles vehicles){
        Vehicles createdVehicles = vehiclesRepository.save(vehicles);
        return createdVehicles;
    }

    //Cancellare un veicolo (Admin)
    public Vehicles deleteAVeicles(@PathVariable Long id){
        if (vehiclesRepository.existsById(id)) {
            vehiclesRepository.deleteById(id);
        }
        return null;
    }

    //Modificare un veicolo (Admin)
    public Vehicles updateVehicles(@PathVariable Long id,@RequestBody Vehicles vehicles){
        Optional<Vehicles> optionalVehicle = vehiclesRepository.findById(id);
        if (optionalVehicle.isPresent()){
            vehicles.setBrand(vehicles.getBrand());
            vehicles.setModel(vehicles.getModel());
            vehicles.setDisplacement(vehicles.getDisplacement());
            vehicles.setColor(vehicles.getColor());
            vehicles.setPower(vehicles.getPower());
            vehicles.setTransmissionType(vehicles.getTransmissionType());
            vehicles.setYearOfRegistration(vehicles.getYearOfRegistration());
            vehicles.setFuelType(vehicles.getFuelType());
            vehicles.setPrice(vehicles.getPrice());
            vehicles.setDiscountPrice(vehicles.getDiscountPrice());
            vehicles.setAccessories(vehicles.getAccessories());
            vehicles.setCondition(vehicles.getCondition());
            vehicles.setStatus(vehicles.getStatus());
            return vehiclesRepository.save(vehicles);
        }else return new Vehicles();
    }

    //Cambiare lo stato del veicolo (Admin)
    public void setIsAvailable(Long id, Status status){
        Optional<Vehicles> vehicle= vehiclesRepository.findById(id);
        if (!vehicle.isPresent()) return;
        vehicle.get().setStatus(status);
        vehiclesRepository.save(vehicle.get());
    }

    //Ricercare un veicolo secondo diversi criteri (prezzo, colore, marca, modello, ecc) (Customer)
    //      ------ METODO------

    //Ottenere i dettagli di un veicolo specifico (Customer)
    //      ------ METODO------
    public Optional<Vehicles> searchVehicleById(Long id){
        if(vehiclesRepository.existsById(id)){
            return vehiclesRepository.findById(id);
        }
        return Optional.empty();
    }
    //Ottenere il veicolo più venduto in un dato periodo (Admin)
    //      ------ METODO------
//    public Vehicles vehicleMostSold(@PathVariable Long id, @RequestBody Vehicles vehicles){
//        Vehicles vehicleMostSold = null;
//        if
//    }


    //Ottenere il veicolo con valore più alto venduto fino a quel dato istante (Admin)
    //      ------ METODO------

    //Ottenere il veicolo più ricercato/ordinato (Admin)
    //      ------ METODO------

    //Dettagli veicolo (Seller)
    //      ------ METODO------
}
