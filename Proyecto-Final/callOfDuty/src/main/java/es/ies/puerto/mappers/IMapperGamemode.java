package es.ies.puerto.mappers;

import java.util.HashSet;
import java.util.Set;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import es.ies.puerto.model.dto.GamemodeDTO;
import es.ies.puerto.model.entity.Game;
import es.ies.puerto.model.entity.Gamemode;
import es.ies.puerto.model.entity.Map;

@Mapper
public interface IMapperGamemode {
    IMapperGamemode INSTANCE = Mappers.getMapper(IMapperGamemode.class);

    public Gamemode toGamemode(GamemodeDTO gamemodeDTO);

    @Mapping(source = "gamemode", target = "games_id", qualifiedByName = "gamesToIds")
    @Mapping(source = "gamemode", target = "maps_id", qualifiedByName = "mapsToIds")
    public GamemodeDTO toGamemodeDTO(Gamemode gamemode);

    @Named("gamesToIds")
    default Set<Integer> gomesToIds(Gamemode gamemode) {
        Set<Integer> result = new HashSet<>();
        Set<Game> games = gamemode.getGames();
        for (Game game : games) {
            result.add(game.getId());
        }
        return result;
    }

    @Named("mapsToIds")
    default Set<Integer> mapsToIds(Gamemode gamemode) {
        Set<Integer> result = new HashSet<>();
        Set<Map> maps = gamemode.getMaps();
        for (Map map : maps) {
            result.add(map.getId());
        }
        return result;
    }
}
