package kg.alatoo.midtermproject.controllers;

import kg.alatoo.midtermproject.entities.Programs;
import kg.alatoo.midtermproject.services.ProgramsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/programs")
public class ProgramsController {
    @Autowired
    private ProgramsService programService;

    @GetMapping
    public ResponseEntity<List<Programs>> getAllPrograms() {
        List<Programs> programs = programService.getAllPrograms();
        return new ResponseEntity<>(programs, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Programs> getProgramById(@PathVariable Long id) {
        Optional<Programs> program = programService.getProgramById(id);
        return program.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Programs> createProgram(@RequestBody Programs programs) {
        Programs savedProgram = programService.saveProgram(programs);
        return new ResponseEntity<>(savedProgram, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProgram(@PathVariable Long id) {
        programService.deleteProgram(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
