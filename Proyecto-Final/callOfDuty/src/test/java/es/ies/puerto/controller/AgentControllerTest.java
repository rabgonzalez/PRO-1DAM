package es.ies.puerto.controller;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import es.ies.puerto.model.dto.AgentDTO;
import es.ies.puerto.model.entity.Agent;
import es.ies.puerto.model.repository.IAgentRepository;
import es.ies.puerto.model.repository.IGameRepository;

class AgentControllerTest {
    AgentController iAgentController;

    @Mock
    IAgentRepository iAgentRepository;

    @Mock
    IGameRepository iGameRepository;

    @BeforeEach
    void beforeEach() {
        MockitoAnnotations.openMocks(this);
        iAgentController = new AgentController();
        iAgentController.setAgentRepository(iAgentRepository);
        iAgentController.setGameRepository(iGameRepository);
    }

    @Test
    void notNullTest() {
        Assertions.assertNotNull(iAgentController.getAgentRepository());
        Assertions.assertNotNull(iAgentController.getGameRepository());
    }

    @Test
    void findAllTest() {
        when(iAgentRepository.findAll()).thenReturn(new ArrayList<>(Arrays.asList(new Agent())));
        List<AgentDTO> agentDto = iAgentController.findAll();
        Assertions.assertNotNull(agentDto);
    }

    @Test
    void findByIdTest() {
        when(iAgentRepository.findById(anyInt())).thenReturn(Optional.of(new Agent()));
        AgentDTO agentDTO = iAgentController.findById(1);
        Assertions.assertNotNull(agentDTO);
    }

    /*
     * @Test
     * void saveTest() {
     * when(iGameRepository.findById(anyInt())).thenReturn(Optional.of(new Game()));
     * when(iAgentRepository.save(any())).thenReturn(new Agent());
     * AgentDTO agentDTO= new AgentDTO();
     * agentDTO.setGame_id(1);
     * AgentDTO result = iAgentController.save(agentDTO);
     * Assertions.assertNotNull(result);
     * }
     */

    @Test
    void deleteByIdTest() {
        iAgentController.deleteById(1);
        Assertions.assertEquals(iAgentRepository.findById(1), Optional.empty());
    }
}