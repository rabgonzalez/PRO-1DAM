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

import es.ies.puerto.controller.GameController;
import es.ies.puerto.model.dto.GameDTO;

class GameServiceTest {
    @Mock
    GameController gameController;
    GameService gameService;

    @BeforeEach
    void beforeEach() {
        MockitoAnnotations.openMocks(this);
        gameService = new GameService();
        gameService.setGameController(gameController);
    }

    @Test
    void getControllerTest() {
        Assertions.assertEquals(gameController, gameService.getGameController());
    }

    @Test
    void getAllTest() {
        when(gameController.findAll()).thenReturn(new ArrayList<>());
        List<GameDTO> games = gameService.getAllGame();
        Assertions.assertNotNull(games);
    }

    @Test
    void getByIDTest() {
        when(gameController.findById(anyInt())).thenReturn(new GameDTO());
        GameDTO game = gameService.getGameById(1);
        Assertions.assertNotNull(game);
    }

    @Test
    void saveTest() {
        when(gameController.save(any())).thenReturn(new GameDTO());
        GameDTO game = gameService.postGame(new GameDTO());
        Assertions.assertNotNull(game);
    }

    @Test
    void deleteByIdTest() {
        gameService.deleteGameById(1);
        Assertions.assertNull(gameService.getGameById(1));
    }
}
