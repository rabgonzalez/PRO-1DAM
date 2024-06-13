package es.ies.puerto.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import es.ies.puerto.controller.interfaces.IAgentController;
import es.ies.puerto.mappers.IMapperAgent;
import es.ies.puerto.model.dto.AgentDTO;
import es.ies.puerto.model.entity.Agent;
import es.ies.puerto.model.entity.Game;
import es.ies.puerto.model.repository.IAgentRepository;
import es.ies.puerto.model.repository.IGameRepository;

@Controller
public class AgentController implements IAgentController {
    private IAgentRepository agentRepository;
    private IGameRepository gameRepository;

    @Override
    public IAgentRepository getAgentRepository() {
        return agentRepository;
    }

    @Autowired
    @Override
    public void setAgentRepository(IAgentRepository agentRepository) {
        this.agentRepository = agentRepository;
    }

    public IGameRepository getGameRepository() {
        return gameRepository;
    }

    @Autowired
    public void setGameRepository(IGameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Override
    public AgentDTO findById(Integer id) {
        return IMapperAgent.INSTANCE.toAgentDTO(agentRepository.findById(id).get());
    }

    @Override
    public List<AgentDTO> findAll() {
        List<Agent> list = agentRepository.findAll();
        List<AgentDTO> result = new ArrayList<>();
        for (Agent agent : list) {
            result.add(IMapperAgent.INSTANCE.toAgentDTO(agent));
        }
        return result;
    }

    @Override
    public AgentDTO save(AgentDTO agent) {
        Game game = gameRepository.findById(agent.getGame_id()).get();
        Agent agentEntity = IMapperAgent.INSTANCE.toAgent(agent);
        agentEntity.setGame(game);
        return IMapperAgent.INSTANCE.toAgentDTO(agentRepository.save(agentEntity));
    }

    @Override
    public void deleteById(Integer id) {
        agentRepository.deleteById(id);
    }
}
