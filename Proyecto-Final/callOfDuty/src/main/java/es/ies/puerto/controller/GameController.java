package es.ies.puerto.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import es.ies.puerto.controller.interfaces.IGameController;
import es.ies.puerto.mappers.IMapperGame;
import es.ies.puerto.model.dto.GameDTO;
import es.ies.puerto.model.entity.Agent;
import es.ies.puerto.model.entity.Game;
import es.ies.puerto.model.entity.Gamemode;
import es.ies.puerto.model.entity.Gun;
import es.ies.puerto.model.entity.Map;
import es.ies.puerto.model.repository.IAgentRepository;
import es.ies.puerto.model.repository.IGameRepository;
import es.ies.puerto.model.repository.IGamemodeRepository;
import es.ies.puerto.model.repository.IGunRepository;
import es.ies.puerto.model.repository.IMapRepository;

@Controller
public class GameController implements IGameController {
    private IGameRepository iGameRepository;
    private IGunRepository iGunRepository;
    private IGamemodeRepository iGamemodeRepository;
    private IMapRepository iMapRepository;
    private IAgentRepository iAgentRepository;

    public IGunRepository getIGunRepository() {
        return this.iGunRepository;
    }

    @Autowired
    public void setIGunRepository(IGunRepository iGunRepository) {
        this.iGunRepository = iGunRepository;
    }

    public IGamemodeRepository getIGamemodeRepository() {
        return this.iGamemodeRepository;
    }

    @Autowired
    public void setIGamemodeRepository(IGamemodeRepository iGamemodeRepository) {
        this.iGamemodeRepository = iGamemodeRepository;
    }

    public IMapRepository getIMapRepository() {
        return this.iMapRepository;
    }

    @Autowired
    public void setIMapRepository(IMapRepository iMapRepository) {
        this.iMapRepository = iMapRepository;
    }

    public IAgentRepository getIAgentRepository() {
        return this.iAgentRepository;
    }

    @Autowired
    public void setIAgentRepository(IAgentRepository iAgentRepository) {
        this.iAgentRepository = iAgentRepository;
    }

    @Override
    public IGameRepository getGameRepository() {
        return this.iGameRepository;
    }

    @Autowired
    @Override
    public void setGameRepository(IGameRepository iGameRepository) {
        this.iGameRepository = iGameRepository;
    }

    @Override
    public GameDTO findById(Integer id) {
        return IMapperGame.INSTANCE.toGameDTO(iGameRepository.findById(id).get());
    }

    @Override
    public List<GameDTO> findAll() {
        List<GameDTO> result = new ArrayList<>();
        List<Game> games = iGameRepository.findAll();
        for (Game game : games) {
            result.add(IMapperGame.INSTANCE.toGameDTO(game));
        }
        return result;
    }

    @Override
    public GameDTO save(GameDTO game) {
        Set<Integer> agents_id = game.getAgents_id();
        Set<Integer> guns_id = game.getGuns_id();
        Set<Integer> maps_id = game.getMaps_id();
        Set<Integer> gamemodes_id = game.getGamemodes_id();
        Game gameEntity = IMapperGame.INSTANCE.toGame(game);
        gameEntity.setAgents(agentsByGame(agents_id));
        gameEntity.setGuns(gunsByGame(guns_id));
        gameEntity.setMaps(mapsByGame(maps_id));
        gameEntity.setGamemodes(gamemodesByGame(gamemodes_id));
        iGameRepository.save(gameEntity);
        return IMapperGame.INSTANCE.toGameDTO(gameEntity);
    }

    @Override
    public void deleteById(Integer id) {
        iGameRepository.deleteById(id);
    }

    public Set<Agent> agentsByGame(Set<Integer> ids) {
        Set<Agent> agents = new HashSet();
        for (int id : ids) {
            agents.add(iAgentRepository.findById(id).get());
        }
        return agents;
    }

    public Set<Gun> gunsByGame(Set<Integer> ids) {
        Set<Gun> guns = new HashSet();
        for (int id : ids) {
            guns.add(iGunRepository.findById(id).get());
        }
        return guns;
    }

    public Set<Map> mapsByGame(Set<Integer> ids) {
        Set<Map> maps = new HashSet();
        for (int id : ids) {
            maps.add(iMapRepository.findById(id).get());
        }
        return maps;
    }

    public Set<Gamemode> gamemodesByGame(Set<Integer> ids) {
        Set<Gamemode> gamemodes = new HashSet();
        for (int id : ids) {
            gamemodes.add(iGamemodeRepository.findById(id).get());
        }
        return gamemodes;
    }
}
