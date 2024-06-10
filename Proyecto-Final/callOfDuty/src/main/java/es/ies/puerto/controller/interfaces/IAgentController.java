package es.ies.puerto.controller.interfaces;

import java.util.List;
import java.util.Optional;

import es.ies.puerto.model.entity.Agent;
import es.ies.puerto.model.repository.IAgentRepository;

public interface IAgentController {
    public IAgentRepository getAgentRepository();

    public void setAgentRepository(IAgentRepository agent);

    public Optional<Agent> findById(Integer id);

    public List<Agent> findAll();

    public Agent save(Agent agent);

    public void deleteById(Integer id);
}
