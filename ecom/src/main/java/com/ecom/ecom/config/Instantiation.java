package com.ecom.ecom.config;

import java.text.SimpleDateFormat;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.ecom.ecom.entites.Client;
import com.ecom.ecom.repositories.ClientRepository;

@Configuration
public class Instantiation implements CommandLineRunner {
    @Autowired
    private ClientRepository clientRepository;
    @Override
    public void run(String... args) throws Exception {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        clientRepository.deleteAll();
        Client c1 = new Client("Maria", "Braga", sdf.parse("11/09/2002"), "BragaMaria@gmail.com", "1233445556");
        clientRepository.save(c1);
    }   
    
}
