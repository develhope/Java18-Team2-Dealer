package com.develhope.spring.Purchase;

import com.develhope.spring.Vehicles.EntityofVehicles.Status;
import com.develhope.spring.Vehicles.EntityofVehicles.Vehicles;
import com.develhope.spring.Vehicles.VehiclesController;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchase")
public class PurchaseController {
    @Autowired
    private PurchaseRepository purchaseRepository;
    @Autowired
    private PurchaseService purchaseService;
    @Operation(summary = "Creates purchase for customers")
    @PostMapping("/create/{id}")
    public Vehicles createPurchaseForCustomers(@PathVariable Long id, @RequestBody Purchase purchase){
        return purchaseService.createPurchaseForCustomers(id, purchase);
    }

    @GetMapping("/getAll")
    public List <Purchase> getAllPurchases(){
        return purchaseService.viewMyPurchase();
    }

    @DeleteMapping("/delete")
    public Purchase deletePurchaseForCustomers(@PathVariable Long id){
        return purchaseService.deletePurchaseForCustomers(id);
    }

    @PutMapping("/update")
    public Vehicles updatePurchaseForCustomers(@PathVariable Long id, @RequestBody Purchase purchase){
        return purchaseService.updatePurchaseForCustomers(id, purchase);
    }

    @PostMapping("/create/purchaseble")
    public Purchase purchaseableVehicle(@RequestBody Vehicles vehicles, @PathVariable Status status, @RequestBody Purchase purchase){
        return purchaseService.purchaseableVehicle(vehicles, status, purchase);
    }
    @GetMapping("/purchase")
    public List<Purchase> viewMyPurchase(){return purchaseService.viewMyPurchase();}

}
