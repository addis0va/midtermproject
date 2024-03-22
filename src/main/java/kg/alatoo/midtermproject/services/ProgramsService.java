package kg.alatoo.midtermproject.services;

import kg.alatoo.midtermproject.entities.Programs;
import kg.alatoo.midtermproject.repositories.ProgramsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProgramsService {

    @Autowired

    private ProgramsRepository programsRepository;

    public List<Programs> getAllPrograms() {
        return programsRepository.findAll();
    }

    public Optional<Programs> getProgramById(Long id) {
            return programsRepository.findById(id);
        }

        public Programs saveProgram(Programs programs) {
            return programsRepository.save(programs);
        }

        public void deleteProgram(Long id) {
            programsRepository.deleteById(id);
    }
}

