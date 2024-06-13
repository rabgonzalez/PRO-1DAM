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

import es.ies.puerto.controller.GamemodeController;
import es.ies.puerto.model.dto.GamemodeDTO;

class GamemodeServiceTest {
    @Mock
    GamemodeController gamemodeController;
    GamemodeService gamemodeService;

    @BeforeEach
    void beforeEach() {
        MockitoAnnotations.openMocks(this);
        gamemodeService = new GamemodeService();
        gamemodeService.setGamemodeController(gamemodeController);
    }

    @Test
    void getControllerTest() {
        Assertions.assertEquals(gamemodeController, gamemodeService.getGamemodeController());
    }

    @Test
    void getAllTest() {
        when(gamemodeController.findAll()).thenReturn(new ArrayList<>());
        List<GamemodeDTO> gamemodes = gamemodeService.getAllGamemode();
        Assertions.assertNotNull(gamemodes);
    }

    @Test
    void getByIDTest() {
        when(gamemodeController.findById(anyInt())).thenReturn(new GamemodeDTO());
        GamemodeDTO gamemode = gamemodeService.getGamemodeById(1);
        Assertions.assertNotNull(gamemode);
    }

    @Test
    void saveTest() {
        when(gamemodeController.save(any())).thenReturn(new GamemodeDTO());
        GamemodeDTO gamemode = gamemodeService.postGamemode(new GamemodeDTO());
        Assertions.assertNotNull(gamemode);
    }

    @Test
    void deleteByIdTest() {
        gamemodeService.deleteGamemodeById(1);
        Assertions.assertNull(gamemodeService.getGamemodeById(1));
    }
}
