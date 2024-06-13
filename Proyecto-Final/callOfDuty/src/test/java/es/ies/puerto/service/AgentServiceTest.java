package es.ies.puerto.service;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import es.ies.puerto.controller.AgentController;
import es.ies.puerto.model.dto.AgentDTO;

class AgentServiceTest {
    @Mock
    AgentController agentController;
    AgentService agentService;

    @BeforeEach
    void beforeEach() {
        MockitoAnnotations.openMocks(this);
        agentService = new AgentService();
        agentService.setAgentController(agentController);
    }

    @Test
    void getControllerTest() {
        Assertions.assertEquals(agentController, agentService.getAgentController());
    }

    @Test
    void getAllTest() {
        when(agentController.findAll()).thenReturn(new ArrayList<>());
        List<AgentDTO> agents = agentService.getAllAgent();
        Assertions.assertNotNull(agents);
    }

    @Test
    void getByIDTest() {
        when(agentController.findById(anyInt())).thenReturn(new AgentDTO());
        AgentDTO agent = agentService.getAgentById(1);
        Assertions.assertNotNull(agent);
    }

    @Test
    void saveTest() {
        when(agentController.save(any())).thenReturn(new AgentDTO());
        AgentDTO agent = agentService.postAgent(new AgentDTO());
        Assertions.assertNotNull(agent);
    }

    @Test
    void deleteByIdTest() {
        agentService.deleteAgentById(1);
        Assertions.assertNull(agentService.getAgentById(1));
    }
}
