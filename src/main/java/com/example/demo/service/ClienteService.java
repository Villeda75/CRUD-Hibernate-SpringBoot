package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Component;
import com.example.demo.model.Cliente;

public interface ClienteService {
	List <Cliente> getAllClients();
    void saveClient(Cliente client);
    Cliente getClientById(long id);
    void deleteClientById(long id);
}
