package kg.alatoo.midtermproject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CoachDTO {
    private Long id;
    private String name;
    private Long programId;

    public Long getId() {
        return id;
    }

    public CoachDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CoachDTO setName(String name) {
        this.name = name;
        return this;
    }

    public Long getProgramId() {
        return programId;
    }

    public CoachDTO setProgramId(Long programId) {
        this.programId = programId;
        return this;
    }
}
