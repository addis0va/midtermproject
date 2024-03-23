package kg.alatoo.midtermproject.mappers;

import kg.alatoo.midtermproject.dto.ProgramsDTO;
import kg.alatoo.midtermproject.entities.Programs;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

public interface ProgramsMapper {
    ProgramsMapper INSTANCE = Mappers.getMapper(ProgramsMapper.class);

    @Mapping(source = "client.id", target = "clientId")
    ProgramsDTO toDto(Programs programs);

    Programs toEntity(ProgramsDTO dto);
}
