package com.example.java.basics.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class ProductController {
    static HashMap<Integer, Product> productHashMap = new HashMap<>();
    Product product = new Product("1","Laptop",10);
    public ProductController() {
        productHashMap.put(1, product);
    }
}
