package es.ies.puerto.mappers.struct;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import es.ies.puerto.dto.PersonajeDTO;
import es.ies.puerto.mappers.classic.MappersHelp;
import es.ies.puerto.modelo.db.entidades.Personaje;

public class MapperPersonajeTest extends MappersHelp {
    Personaje personajeMapper;
    PersonajeDTO personajeDTOMapper;

    @Test
    public void personajeEntityToPersonajeDTOTest(){
        personajeDTOMapper = IMapperPersonaje.INSTANCE.personajeEntityToPersonajeDTO(personaje);
        Assertions.assertEquals(personajeDTO.getId(), personajeDTOMapper.getId());
        Assertions.assertEquals(personajeDTO.getNombre(), personajeDTOMapper.getNombre());
        Assertions.assertEquals(personajeDTO.getGenero(), personajeDTOMapper.getGenero());
        Assertions.assertEquals(personajeDTO.getAlias(), personajeDTOMapper.getAlias());
        Assertions.assertEquals(personajeDTO.getEquipamientos(), personajeDTOMapper.getEquipamientos());
        Assertions.assertEquals(personajeDTO.getPoderes(), personajeDTOMapper.getPoderes());
    }

    @Test
    public void personajeDTOToPersonajeEntityTest(){
        personajeMapper = IMapperPersonaje.INSTANCE.personajeDTOToPersonajeEntity(personajeDTO);
        Assertions.assertEquals(personaje.getId(), personajeMapper.getId());
        Assertions.assertEquals(personaje.getNombre(), personajeMapper.getNombre());
        Assertions.assertEquals(personaje.getGenero(), personajeMapper.getGenero());
        Assertions.assertEquals(personaje.getAlias(), personajeMapper.getAlias());
        Assertions.assertEquals(personaje.getEquipamientos(), personajeMapper.getEquipamientos());
        Assertions.assertEquals(personaje.getPoderes(), personajeMapper.getPoderes());
    }
}
