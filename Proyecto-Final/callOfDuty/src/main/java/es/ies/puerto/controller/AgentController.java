package es.ies.puerto.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import es.ies.puerto.controller.interfaces.IAgentController;
import es.ies.puerto.model.dto.AgentDTO;
import es.ies.puerto.model.entity.Agent;
import es.ies.puerto.model.repository.IAgentRepository;
import mappers.IMapperAgent;

@Controller
public class AgentController implements IAgentController {
    private IAgentRepository agentRepository;

    @Override
    public IAgentRepository getAgentRepository() {
        return agentRepository;
    }

    @Autowired
    @Override
    public void setAgentRepository(IAgentRepository agentRepository) {
        this.agentRepository = agentRepository;
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
        int game_id = agent.getGame_id();
        Agent agentEntity = IMapperAgent.INSTANCE.toAgent(agent);
        return IMapperAgent.INSTANCE.toAgentDTO(agentEntity);
    }

    @Override
    public void deleteById(Integer id) {
        agentRepository.deleteById(id);
    }
}
