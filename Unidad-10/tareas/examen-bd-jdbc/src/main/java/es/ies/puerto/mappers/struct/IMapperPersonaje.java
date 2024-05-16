package es.ies.puerto.mappers.struct;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import es.ies.puerto.dto.PersonajeDTO;
import es.ies.puerto.modelo.db.entidades.Personaje;

@Mapper(uses = {IMapperAlias.class, IMapperEquipamiento.class, IMapperPoder.class})
public interface IMapperPersonaje {
    IMapperPersonaje INSTANCE = Mappers.getMapper(IMapperPersonaje.class);

    public Personaje personajeDTOToPersonajeEntity(PersonajeDTO personajeDTO);
    public PersonajeDTO personajeEntityToPersonajeDTO(Personaje personaje);
}