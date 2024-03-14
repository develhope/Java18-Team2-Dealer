package com.develhope.spring.Order;

import com.develhope.spring.Vehicles.EntityofVehicles.Status;
import com.develhope.spring.Vehicles.EntityofVehicles.Vehicles;
import com.develhope.spring.Vehicles.VehiclesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private OrderRepository orderRepository;
    private VehiclesRepository vehiclesRepository;
    //Creare un ordine a partire da un veicolo contrassegnato come ordinabile (Seller, Customer)
    public Vehicles createOrderIfIsAvailable(Long id, Vehicles vehicles){
        if (vehiclesRepository.existsById(id)){
            if(vehicles.getStatus() == Status.DISPONIBILE){
                return vehicles;
            }
        }return null;
    }
    //Creare un ordine per un utente (Admin)
    public Vehicles createOrderForCustomers(Long id, Orders orders){
        if (vehiclesRepository.existsById(id)){
            orderRepository.save(orders);
        }
        return null;
    }

    //Cancellare un ordine per un utente (Admin, Seller, Customer)
    public Orders deleteOrderForCustomers(Long id, Orders orders){
        if (orderRepository.existsById(id)){
            orderRepository.delete(orders);
        }
        return null;
    }

    //Modificare un ordine per un utente (Admin, Seller)
    public Orders updateOrderForCustomers(Long id, Orders orders){
        if (orderRepository.existsById(id)){
            orderRepository.save(orders);
        }
        return null;
    }


    //Vedere i propri ordini (Customer)
    public List<Orders> viewOrders(){
        return orderRepository.findAll();
    }

    //Verifica stato ordine (Seller)
    public String getOrderStatus(Orders orders){
        return orders.getStatus();
    }


    //Aggiorna stato ordine (Seller)
   public Orders updateStatus(Orders orders, String status){
        orders.setStatus(status);
       return orders;
   }

    //Verifica ordini se disponibile o no (Seller)
   public boolean isAvailable(boolean isOrdered, Orders orders){
        if(orders.isOrdered()==isOrdered){
            return orders.isOrdered();
        }
       return false;
   }

}
