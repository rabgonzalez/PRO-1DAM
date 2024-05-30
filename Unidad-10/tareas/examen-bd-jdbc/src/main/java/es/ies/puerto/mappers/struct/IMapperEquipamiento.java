package es.ies.puerto.mappers.struct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import es.ies.puerto.dto.EquipamientoDTO;
import es.ies.puerto.dto.PersonajeDTO;
import es.ies.puerto.modelo.db.entidades.Equipamiento;

@Mapper
public interface IMapperEquipamiento {
    IMapperEquipamiento INSTANCE = Mappers.getMapper(IMapperEquipamiento.class);

    @Mapping(source = "equipamientoDTO.id", target = "id")
    @Mapping(source = "equipamientoDTO.nombre", target = "nombre")
    @Mapping(source = "personajeDTO.id", target = "personaje_id")
    public Equipamiento equipamientoDTOToEquipamientoEntity(EquipamientoDTO equipamientoDTO, PersonajeDTO personajeDTO);

    public EquipamientoDTO equipamientoEntityToEquipamientoDTO(Equipamiento equipamiento);
}