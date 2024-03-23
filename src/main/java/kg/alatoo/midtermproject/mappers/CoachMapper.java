package kg.alatoo.midtermproject.mappers;

import kg.alatoo.midtermproject.dto.CoachDTO;
import kg.alatoo.midtermproject.entities.Coach;
import kg.alatoo.midtermproject.entities.Programs;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CoachMapper {
    CoachMapper INSTANCE = Mappers.getMapper(CoachMapper.class);

    @Mapping(source = "program.id", target = "programId")
    CoachDTO toDto(Coach coach);

    Coach toEntity(CoachDTO dto);
}
