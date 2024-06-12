package mappers;

import java.util.HashSet;
import java.util.Set;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import es.ies.puerto.model.dto.GameDTO;
import es.ies.puerto.model.entity.Agent;
import es.ies.puerto.model.entity.Game;
import es.ies.puerto.model.entity.Gamemode;
import es.ies.puerto.model.entity.Gun;
import es.ies.puerto.model.entity.Map;

@Mapper
public interface IMapperGame {
    IMapperGame INSTANCE = Mappers.getMapper(IMapperGame.class);

    public Game toGame(GameDTO gameDTO);

    @Mapping(source = "game", target = "agents_id", qualifiedByName = "agentsToIds")
    @Mapping(source = "game", target = "gamemodes_id", qualifiedByName = "gamemodesToIds")
    @Mapping(source = "game", target = "guns_id", qualifiedByName = "gunsToIds")
    @Mapping(source = "game", target = "maps_id", qualifiedByName = "mapsToIds")
    public GameDTO toGameDTO(Game game);

    @Named("agentsToIds")
    default Set<Integer> agentsToIds(Game game) {
        Set<Integer> result = new HashSet<>();
        Set<Agent> agents = game.getAgents();
        for (Agent agent : agents) {
            result.add(agent.getId());
        }
        return result;
    }

    @Named("gamemodesToIds")
    default Set<Integer> gamemodesToIds(Game game) {
        Set<Integer> result = new HashSet<>();
        Set<Gamemode> gamemodes = game.getGamemodes();
        for (Gamemode gamemode : gamemodes) {
            result.add(gamemode.getId());
        }
        return result;
    }

    @Named("gunsToIds")
    default Set<Integer> gunsToIds(Game game) {
        Set<Integer> result = new HashSet<>();
        Set<Gun> guns = game.getGuns();
        for (Gun gun : guns) {
            result.add(gun.getId());
        }
        return result;
    }

    @Named("mapsToIds")
    default Set<Integer> mapsToIds(Game game) {
        Set<Integer> result = new HashSet<>();
        Set<Map> maps = game.getMaps();
        for (Map map : maps) {
            result.add(map.getId());
        }
        return result;
    }
}
