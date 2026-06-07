package com.example.java.basics.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class ProductController {
    static HashMap<Integer, Product> productHashMap = new HashMap<>();
    Product product = new Product(1,"Laptop",10);
    public ProductController() {
        productHashMap.put(1, product);
    }

    @PutMapping("/updateStock/{id}")
    public String  updateStock(@PathVariable int id, @RequestParam int newStockQuantity){
        if(productHashMap.containsKey(id)){
            Product product = productHashMap.get(id);
            product.setStockQuantity(newStockQuantity);
            return "ID: "+product.getId() +" Name: "  + product.getName() +" Quantity: "+  product.getStockQuantity();

        }
       return "Product not found";
    }

}
