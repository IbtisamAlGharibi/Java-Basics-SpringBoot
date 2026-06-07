package com.example.java.basics.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class OrderController {
    static HashMap<Integer, Order> orderHashMap = new HashMap<>();
    Order order = new Order(101,"Muscat", "Pending");

    public OrderController(){
        orderHashMap.put(1,order);
    }

    @PutMapping("/updateOrder/{orderId}")
    public String updateOrder(@PathVariable int orderId, @RequestParam String newAddress, @RequestParam String newStatus){
        if(orderHashMap.containsKey(orderId)){
          Order order = orderHashMap.get(orderId);
            order.setShippingAddress(newAddress);
            order.setOrderStatus(newStatus);
            return "ID: "+order.getOrderId() +" Shipping Address : "  + order.getShippingAddress() +" Status: "+  order.getOrderStatus();

        }
        return "Order not found";

    }
}
