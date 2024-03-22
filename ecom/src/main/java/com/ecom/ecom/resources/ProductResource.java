package com.ecom.ecom.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.ecom.entites.Product;
import com.ecom.ecom.services.ProductService;

@RestController
@RequestMapping (value = "/products")
public class ProductResource {
    @Autowired
    private ProductService productService;
    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> list = productService.findAll();
        return ResponseEntity.ok().body(list);
    }
}