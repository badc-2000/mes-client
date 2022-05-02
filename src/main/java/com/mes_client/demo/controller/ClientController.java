package com.mes_client.demo.controller;

import java.util.List;

import com.mes_client.demo.domain.dto.ClientDto;
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

    @Autowired
    private ClientDto clientDto;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClientDto saveClient(@RequestBody Client client) {
        return clientService.saveClient(client);
    }


    @PutMapping
    public ClientDto updatedClient(@RequestBody Client client){
        return clientService.updateClient(client);
    }

    @DeleteMapping(value = "/{id}")
    public ClientDto deleteClient(@PathVariable Long id){
        return clientService.deleteClient(id);
    }

    @GetMapping(value = "/list")
    public List<Client> getAllClients(){
        return clientService.getAllClients();
    }
    
}