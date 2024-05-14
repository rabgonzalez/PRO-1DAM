package es.ies.puerto.mappers.struct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import es.ies.puerto.dto.EquipamientoDTO;
import es.ies.puerto.dto.PersonajeDTO;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.db.entidades.Personaje;

@Mapper(uses = IMapperPersonaje.class)
public interface IMapperEquipamiento {
    IMapperEquipamiento INSTANCE = Mappers.getMapper(IMapperEquipamiento.class);

    @Mapping(source = "equipamientoDTO.id", target = "id")
    @Mapping(source = "equipamientoDTO.nombre", target = "nombre")
    @Mapping(source = "personajeDTO.id", target = "personaje_id")
    public Equipamiento equipamientoDTOToEquipamientoEntity(EquipamientoDTO equipamientoDTO, PersonajeDTO personajeDTO);

    @Mapping(source = "equipamiento.id", target = "id")
    @Mapping(source = "equipamiento.nombre", target = "nombre")
    @Mapping(source = "personaje.id", target = "personaje_id")
    public EquipamientoDTO equipamientoEntityToEquipamientoDTO(Equipamiento equipamiento, Personaje personaje);
} 
