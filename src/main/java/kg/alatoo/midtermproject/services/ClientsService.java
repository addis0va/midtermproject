package kg.alatoo.midtermproject.services;


import kg.alatoo.midtermproject.entities.Clients;
import kg.alatoo.midtermproject.repositories.ClientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientsService {
    @Autowired
    private ClientsRepository clientsRepository;

    public List<Clients> getAllClients() {
        return clientsRepository.findAll();
    }

    public Optional<Clients> getClientById(Long id) {
        return clientsRepository.findById(id);
    }

    public Clients saveClient(Clients clients) {
        return clientsRepository.save(clients);
    }

    public void deleteClient(Long id) {
        clientsRepository.deleteById(id);
    }
}
