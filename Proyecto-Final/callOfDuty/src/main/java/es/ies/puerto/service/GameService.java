package es.ies.puerto.service;

import org.springframework.web.bind.annotation.RestController;

import es.ies.puerto.controller.GameController;
import es.ies.puerto.model.dto.GameDTO;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/game")
@Service
public class GameService {
    Logger logger = LoggerFactory.getLogger(GameService.class);
    private GameController gameController;

    @Autowired
    public void setGameController(GameController gameController) {
        this.gameController = gameController;
    }

    @GetMapping
    public List<GameDTO> getAllGame() {
        return gameController.findAll();
    }

    @GetMapping("/{id}")
    public GameDTO getGameById(@PathVariable(name = "id") final Integer id) {
        return gameController.findById(id);
    }

    @PostMapping
    public GameDTO postGame(@RequestBody final GameDTO game) {
        return gameController.save(game);
    }

    @DeleteMapping("/{id}")
    public void deleteGameById(@PathVariable(name = "id") final Integer id) {
        gameController.deleteById(id);
    }
}
