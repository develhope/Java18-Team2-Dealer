package com.develhope.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceDealer {

    @Autowired
    private AdminRepository adminRepository;
    private CustomerRepository customerRepository;
    private SellerRepository sellerRepository;
    private VehiclesRepository vehiclesRepository;
    private PurchaseRepository purchaseRepository;
    private RentRepository rentRepository;
    private OrderRepository orderRepository;

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
            vehicles.setType(vehicles.getType());
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
            vehicles.setAvailable(vehicles.isAvailable());
            return vehiclesRepository.save(vehicles);
        }else return new Vehicles();
    }

    //Cambiare lo stato del veicolo (Admin)
    public void setIsAvailable(Long id, boolean isAvailable){
        Optional<Vehicles> vehicle= vehiclesRepository.findById(id);
        if (!vehicle.isPresent()) return;
        vehicle.get().setAvailable(isAvailable);
        vehiclesRepository.save(vehicle.get());
    }

    //Creare un ordine per un utente (Admin)
    public Vehicles createOrderForCustomers(@PathVariable Long id, @RequestBody Order order){
        if (vehiclesRepository.existsById(id)){
            orderRepository.save(order);
        }
        return null;
    }

    //Cancellare un ordine per un utente (Admin)
    public Order deleteOrderForCustomers(@PathVariable Long id, @RequestBody Order order){
        if (orderRepository.existsById(id)){
            orderRepository.delete(order);
        }
        return null;
    }

    //Modificare un ordine per un utente (Admin)
    public Order updateOrderForCustomers(@PathVariable Long id, @RequestBody Order order){
        if (orderRepository.existsById(id)){
            orderRepository.save(order);
        }
        return null;
}

    //Creare un noleggio per un utente (Admin)
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

    //Cancellare un noleggio per un utente (Admin)
    public Vehicles deleteRentForCustomers(@PathVariable Long id, @RequestBody Rent rent){
        if (rentRepository.existsById(id)){
            rentRepository.delete(rent);
        }
        return null;
    }

    //Modificare un noleggio per un utente (Admin)
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

    //Cancellare un utente (Admin)
    public void deleteACustomers(@PathVariable Long id){
        customerRepository.deleteById(id);
    }

    //Modificare un utente (Admin)
    public Customer updateCustomer(@PathVariable Long id,@RequestBody Customer customer){
        Optional<Customer> optionalCustomer = customerRepository.findById(id);
        if (optionalCustomer.isPresent()){
            customer.setName(customer.getName());
            customer.setSurname(customer.getSurname());
            customer.setPhoneNumber(customer.getPhoneNumber());
            customer.setEmail(customer.getEmail());
            customer.setPassword(customer.getPassword());
            return customerRepository.save(customer);
        }else return new Customer();
    }

    //Cancellare un venditore (Admin)
    public void deleteASeller(@PathVariable Long id){
        sellerRepository.deleteById(id);
    }

    //Modificare un venditore (Admin)
    public Seller updateSeller(@PathVariable Long id,@RequestBody Seller seller){
        Optional<Seller> optionalSeller = sellerRepository.findById(id);
        if (optionalSeller.isPresent()){
            seller.setName(seller.getName());
            seller.setSurname(seller.getSurname());
            seller.setPhoneNumber(seller.getPhoneNumber());
            seller.setEmail(seller.getEmail());
            seller.setPassword(seller.getPassword());
            return sellerRepository.save(seller);
        }else return new Seller();
    }

    //Ottenere il veicolo più venduto in un dato periodo (Admin)
    //      ------ METODO------

    //Ottenere il veicolo con valore più alto venduto fino a quel dato istante (Admin)
    //      ------ METODO------

    //Ottenere il veicolo più ricercato/ordinato (Admin)
    //      ------ METODO------

/*------------------------------------------------------------------------------------------------------------------*/
    //Creare un ordine a partire da un veicolo contrassegnato come ordinabile (Customer)
    //      ------ METODO------

    //Vedere i propri ordini (Customer)
    //      ------ METODO------

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
/*-----------------------------------------------------------------------------------------------------------------*/
    //Dettagli veicolo (Seller)
    //      ------ METODO------

    //Creazione ordine veicolo disponibile (Seller)
    //      ------ METODO------

    //Cancellazione ordine creato (Seller)
    //      ------ METODO------

    //Modificare ordine creato (Seller)
    //      ------ METODO------

    //Verifica stato ordine (Seller)
    //      ------ METODO------

    //Aggiorna stato ordine (Seller)
    //      ------ METODO------

    //Verifica ordini se disponibile o no (Seller)
    //      ------ METODO------

    //Creare un noleggio (Seller)
    //      ------ METODO------

    //Cancellare un noleggio (Seller)
    //      ------ METODO------

    //Modificare un noleggio (Seller)
    //      ------ METODO------











}
