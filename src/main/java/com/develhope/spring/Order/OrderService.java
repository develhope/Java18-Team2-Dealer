package com.develhope.spring.Order;

import com.develhope.spring.Vehicles.EntityofVehicles.Status;
import com.develhope.spring.Vehicles.EntityofVehicles.Vehicles;
import com.develhope.spring.Vehicles.VehiclesRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class OrderService {
    private OrderRepository orderRepository;
    private VehiclesRepository vehiclesRepository;
    //Creare un ordine a partire da un veicolo contrassegnato come ordinabile (Seller, Customer)
    public Vehicles createOrderIfIsAvailable(@PathVariable Long id, Vehicles vehicles){
        if (vehiclesRepository.existsById(id)){
            if(vehicles.getStatus() == Status.Disponibile){
                return vehicles;
            }
        }return null;
    }
    //Creare un ordine per un utente (Admin)
    public Vehicles createOrderForCustomers(@PathVariable Long id, @RequestBody Order order){
        if (vehiclesRepository.existsById(id)){
            orderRepository.save(order);
        }
        return null;
    }

    //Cancellare un ordine per un utente (Admin, Seller, Customer)
    public Order deleteOrderForCustomers(@PathVariable Long id, @RequestBody Order order){
        if (orderRepository.existsById(id)){
            orderRepository.delete(order);
        }
        return null;
    }

    //Modificare un ordine per un utente (Admin, Seller)
    public Order updateOrderForCustomers(@PathVariable Long id, @RequestBody Order order){
        if (orderRepository.existsById(id)){
            orderRepository.save(order);
        }
        return null;
    }


    //Vedere i propri ordini (Customer)
    //      ------ METODO------

    //Verifica stato ordine (Seller)
    //      ------ METODO------

    //Aggiorna stato ordine (Seller)
    //      ------ METODO------

    //Verifica ordini se disponibile o no (Seller)
    //      ------ METODO------

}
