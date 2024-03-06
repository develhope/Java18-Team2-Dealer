package com.develhope.spring.Purchase;

import com.develhope.spring.Rent.RentRepository;
import com.develhope.spring.Vehicles.EntityofVehicles.Vehicles;
import com.develhope.spring.Vehicles.VehiclesRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class PurchaseService {
    private VehiclesRepository vehiclesRepository;
    private PurchaseRepository purchaseRepository;
    //Creare acquisto per un utente (Admin)
    public Vehicles createPurchaseForCustomers(@PathVariable Long id, @RequestBody Purchase purchase){
        if (vehiclesRepository.existsById(id)){
            purchaseRepository.save(purchase);
        }
        return null;
    }

    //Cancellare acquisto per un utente (Admin)
    public void deletePurchaseForCustomers(@PathVariable Long id){
        purchaseRepository.deleteById(id);
    }

    //Modificare acquisto per un utente (Admin)
    public Vehicles updatePurchaseForCustomers(@PathVariable Long id, @RequestBody Purchase purchase){
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
    //      ------ METODO------

    //Vedere i propri acquisti (Customer)

    //      ------ METODO------
    //Verifica vendite (Admin)

    //      ------ METODO------
    //Verificare un venditore quante vendite ha fatto in un determinato periodo di tempo (Admin)

    //      ------ METODO------
    //Verificare un venditore quanti soldi ha generato in un determinato periodo di tempo (Admin)

    //      ------ METODO------
    //Verificare il guadagno del salone in un determinato periodo (Admin)

    //      ------ METODO------
    //Verificare i veicoli attualmente ordinabili/acquistabili/non disponibili/nuovi/usati (Admin)

    //      ------ METODO------

}
