package es.ies.puerto.model.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.ies.puerto.model.entity.Agent;

@Repository("agentRepository")
public interface IAgentRepository extends JpaRepository<Agent, Integer> {
    public Optional<Agent> findById(Integer id);

    public List<Agent> findAll();

    @SuppressWarnings("unchecked")
    public Agent save(Agent agent);

    public void deleteById(Integer id);
}