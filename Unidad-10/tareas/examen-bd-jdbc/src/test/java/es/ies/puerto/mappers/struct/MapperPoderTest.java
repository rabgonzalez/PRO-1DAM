package es.ies.puerto.mappers.struct;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import es.ies.puerto.dto.PoderDTO;
import es.ies.puerto.mappers.classic.MappersHelp;
import es.ies.puerto.modelo.db.entidades.Poder;

public class MapperPoderTest extends MappersHelp {
    Poder poderMapper;
    PoderDTO poderDTOMapper;

    @Test
    public void poderEntityToPoderDTO(){
        poderDTOMapper = IMapperPoder.INSTANCE.poderEntityToPoderDTO(poder);
        Assertions.assertEquals(poderDTO.getId(), poderDTOMapper.getId());
        Assertions.assertEquals(poderDTO.getNombre(), poderDTOMapper.getNombre());
    }

    @Test
    public void poderDTOToPoderEntity(){
        poderMapper = IMapperPoder.INSTANCE.poderDTOToPoderEntity(poderDTO, personaje);
        Assertions.assertEquals(poder.getId(), poderMapper.getId());
        Assertions.assertEquals(poder.getNombre(), poderMapper.getNombre());
        Assertions.assertEquals(poder.getPersonaje(), poderMapper.getPersonaje());
    }
}
