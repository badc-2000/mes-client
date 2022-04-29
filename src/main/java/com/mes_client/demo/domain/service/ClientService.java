package com.mes_client.demo.domain.service;

import java.util.List;

import com.mes_client.demo.domain.entity.Client;
import com.mes_client.demo.domain.repository.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ClientService {
    

    ///private Client client;

    @Autowired
    ClientRepository clientRepository;

    public List<Client> getAllClients() {
        List<Client> listAllClients = clientRepository.findAll();
        return listAllClients;
    }

    public Client updateClient(Client client){
        if (clientRepository.existsById(client.getId())) {
            return clientRepository.save(client);

        } else {
            
        }
        return client;
    }

    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    public Client deleteClient(Long id) {
        if (clientRepository.existsById(id)) {
            clientRepository.deleteById(id);
        } else {

        }
        return new Client();
    }
}
