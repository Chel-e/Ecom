package com.ecom.ecom.config;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.ecom.ecom.entites.Client;
import com.ecom.ecom.entites.Product;
import com.ecom.ecom.repositories.ClientRepository;
import com.ecom.ecom.repositories.ProductRepository;

@Configuration
public class Instantiation implements CommandLineRunner {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private ProductRepository productRepository;
    @Override
    public void run(String... args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        clientRepository.deleteAll();
        Client c1 = new Client("Maria", "Braga", sdf.parse("11/09/2002"), "BragaMaria@gmail.com", "1233445556");
        clientRepository.save(c1);
        productRepository.deleteAll();
        List<String> snull = new ArrayList<>();
        Product p1 = new Product(null, "As tranças da vovo careca", "livro sobre a vovo", snull, 12, snull, 12.00);
        productRepository.save(p1);
    }   
    
}
