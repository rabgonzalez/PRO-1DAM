package mappers;

import java.util.HashSet;
import java.util.Set;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import es.ies.puerto.model.dto.MapDTO;
import es.ies.puerto.model.entity.Gamemode;
import es.ies.puerto.model.entity.Map;

@Mapper(uses = IMapperGame.class)
public interface IMapperMap {
    IMapperMap INSTANCE = Mappers.getMapper(IMapperMap.class);

    public Map toMap(MapDTO gunDTO);

    @Mapping(source = "map", target = "gamemodes_id", qualifiedByName = "gamemodesToIds")
    @Mapping(source = "game.id", target = "game_id")
    public MapDTO toMapDTO(Map map);

    @Named("gamemodesToIds")
    default Set<Integer> gamemodesToIds(Map map) {
        Set<Integer> result = new HashSet<>();
        Set<Gamemode> gamemodes = map.getGamemodes();
        for (Gamemode gamemode : gamemodes) {
            result.add(gamemode.getId());
        }
        return result;
    }
}
