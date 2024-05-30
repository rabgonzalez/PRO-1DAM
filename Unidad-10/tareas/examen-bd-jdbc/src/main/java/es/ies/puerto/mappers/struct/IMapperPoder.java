package es.ies.puerto.mappers.struct;

import java.util.Set;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import es.ies.puerto.dto.PersonajeDTO;
import es.ies.puerto.dto.PoderDTO;
import es.ies.puerto.modelo.db.entidades.Poder;

@Mapper
public interface IMapperPoder {
    IMapperPoder INSTANCE = Mappers.getMapper(IMapperPoder.class);

    @Mapping(source = "personajeDTO", target = "personaje")
    public Poder poderDTOToPoderEntity(PoderDTO poderDTO, Set<PersonajeDTO> personajeDTO);
    public PoderDTO poderEntityToPoderDTO(Poder poder);
} 
