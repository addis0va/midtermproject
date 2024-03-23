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
@Table(name = "programs")

public class Programs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @OneToMany(mappedBy = "programs_id")
    private List<Clients> clients;

    public Long getId() {
        return id;
    }

    public Programs setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public Programs setTitle(String title) {
        this.title = title;
        return this;
    }

    public List<Clients> getClients() {
        return clients;
    }

    public Programs setClients(List<Clients> clients) {
        this.clients = clients;
        return this;
    }
}
