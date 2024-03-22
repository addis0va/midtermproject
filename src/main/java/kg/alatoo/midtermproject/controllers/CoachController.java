package kg.alatoo.midtermproject.controllers;

import kg.alatoo.midtermproject.entities.Coach;
import kg.alatoo.midtermproject.services.CoachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/coach")
public class CoachController {
    @Autowired
    private CoachService coachService;

    @GetMapping
    public ResponseEntity<List<Coach>> getAllCoaches() {
        List<Coach> coaches = coachService.getAllCoaches();
        return new ResponseEntity<>(coaches, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Coach> getCoachById(@PathVariable Long id) {
        Optional<Coach> coach = coachService.getCoachById(id);
        return coach.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Coach> createCoach(@RequestBody Coach coach) {
        Coach savedCoach = coachService.saveCoach(coach);
        return new ResponseEntity<>(savedCoach, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCoach(@PathVariable Long id) {
        coachService.deleteCoach(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
