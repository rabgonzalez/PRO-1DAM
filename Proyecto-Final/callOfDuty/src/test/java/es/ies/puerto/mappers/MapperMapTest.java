package es.ies.puerto.mappers;

import java.util.Objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import es.ies.puerto.model.InitializeHelp;
import es.ies.puerto.model.dto.MapDTO;
import es.ies.puerto.model.entity.Map;

class MapperMapTest extends InitializeHelp {
    Map mapMapper;
    MapDTO mapDTOMapper;

    @Test
    void toMapTest() {
        mapMapper = IMapperMap.INSTANCE.toMap(mapDTO);
        Assertions.assertEquals(mapMapper, map);
        Assertions.assertEquals(mapMapper.getId(), map.getId());
        Assertions.assertEquals(mapMapper.getName(), map.getName());
        Assertions.assertEquals(mapMapper.getCountry(), map.getCountry());
        Assertions.assertTrue(mapMapper.toString().contains(String.valueOf(ID)));
        Assertions.assertEquals(mapMapper.hashCode(), Objects.hash(ID));
    }

    @Test
    void toMapDTOTest() {
        mapDTOMapper = IMapperMap.INSTANCE.toMapDTO(map);
        Assertions.assertEquals(mapDTOMapper, mapDTO);
        Assertions.assertEquals(mapDTOMapper.getId(), mapDTO.getId());
        Assertions.assertEquals(mapDTOMapper.getName(), mapDTO.getName());
        Assertions.assertEquals(mapDTOMapper.getCountry(), mapDTO.getCountry());
        Assertions.assertEquals(mapDTOMapper.getGame_id(), mapDTO.getGame_id());
        Assertions.assertEquals(mapDTOMapper.getGamemodes_id(), mapDTO.getGamemodes_id());
        Assertions.assertTrue(mapDTOMapper.toString().contains(String.valueOf(ID)));
        Assertions.assertEquals(mapDTOMapper.hashCode(), Objects.hash(ID));
    }
}
