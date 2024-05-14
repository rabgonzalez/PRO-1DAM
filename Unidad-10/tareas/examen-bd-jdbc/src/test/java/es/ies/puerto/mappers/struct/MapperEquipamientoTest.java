package es.ies.puerto.mappers.struct;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import es.ies.puerto.dto.EquipamientoDTO;
import es.ies.puerto.mappers.classic.MappersHelp;
import es.ies.puerto.modelo.db.entidades.Equipamiento;

public class MapperEquipamientoTest extends MappersHelp{
    Equipamiento equipamientoMapper;
    EquipamientoDTO equipamientoDTOMapper;

    @Test
    public void equipamientoEntityToEquipamientoDTOTest(){
        equipamientoDTOMapper = IMapperEquipamiento.INSTANCE.equipamientoEntityToEquipamientoDTO(equipamiento, personaje);
        Assertions.assertEquals(equipamientoDTO.getId(), equipamientoDTOMapper.getId());
        Assertions.assertEquals(equipamientoDTO.getNombre(), equipamientoDTOMapper.getNombre());
        Assertions.assertEquals(equipamientoDTO.getDescripcion(), equipamientoDTOMapper.getDescripcion());
        Assertions.assertEquals(equipamientoDTO.getPersonaje_id(), equipamientoDTOMapper.getPersonaje_id());
    }

    @Test
    public void equipamientoDTOToEquipamientoEntityTest(){
        equipamientoMapper = IMapperEquipamiento.INSTANCE.equipamientoDTOToEquipamientoEntity(equipamientoDTO, personajeDTO);
        Assertions.assertEquals(equipamiento.getId(), equipamientoMapper.getId());
        Assertions.assertEquals(equipamiento.getNombre(), equipamientoMapper.getNombre());
        Assertions.assertEquals(equipamiento.getDescripcion(), equipamientoMapper.getDescripcion());
        Assertions.assertEquals(equipamiento.getPersonaje_id(), equipamientoMapper.getPersonaje_id());
    }
}
