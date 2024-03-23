package kg.alatoo.midtermproject.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "coach")

public class Coach {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "coach_id")
    private List<Clients> clients;

    @ManyToOne
    @JoinColumn(name = "programs_id")
    private Programs program;

    public Long getId() {
        return id;
    }

    public Coach setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Coach setName(String name) {
        this.name = name;
        return this;
    }

    public List<Clients> getClients() {
        return clients;
    }

    public Coach setClients(List<Clients> clients) {
        this.clients = clients;
        return this;
    }

    public Programs getProgram() {
        return program;
    }

    public Coach setProgram(Programs program) {
        this.program = program;
        return this;
    }
}
