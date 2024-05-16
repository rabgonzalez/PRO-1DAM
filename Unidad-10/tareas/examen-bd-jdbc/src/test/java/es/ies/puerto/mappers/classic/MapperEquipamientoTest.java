package es.ies.puerto.mappers.classic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import es.ies.puerto.dto.EquipamientoDTO;
import es.ies.puerto.modelo.db.entidades.Equipamiento;

public class MapperEquipamientoTest extends MappersHelp{
    Equipamiento equipamientoMapper;
    EquipamientoDTO equipamientoDTOMapper;
    MapperEquipamiento mapperEquipamiento;

    @Test
    public void equipamientoEntityToEquipamientoDTOTest(){
        equipamientoDTOMapper = mapperEquipamiento.equipamientoEntityToEquipamientoDTO(equipamiento);
        Assertions.assertEquals(equipamientoDTO.getId(), equipamientoDTOMapper.getId());
        Assertions.assertEquals(equipamientoDTO.getNombre(), equipamientoDTOMapper.getNombre());
        Assertions.assertEquals(equipamientoDTO.getDescripcion(), equipamientoDTOMapper.getDescripcion());
    }

    @Test
    public void equipamientoDTOToEquipamientoEntityTest(){
        equipamientoMapper = mapperEquipamiento.equipamientoDTOToEquipamientoEntity(equipamientoDTO, personaje);
        Assertions.assertEquals(equipamiento.getId(), equipamientoMapper.getId());
        Assertions.assertEquals(equipamiento.getNombre(), equipamientoMapper.getNombre());
        Assertions.assertEquals(equipamiento.getDescripcion(), equipamientoMapper.getDescripcion());
        Assertions.assertEquals(equipamiento.getPersonaje_id(), equipamientoMapper.getPersonaje_id());
    }
}
