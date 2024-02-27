package com.develhope.spring;

import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

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
    public Vehicles createOrderIfIsAvailable(@PathVariable Long id, Vehicles vehicles){
        if (vehiclesRepository.existsById(id)){
            if(vehicles.isAvailable()){
                return vehicles;
            }
        }return null;
    }

    //Vedere i propri ordini (Customer)

    //Cancellare un ordine (Customer)
    //      ------ METODO------

    //Creare un acquisto a partire da un veicolo contrassegnato come acquistabile (Customer)
    //      ------ METODO------

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
