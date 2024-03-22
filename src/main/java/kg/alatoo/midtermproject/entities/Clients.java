package kg.alatoo.midtermproject.entities;

import jakarta.persistence.*;
import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "clients")

public class Clients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "coach_id")
    private Coach coach;

    @ManyToOne
    @JoinColumn(name = "program_id")
    private Programs programs;

    public Long getId() {
        return id;
    }

    public Clients setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Clients setName(String name) {
        this.name = name;
        return this;
    }

    public Coach getCoach() {
        return coach;
    }

    public Clients setCoach(Coach coach) {
        this.coach = coach;
        return this;
    }

    public Programs getPrograms() {
        return programs;
    }

    public Clients setPrograms(Programs programs) {
        this.programs = programs;
        return this;
    }
}
