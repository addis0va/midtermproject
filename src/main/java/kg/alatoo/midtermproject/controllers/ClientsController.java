package kg.alatoo.midtermproject.controllers;

import ch.qos.logback.core.net.server.Client;
import jakarta.validation.Valid;
import kg.alatoo.midtermproject.entities.Clients;
import kg.alatoo.midtermproject.services.ClientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clients")
public class ClientsController {


    @Autowired
    private ClientsService clientsService;


    @GetMapping
    public ResponseEntity<List<Clients>> getAllClients() {
        List<Clients> clients = clientsService.getAllClients();
        return new ResponseEntity<>(clients, HttpStatus.OK);
    }

        @GetMapping("/{id}")
        public ResponseEntity<Clients> getClientById(@PathVariable Long id) {
            Optional<Clients> client = clientsService.getClientById(id);
            return client.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                    .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
        }


        @PostMapping
        public ResponseEntity<Clients> createClient(@Valid @RequestBody Clients clients) {
            Clients savedClient = clientsService.saveClient(clients);
            return new ResponseEntity<>(savedClient, HttpStatus.CREATED);
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deleteClient(@PathVariable Long id) {
            clientsService.deleteClient(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }


}

