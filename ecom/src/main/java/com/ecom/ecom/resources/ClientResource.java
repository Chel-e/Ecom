package com.ecom.ecom.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.ecom.entites.Client;
import com.ecom.ecom.services.ClientService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping (value = "/clients")
public class ClientResource {
    @Autowired
    private ClientService clientService;
    @GetMapping
    public String findAll() {
        List<Client> list = clientService.findAll();
        return list.toString();
    }
    @GetMapping("/")
    public String index() {
        return "index";
    }
    
}
