package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Cliente;
import com.example.demo.service.ClienteService;

@Controller
public class ClienteController {

	@Autowired
    private ClienteService clienteService;

    // display list of employees
    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listClients", clienteService.getAllClients());
        return "index";
    }

    @GetMapping("/showNewClientForm")
    public String showNewClientForm(Model model) {
        // create model attribute to bind form data
    	Cliente cliente = new Cliente();
        model.addAttribute("client", cliente);
        return "new_client";
    }

    @PostMapping("/saveClient")
    public String saveClient(@ModelAttribute("client") Cliente cliente) {
        // save employee to database
    	clienteService.saveClient(cliente);
        return "redirect:/";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {

        // get employee from the service
    	Cliente cliente = clienteService.getClientById(id);

        // set employee as a model attribute to pre-populate the form
        model.addAttribute("client", cliente);
        return "update_client";
    }

    @GetMapping("/deleteClient/{id}")
    public String deleteClient(@PathVariable(value = "id") long id) {

        // call delete employee method 
        this.clienteService.deleteClientById(id);
        return "redirect:/";
    }
	
}
