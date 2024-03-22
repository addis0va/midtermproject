package kg.alatoo.midtermproject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientsDTO {
    private Long id;
    private String name;
    private Long coachId;
    private Long programId;

    public Long getId() {
        return id;
    }

    public ClientsDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public ClientsDTO setName(String name) {
        this.name = name;
        return this;
    }

    public Long getCoachId() {
        return coachId;
    }

    public ClientsDTO setCoachId(Long coachId) {
        this.coachId = coachId;
        return this;
    }

    public Long getProgramId() {
        return programId;
    }

    public ClientsDTO setProgramId(Long programId) {
        this.programId = programId;
        return this;
    }
}
