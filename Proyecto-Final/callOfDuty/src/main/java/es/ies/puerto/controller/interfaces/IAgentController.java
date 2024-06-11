package es.ies.puerto.controller.interfaces;

import java.util.List;

import es.ies.puerto.model.dto.AgentDTO;
import es.ies.puerto.model.repository.IAgentRepository;

public interface IAgentController {
    public IAgentRepository getAgentRepository();

    public void setAgentRepository(IAgentRepository agent);

    public AgentDTO findById(Integer id);

    public List<AgentDTO> findAll();

    public AgentDTO save(AgentDTO agent);

    public void deleteById(Integer id);
}
