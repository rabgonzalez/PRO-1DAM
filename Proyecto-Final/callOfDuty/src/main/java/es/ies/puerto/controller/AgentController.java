package es.ies.puerto.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import es.ies.puerto.controller.interfaces.IAgentController;
import es.ies.puerto.model.entity.Agent;
import es.ies.puerto.model.repository.IAgentRepository;

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
    public Optional<Agent> findById(Integer id) {
        return agentRepository.findById(id);
    }

    @Override
    public List<Agent> findAll() {
        return agentRepository.findAll();
    }

    @Override
    public Agent save(Agent agent) {
        return agentRepository.save(agent);
    }

    @Override
    public void deleteById(Integer id) {
        agentRepository.deleteById(id);
    }
}
