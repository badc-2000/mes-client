package com.mes_client.demo.controller;

import java.util.List;

import com.mes_client.demo.domain.entity.Client;
import com.mes_client.demo.domain.service.ClientService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;



@RestController
@AllArgsConstructor
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Client saveClient(@RequestBody Client client) {
        return clientService.saveClient(client);
    }


    @PutMapping
    public Client updatedClient(@RequestBody Client client){
        return clientService.updateClient(client);
    }

    @DeleteMapping(value = "/{id}")
    public Client deleteClient(@PathVariable Long id){
        return clientService.deleteClient(id);
    }

    @GetMapping(value = "/list")
    public List<Client> getAllClients(){
        return clientService.getAllClients();
    }
    
}