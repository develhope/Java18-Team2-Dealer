package com.develhope.spring.Purchase;

import com.develhope.spring.Order.OrderRepository;
import com.develhope.spring.Vehicles.EntityofVehicles.Status;
import com.develhope.spring.Vehicles.EntityofVehicles.Vehicles;
import com.develhope.spring.Vehicles.VehiclesRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class PurchaseService {
    private VehiclesRepository vehiclesRepository;
    private PurchaseRepository purchaseRepository;
    private OrderRepository orderRepository;
    //Creare acquisto per un utente (Admin)
    public Vehicles createPurchaseForCustomers(Long id, Purchase purchase){
        if (vehiclesRepository.existsById(id)){
            purchaseRepository.save(purchase);
        }
        return null;
    }

    //Cancellare acquisto per un utente (Admin)
    public Purchase deletePurchaseForCustomers(Long id){
        purchaseRepository.deleteById(id);
        return null;
    }

    //Modificare acquisto per un utente (Admin)
    public Vehicles updatePurchaseForCustomers(Long id, Purchase purchase){
        if (purchaseRepository.existsById(id)){
            purchase.setDeposit(purchase.getDeposit());
            purchase.setPayed(purchase.isPayed());
            purchase.setStatus(purchase.getStatus());
            purchase.setSelled(purchase.isSelled());
            purchaseRepository.save(purchase);
        }
        return null;
    }

    //Creare un acquisto a partire da un veicolo contrassegnato come acquistabile (Customer)
    public Purchase purchaseableVehicle(Vehicles vehicles, Status status, Purchase purchase){
        if (vehicles.getStatus()==status){
            purchaseRepository.save(purchase);
        } return null;
    }


    //Vedere i propri acquisti (Customer)
    public List<Purchase> viewMyPurchase(){
        return purchaseRepository.findAll();
    }

    //Verifica vendite (Admin)


    //Verificare un venditore quante vendite ha fatto in un determinato periodo di tempo (Admin)


    //Verificare un venditore quanti soldi ha generato in un determinato periodo di tempo (Admin)


    //Verificare il guadagno del salone in un determinato periodo (Admin)


    //Verificare i veicoli attualmente ordinabili/acquistabili/non disponibili/nuovi/usati (Admin)



}
