package com.develhope.spring;

import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private AdminRepository adminRepository;
    private CustomerRepository customerRepository;
    private SellerRepository sellerRepository;
    private VehiclesRepository vehiclesRepository;
    private PurchaseRepository purchaseRepository;
    private RentRepository rentRepository;
    private OrderRepository orderRepository;

    //Creare un ordine a partire da un veicolo contrassegnato come ordinabile (Customer)
    public Vehicles createOrderIfIsInStock(@PathVariable Long id, Vehicles vehicles){
        if (vehiclesRepository.existsById(id)){
            if(vehicles.isAvailable()){
                return vehicles;
            }
        }return null;
    }

    //Vedere i propri ordini (Customer)
    public List<Order> getAllOrders(@PathVariable Long idOrder){
    if(orderRepository.existsById(idOrder)){
             return orderRepository.findAll();
        }return null;
    }

    //Cancellare un ordine (Customer)
    public List<Order> deleteOrderCustomer(@PathVariable Long idOrder){
        if(orderRepository.existsById(idOrder)){
            orderRepository.deleteById(idOrder);
        }return null;
    }

    //Creare un acquisto a partire da un veicolo contrassegnato come acquistabile (Customer)
    public Vehicles createOrderIfIsAvailable(@PathVariable Long id,@RequestParam Vehicles vehicles){
        if(vehiclesRepository.existsById(id) && vehicles.isAvailable()){

        }
    }

    //Vedere i propri acquisti (Customer)
    //      ------ METODO------

    //Creare un noleggio (Customer)
    //      ------ METODO------

    //Vedere i propri noleggi (Customer)
    //      ------ METODO------

    //Cancellare un noleggio (Customer)
    //      ------ METODO------

    //Cancellare la propria utenza (Customer)
    //      ------ METODO------

    //Modificare i dati dell’utente (Customer)
    //      ------ METODO------

    //Ricercare un veicolo secondo diversi criteri (prezzo, colore, marca, modello, ecc) (Customer)
    //      ------ METODO------

    //Ottenere i dettagli di un veicolo specifico (Customer)
    //      ------ METODO------

}
