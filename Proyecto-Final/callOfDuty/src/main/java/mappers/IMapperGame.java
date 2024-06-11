package mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import es.ies.puerto.model.dto.GameDTO;
import es.ies.puerto.model.entity.Game;

@Mapper
public interface IMapperGame {
    IMapperGame INSTANCE = Mappers.getMapper(IMapperGame.class);

    public Game toGame(GameDTO gameDTO);

    public GameDTO toGameDTO(Game game);
}
