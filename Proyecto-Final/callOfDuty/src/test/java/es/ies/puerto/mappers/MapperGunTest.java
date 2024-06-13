package es.ies.puerto.mappers;

import java.util.Objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import es.ies.puerto.model.InitializeHelp;
import es.ies.puerto.model.dto.GunDTO;
import es.ies.puerto.model.entity.Gun;

class MapperGunTest extends InitializeHelp {
    Gun gunMapper;
    GunDTO gunDTOMapper;

    @Test
    void toGunTest() {
        gunMapper = IMapperGun.INSTANCE.toGun(gunDTO);
        Assertions.assertEquals(gunMapper, gun);
        Assertions.assertEquals(gunMapper.getId(), gun.getId());
        Assertions.assertEquals(gunMapper.getName(), gun.getName());
        Assertions.assertEquals(gunMapper.getRarity(), gun.getRarity());
        Assertions.assertEquals(gunMapper.getType(), gun.getType());
        Assertions.assertTrue(gunMapper.toString().contains(String.valueOf(ID)));
        Assertions.assertEquals(gunMapper.hashCode(), Objects.hash(ID));
    }

    @Test
    void toGunDTOTest() {
        gunDTOMapper = IMapperGun.INSTANCE.toGunDTO(gun);
        Assertions.assertEquals(gunDTOMapper, gunDTO);
        Assertions.assertEquals(gunDTOMapper.getId(), gunDTO.getId());
        Assertions.assertEquals(gunDTOMapper.getName(), gunDTO.getName());
        Assertions.assertEquals(gunDTOMapper.getRarity(), gunDTO.getRarity());
        Assertions.assertEquals(gunDTOMapper.getType(), gunDTO.getType());
        Assertions.assertEquals(gunDTOMapper.getGames_id(), gunDTO.getGames_id());
        Assertions.assertTrue(gunDTOMapper.toString().contains(String.valueOf(ID)));
        Assertions.assertEquals(gunDTOMapper.hashCode(), Objects.hash(ID));
    }
}
