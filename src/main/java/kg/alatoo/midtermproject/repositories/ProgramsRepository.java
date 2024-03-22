package kg.alatoo.midtermproject.repositories;

import kg.alatoo.midtermproject.entities.Programs;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProgramsRepository {

    List<Programs> findAll();

    Optional<Programs> findById(Long id);

    Programs save(Programs programs);

    void deleteById(Long id);
}
