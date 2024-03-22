package kg.alatoo.midtermproject.repositories;

import kg.alatoo.midtermproject.entities.Coach;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CoachRepository {

    List<Coach> findAll();

    Optional<Coach> findById(Long id);

    Coach save(Coach coach);

    void deleteById(Long id);
}
