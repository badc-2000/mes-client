package com.mes_client.demo.domain.service;

import java.util.List;

import com.mes_client.demo.domain.dto.ClientDto;
import com.mes_client.demo.domain.entity.Client;
import com.mes_client.demo.domain.repository.ClientRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ClientService {
    
    @Autowired
    private ClientDto clientDto;

    @Autowired
    ClientRepository clientRepository;

    public List<Client> getAllClients() {
        List<Client> listAllClients = clientRepository.findAll();
        return listAllClients;
    }

    public ClientDto updateClient(Client client){
        clientDto.setId(client.getId());
        if (clientRepository.existsById(client.getId())) {
            
            clientRepository.save(client);
        } else {
            
        }
        return clientDto;
    }

    public ClientDto saveClient(Client client) {
        clientRepository.save(client);
        clientDto.setCpf(client.getCpf());
        clientDto.setDatanascimento(client.getDatanascimento());
        clientDto.setId(client.getId());
        clientDto.setNome(client.getNome());
        clientDto.setSexo(client.getSexo());
        return clientDto;
    }

    public ClientDto deleteClient(Long id) {
        clientDto.setId(id);
        if (clientRepository.existsById(id)) {
            clientRepository.deleteById(id);
        } else {

        }
        return clientDto;
    }
}
