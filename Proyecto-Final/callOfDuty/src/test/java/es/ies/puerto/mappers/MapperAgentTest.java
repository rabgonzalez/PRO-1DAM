package es.ies.puerto.mappers;

import java.util.Objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import es.ies.puerto.model.InitializeHelp;
import es.ies.puerto.model.dto.AgentDTO;
import es.ies.puerto.model.entity.Agent;

class MapperAgentTest extends InitializeHelp {
    Agent agentMapper;
    AgentDTO agentDTOMapper;

    @Test
    void toAgentTest() {
        agentMapper = IMapperAgent.INSTANCE.toAgent(agentDTO);
        Assertions.assertEquals(agentMapper, agent);
        Assertions.assertEquals(agentMapper.getId(), agent.getId());
        Assertions.assertEquals(agentMapper.getName(), agent.getName());
        Assertions.assertEquals(agentMapper.getRarity(), agent.getRarity());
        Assertions.assertEquals(agentMapper.getAge(), agent.getAge());
        Assertions.assertTrue(agentMapper.toString().contains(String.valueOf(ID)));
        Assertions.assertEquals(agentMapper.hashCode(), Objects.hash(ID));
    }

    @Test
    void toAgentDTOTest() {
        agentDTOMapper = IMapperAgent.INSTANCE.toAgentDTO(agent);
        Assertions.assertEquals(agentDTOMapper, agentDTO);
        Assertions.assertEquals(agentDTOMapper.getId(), agentDTO.getId());
        Assertions.assertEquals(agentDTOMapper.getName(), agentDTO.getName());
        Assertions.assertEquals(agentDTOMapper.getRarity(), agentDTO.getRarity());
        Assertions.assertEquals(agentDTOMapper.getAge(), agentDTO.getAge());
        Assertions.assertEquals(agentDTOMapper.getGame_id(), agentDTO.getGame_id());
        Assertions.assertTrue(agentDTOMapper.toString().contains(String.valueOf(ID)));
        Assertions.assertEquals(agentDTOMapper.hashCode(), Objects.hash(ID));
    }
}
