package kg.alatoo.midtermproject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProgramsDTO {
    private Long id;
    private String title;
    private Long clientId;

    public Long getId() {
        return id;
    }

    public ProgramsDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public ProgramsDTO setTitle(String title) {
        this.title = title;
        return this;
    }

    public Long getClientId() {
        return clientId;
    }

    public ProgramsDTO setClientId(Long clientId) {
        this.clientId = clientId;
        return this;
    }
}
