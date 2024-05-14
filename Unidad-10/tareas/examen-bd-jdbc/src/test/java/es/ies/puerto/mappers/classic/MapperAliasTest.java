package es.ies.puerto.mappers.classic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import es.ies.puerto.dto.AliasDTO;
import es.ies.puerto.modelo.db.entidades.Alias;

public class MapperAliasTest extends MappersHelp{
    Alias aliasMapper;
    AliasDTO aliasDTOMapper;
    MapperAlias mapperAlias;

    @Test
    public void aliasEntityToAliasDTOTest(){
        aliasDTOMapper = mapperAlias.aliasEntityToAliasDTO(alias, personaje);
        Assertions.assertEquals(aliasDTO.getId(), aliasDTOMapper.getId());
        Assertions.assertEquals(aliasDTO.getDescripcion(), aliasDTOMapper.getDescripcion());
        Assertions.assertEquals(aliasDTO.getPersonaje_id(), aliasDTOMapper.getPersonaje_id());
    }

    @Test
    public void aliasDTOToAliasEntityTest(){
        aliasMapper = mapperAlias.aliasDTOToAliasEntity(aliasDTO, personajeDTO);
        Assertions.assertEquals(alias.getId(), aliasMapper.getId());
        Assertions.assertEquals(alias.getDescripcion(), aliasMapper.getDescripcion());
        Assertions.assertEquals(alias.getPersonaje_id(), aliasMapper.getPersonaje_id());
    }
}
