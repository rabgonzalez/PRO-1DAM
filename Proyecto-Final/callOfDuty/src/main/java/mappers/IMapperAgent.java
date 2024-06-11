package mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import es.ies.puerto.model.dto.AgentDTO;
import es.ies.puerto.model.entity.Agent;

@Mapper(uses = IMapperGame.class)
public interface IMapperAgent {
    IMapperAgent INSTANCE = Mappers.getMapper(IMapperAgent.class);

    public Agent toAgent(AgentDTO agentDTO);

    @Mapping(source = "game.id", target = "game_id")
    public AgentDTO toAgentDTO(Agent agent);
}
