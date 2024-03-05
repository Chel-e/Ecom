package com.ecom.ecom.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecom.ecom.repositories.ClientRepository;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

}
