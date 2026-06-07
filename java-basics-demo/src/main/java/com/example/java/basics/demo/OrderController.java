package com.example.java.basics.demo;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class OrderController {
    static HashMap<Integer, Order> orderHashMap = new HashMap<>();
    Order order = new Order(101,"Muscat", "Pending");

    public OrderController(){
        orderHashMap.put(1,order);
    }


}
