package com.example.demo.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Cliente;
import com.example.demo.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List < Cliente > getAllClients() {
        return clienteRepository.findAll();
    }

    @Override
    public void saveClient(Cliente cliente) {
        this.clienteRepository.save(cliente);
    }

    @Override
    public Cliente getClientById(long id) {
        Optional < Cliente > optional = clienteRepository.findById(id);
        Cliente cliente = null;
        if (optional.isPresent()) {
        	cliente = optional.get();
        } else {
            throw new RuntimeException(" Client not found for id :: " + id);
        }
        return cliente;
    }

    @Override
    public void deleteClientById(long id) {
        this.clienteRepository.deleteById(id);
    }
    
}
