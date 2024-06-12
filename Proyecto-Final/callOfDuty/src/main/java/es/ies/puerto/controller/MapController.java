package es.ies.puerto.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import es.ies.puerto.controller.interfaces.IMapController;
import es.ies.puerto.model.dto.MapDTO;
import es.ies.puerto.model.entity.Game;
import es.ies.puerto.model.entity.Gamemode;
import es.ies.puerto.model.entity.Map;
import es.ies.puerto.model.repository.IGameRepository;
import es.ies.puerto.model.repository.IGamemodeRepository;
import es.ies.puerto.model.repository.IMapRepository;
import mappers.IMapperMap;

@Controller
public class MapController implements IMapController {
    private IMapRepository iMapRepository;
    private IGameRepository iGameRepository;
    private IGamemodeRepository iGamemodeRepository;

    @Override
    public IMapRepository getMapRepository() {
        return this.iMapRepository;
    }

    @Autowired
    @Override
    public void setMapRepository(IMapRepository iMapRepository) {
        this.iMapRepository = iMapRepository;
    }

    @Override
    public MapDTO findById(Integer id) {
        return IMapperMap.INSTANCE.toMapDTO(iMapRepository.findById(id).get());
    }

    @Override
    public List<MapDTO> findAll() {
        List<MapDTO> result = new ArrayList<>();
        List<Map> maps = iMapRepository.findAll();
        for (Map map : maps) {
            result.add(IMapperMap.INSTANCE.toMapDTO(map));
        }
        return result;
    }

    @Override
    public MapDTO save(MapDTO map) {
        Map mapEntity = IMapperMap.INSTANCE.toMap(map);
        Game game = iGameRepository.findById(map.getGame_id()).get();
        Set<Gamemode> gamemodes = new HashSet<>();
        Set<Integer> gamemodes_id = map.getGamemodes_id();
        for (int id : gamemodes_id) {
            gamemodes.add(iGamemodeRepository.findById(id).get());
        }
        mapEntity.setGame(game);
        mapEntity.setGamemodes(gamemodes);
        iMapRepository.save(mapEntity);
        return IMapperMap.INSTANCE.toMapDTO(mapEntity);
    }

    @Override
    public void deleteById(Integer id) {
        iMapRepository.deleteById(id);
    }
}
