package kg.alatoo.midtermproject.repositories;


import kg.alatoo.midtermproject.entities.Clients;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClientsRepository {

    List<Clients> findAll();

    Optional<Clients> findById(Long id);

    Clients save(Clients clients);

    void deleteById(Long id);
}

