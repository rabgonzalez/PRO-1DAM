package es.ies.puerto.mappers.struct;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import es.ies.puerto.dto.AliasDTO;
import es.ies.puerto.mappers.classic.MappersHelp;
import es.ies.puerto.modelo.db.entidades.Alias;

public class MapperAliasTest extends MappersHelp{
    Alias aliasMapper;
    AliasDTO aliasDTOMapper;

    @Test
    public void aliasEntityToAliasDTOTest(){
        aliasDTOMapper = IMapperAlias.INSTANCE.aliasEntityToAliasDTO(alias);
        Assertions.assertEquals(aliasDTO.getId(), aliasDTOMapper.getId());
        Assertions.assertEquals(aliasDTO.getDescripcion(), aliasDTOMapper.getDescripcion());
    }

    @Test
    public void aliasDTOToAliasEntityTest(){
        aliasMapper = IMapperAlias.INSTANCE.aliasDTOToAliasEntity(aliasDTO, personaje);
        Assertions.assertEquals(alias.getId(), aliasMapper.getId());
        Assertions.assertEquals(alias.getDescripcion(), aliasMapper.getDescripcion());
        Assertions.assertEquals(alias.getPersonaje_id(), aliasMapper.getPersonaje_id());
    }
}
