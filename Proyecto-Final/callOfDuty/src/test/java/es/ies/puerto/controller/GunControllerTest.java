package es.ies.puerto.controller;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import es.ies.puerto.model.dto.AgentDTO;
import es.ies.puerto.model.dto.GunDTO;
import es.ies.puerto.model.entity.Agent;
import es.ies.puerto.model.entity.Game;
import es.ies.puerto.model.entity.Gun;
import es.ies.puerto.model.repository.IAgentRepository;
import es.ies.puerto.model.repository.IGameRepository;
import es.ies.puerto.model.repository.IGunRepository;

class GunControllerTest {
    GunController gunController;

    @Mock
    IGunRepository iGunRepository;
    
    @Mock
    IGameRepository iGameRepository;

    @BeforeEach
    void beforeEach() {
        MockitoAnnotations.openMocks(this);
        gunController = new GunController();
        gunController.setGunRepository(iGunRepository);
        gunController.setIGameRepository(iGameRepository);
    }

    @Test
    void notNullTest() {
        Assertions.assertNotNull(gunController.getGunRepository());
        Assertions.assertNotNull(gunController.getIGameRepository());
    }

    /*@Test
    void findAllTest() {
        when(iGunRepository.findAll()).thenReturn(new ArrayList<>(Arrays.asList(new Gun())));
        List<GunDTO> gunDTOs = gunController.findAll();
        Assertions.assertNotNull(gunDTOs);
    }

    @Test
    void findByIdTest() {
        when(iGunRepository.findById(anyInt())).thenReturn(Optional.of(new Gun()));
        GunDTO gunDTO = gunController.findById(1);
        Assertions.assertNotNull(gunDTO);
    }

    /*@Test
    void saveTest() {
        when(iGameRepository.findById(anyInt())).thenReturn(Optional.of(new Game()));
        when(iAgentRepository.save(any())).thenReturn(new Agent());
        AgentDTO agentDTO= new AgentDTO();
        agentDTO.setGame_id(1);
        AgentDTO result = iAgentController.save(agentDTO);
        Assertions.assertNotNull(result);
    }

    @Test
    void deleteByIdTest() {
        gunController.deleteById(1);
        Assertions.assertNull(gunController.findById(1));
    }*/
}