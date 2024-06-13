package es.ies.puerto.mappers;

import java.util.Objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import es.ies.puerto.model.InitializeHelp;
import es.ies.puerto.model.dto.GamemodeDTO;
import es.ies.puerto.model.entity.Gamemode;

class MapperGamemodeTest extends InitializeHelp {
    Gamemode gamemodeMapper;
    GamemodeDTO gamemodeDTOMapper;

    @Test
    void toGamemodeTest() {
        gamemodeMapper = IMapperGamemode.INSTANCE.toGamemode(gamemodeDTO);
        Assertions.assertEquals(gamemodeMapper, gamemode);
        Assertions.assertEquals(gamemodeMapper.getId(), gamemode.getId());
        Assertions.assertEquals(gamemodeMapper.getName(), gamemode.getName());
        Assertions.assertTrue(gamemodeMapper.toString().contains(String.valueOf(ID)));
        Assertions.assertEquals(gamemodeMapper.hashCode(), Objects.hash(ID));
    }

    @Test
    void toGamemodeDTOTest() {
        gamemodeDTOMapper = IMapperGamemode.INSTANCE.toGamemodeDTO(gamemode);
        Assertions.assertEquals(gamemodeDTOMapper, gamemodeDTO);
        Assertions.assertEquals(gamemodeDTOMapper.getId(), gamemodeDTO.getId());
        Assertions.assertEquals(gamemodeDTOMapper.getName(), gamemodeDTO.getName());
        Assertions.assertEquals(gamemodeDTOMapper.getGames_id(), gamemodeDTO.getGames_id());
        Assertions.assertEquals(gamemodeDTOMapper.getMaps_id(), gamemodeDTO.getMaps_id());
        Assertions.assertTrue(gamemodeDTOMapper.toString().contains(String.valueOf(ID)));
        Assertions.assertEquals(gamemodeDTOMapper.hashCode(), Objects.hash(ID));
    }
}
