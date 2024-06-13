package es.ies.puerto.mappers;

import java.util.HashSet;
import java.util.Set;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import es.ies.puerto.model.dto.GunDTO;
import es.ies.puerto.model.entity.Game;
import es.ies.puerto.model.entity.Gun;

@Mapper
public interface IMapperGun {
    IMapperGun INSTANCE = Mappers.getMapper(IMapperGun.class);

    public Gun toGun(GunDTO gunDTO);

    @Mapping(source = "gun", target = "games_id", qualifiedByName = "gamesToIds")
    public GunDTO toGunDTO(Gun gun);

    @Named("gamesToIds")
    default Set<Integer> gomesToIds(Gun gun) {
        Set<Integer> result = new HashSet<>();
        Set<Game> games = gun.getGames();
        for (Game game : games) {
            result.add(game.getId());
        }
        return result;
    }
}
