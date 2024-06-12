package es.ies.puerto.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import es.ies.puerto.controller.interfaces.IGamemodeController;
import es.ies.puerto.model.dto.GamemodeDTO;
import es.ies.puerto.model.entity.Game;
import es.ies.puerto.model.entity.Gamemode;
import es.ies.puerto.model.entity.Map;
import es.ies.puerto.model.repository.IGameRepository;
import es.ies.puerto.model.repository.IGamemodeRepository;
import es.ies.puerto.model.repository.IMapRepository;
import mappers.IMapperGamemode;

@Controller
public class GamemodeController implements IGamemodeController {
    private IGamemodeRepository iGamemodeRepository;
    private IGameRepository iGameRepository;
    private IMapRepository iMapRepository;

    @Override
    public IGamemodeRepository getGamemodeRepository() {
        return this.iGamemodeRepository;
    }

    @Autowired
    @Override
    public void setGamemodeRepository(IGamemodeRepository iGamemodeRepository) {
        this.iGamemodeRepository = iGamemodeRepository;
    }

    @Override
    public GamemodeDTO findById(Integer id) {
        return IMapperGamemode.INSTANCE.toGamemodeDTO(iGamemodeRepository.findById(id).get());
    }

    @Override
    public List<GamemodeDTO> findAll() {
        List<GamemodeDTO> result = new ArrayList<>();
        List<Gamemode> gamemodes = iGamemodeRepository.findAll();
        for(Gamemode gamemode : gamemodes){
            result.add(IMapperGamemode.INSTANCE.toGamemodeDTO(gamemode));
        }
        return result;
    }

    @Override
    public GamemodeDTO save(GamemodeDTO gamemode) {
        Set<Game> games = new HashSet<>();
        Set<Map> maps = new HashSet<>();
        Set<Integer> games_id = gamemode.getGames_id();
        Set<Integer> maps_id = gamemode.getMaps_id();
        for(int id : games_id){
            games.add(iGameRepository.findById(id).get());
        }
        for(int id : maps_id){
            maps.add(iMapRepository.findById(id).get());
        }
        Gamemode gamemodeEntity = IMapperGamemode.INSTANCE.toGamemode(gamemode);
        gamemodeEntity.setGame(games);
        gamemodeEntity.setMaps(maps);
        iGamemodeRepository.save(gamemodeEntity);
        return IMapperGamemode.INSTANCE.toGamemodeDTO(gamemodeEntity);
    }

    @Override
    public void deleteById(Integer id) {
        iGamemodeRepository.deleteById(id);
    }
}
