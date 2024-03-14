package com.develhope.spring.Order;

import com.develhope.spring.Vehicles.EntityofVehicles.Vehicles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private OrderService orderService;

    @PostMapping("/createIfIsAvaible")
    public Vehicles createOrderIfIsAvailable(@PathVariable Long id, Vehicles vehicles){
        return orderService.createOrderIfIsAvailable(id, vehicles);
    }
    @PostMapping("/createFotCustomer")
    public Vehicles createOrderForCustomers(@PathVariable Long id, @RequestBody Orders orders){
        return orderService.createOrderForCustomers(id, orders);
    }

    @DeleteMapping("/delete")
    public Orders deleteOrderForCustomers(@PathVariable Long id, @RequestBody Orders orders){
        return orderService.deleteOrderForCustomers(id, orders);
    }

    @PutMapping("/update")
    public Orders updateOrderForCustomers(@PathVariable Long id, @RequestBody Orders orders){
        return orderService.updateOrderForCustomers(id, orders);
    }
    @GetMapping("/allOrder")
    public List<Orders> viewOrders(){
        return orderService.viewOrders();
    }

    @GetMapping("/status/get")
    public String getOrderStatus(@RequestBody Orders orders){
        return orderService.getOrderStatus(orders);
    }
    @PutMapping("/status/update")
    public Orders updateStatus(@RequestBody Orders orders, String status){
        return orderService.updateStatus(orders, status);
    }

    @GetMapping("/isAvailable")
    public boolean isAvailable(boolean isOrdered, @RequestBody Orders orders){
        return orderService.isAvailable(isOrdered, orders);
    }


}
