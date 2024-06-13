package es.ies.puerto.mappers;

import java.util.Objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import es.ies.puerto.model.InitializeHelp;
import es.ies.puerto.model.dto.GameDTO;
import es.ies.puerto.model.entity.Game;

class MapperGameTest extends InitializeHelp {
    Game gameMapper;
    GameDTO gameDTOMapper;

    @Test
    void toGameTest() {
        gameMapper = IMapperGame.INSTANCE.toGame(gameDTO);
        Assertions.assertEquals(gameMapper, game);
        Assertions.assertEquals(gameMapper.getId(), game.getId());
        Assertions.assertEquals(gameMapper.getGameName(), game.getGameName());
        Assertions.assertEquals(gameMapper.getReleaseDate(), game.getReleaseDate());
        Assertions.assertEquals(gameMapper.getRating(), game.getRating());
        Assertions.assertTrue(gameMapper.toString().contains(String.valueOf(ID)));
        Assertions.assertEquals(gameMapper.hashCode(), Objects.hash(ID));
    }

    @Test
    void toGameDTOTest() {
        gameDTOMapper = IMapperGame.INSTANCE.toGameDTO(game);
        Assertions.assertEquals(gameDTOMapper, gameDTO);
        Assertions.assertEquals(gameDTOMapper.getId(), gameDTO.getId());
        Assertions.assertEquals(gameDTOMapper.getGameName(), gameDTO.getGameName());
        Assertions.assertEquals(gameDTOMapper.getReleaseDate(), gameDTO.getReleaseDate());
        Assertions.assertEquals(gameDTOMapper.getRating(), gameDTO.getRating());
        Assertions.assertEquals(gameDTOMapper.getAgents_id(), gameDTO.getAgents_id());
        Assertions.assertEquals(gameDTOMapper.getGuns_id(), gameDTO.getGuns_id());
        Assertions.assertEquals(gameDTOMapper.getMaps_id(), gameDTO.getMaps_id());
        Assertions.assertEquals(gameDTOMapper.getGamemodes_id(), mapDTO.getGamemodes_id());
        Assertions.assertTrue(gameDTOMapper.toString().contains(String.valueOf(ID)));
        Assertions.assertEquals(gameDTOMapper.hashCode(), Objects.hash(ID));
    }
}
