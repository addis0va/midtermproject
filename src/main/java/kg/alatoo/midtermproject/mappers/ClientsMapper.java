package kg.alatoo.midtermproject.mappers;

import kg.alatoo.midtermproject.dto.ClientsDTO;
import kg.alatoo.midtermproject.entities.Clients;
import kg.alatoo.midtermproject.entities.Coach;
import kg.alatoo.midtermproject.entities.Programs;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClientsMapper {
    ClientsMapper INSTANCE = Mappers.getMapper(ClientsMapper.class);

    @Mapping(source = "coach.id", target = "coachId")
    @Mapping(source = "programs.id", target = "programId")
    ClientsDTO toDto(Clients clients);

    Clients toEntity(ClientsDTO dto);
}
