package kg.alatoo.midtermproject.services;
import kg.alatoo.midtermproject.entities.Coach;
import kg.alatoo.midtermproject.repositories.CoachRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CoachService {

    @Autowired
    private CoachRepository coachRepository;

    public List<Coach> getAllCoaches() {
        return coachRepository.findAll();
    }

    public Optional<Coach> getCoachById(Long id) {
        return coachRepository.findById(id);
    }

    public Coach saveCoach(Coach coach) {
        return coachRepository.save(coach);
    }

    public void deleteCoach(Long id) {
        coachRepository.deleteById(id);
    }
}
