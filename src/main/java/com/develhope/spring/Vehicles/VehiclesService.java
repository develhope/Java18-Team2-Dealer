package com.develhope.spring.Vehicles;

import com.develhope.spring.Vehicles.EntityofVehicles.Status;
import com.develhope.spring.Vehicles.EntityofVehicles.Vehicles;
import com.develhope.spring.Vehicles.EntityofVehicles.VehiclesDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class VehiclesService {
    private VehiclesRepository vehiclesRepository;

    @Autowired
    public VehiclesService(VehiclesRepository vehiclesRepository) {
        this.vehiclesRepository = vehiclesRepository;
    }
    //Lista veicoli
    public List<VehiclesDTO> getAllVehicles(){
        List<Vehicles> vehicles = vehiclesRepository.findAll();
        List<VehiclesDTO>vehiclesDTOS = vehicles.stream().map(vehicle -> new VehiclesDTO(vehicle.getId(),vehicle.getType(),vehicle.getBrand(),
                vehicle.getModel(),vehicle.getDisplacement(),vehicle.getColor(),vehicle.getPower(),
                vehicle.getTransmissionType(),vehicle.getYearOfRegistration(),vehicle.getFuelType(),
                vehicle.getPrice(), vehicle.getDiscountPrice(),vehicle.getAccessories(),vehicle.getCondition(),vehicle.getStatus())).toList();
        return vehiclesDTOS;
    }

    //Aggiungere un veicolo (Admin)
    public VehiclesDTO createVehicles(VehiclesDTO vehiclesDTO){
        Vehicles newVehicles = new Vehicles(vehiclesDTO.getId(),vehiclesDTO.getType(),vehiclesDTO.getBrand(),
                vehiclesDTO.getModel(),vehiclesDTO.getDisplacement(),vehiclesDTO.getColor(),vehiclesDTO.getPower(),
        vehiclesDTO.getTransmissionType(),vehiclesDTO.getYearOfRegistration(),vehiclesDTO.getFuelType(),
                vehiclesDTO.getPrice(), vehiclesDTO.getDiscountPrice(),vehiclesDTO.getAccessories(),vehiclesDTO.getCondition(),vehiclesDTO.getStatus());
               newVehicles= vehiclesRepository.save(newVehicles);
        return new VehiclesDTO(newVehicles.getId(),newVehicles.getType(),newVehicles.getBrand(),
                newVehicles.getModel(),newVehicles.getDisplacement(),newVehicles.getColor(),newVehicles.getPower(),
                newVehicles.getTransmissionType(),newVehicles.getYearOfRegistration(),newVehicles.getFuelType(),
                newVehicles.getPrice(), newVehicles.getDiscountPrice(),newVehicles.getAccessories(),newVehicles.getCondition(),
                newVehicles.getStatus());
    }

    //Cancellare un veicolo (Admin)
    public Vehicles deleteAVeicles(Long id){
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
