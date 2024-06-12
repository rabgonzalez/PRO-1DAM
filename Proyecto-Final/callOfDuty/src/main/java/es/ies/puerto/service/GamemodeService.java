package es.ies.puerto.service;

import org.springframework.web.bind.annotation.RestController;

import es.ies.puerto.controller.GamemodeController;
import es.ies.puerto.model.dto.GamemodeDTO;

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
@RequestMapping("/gamemode")
@Service
public class GamemodeService {
    Logger logger = LoggerFactory.getLogger(GamemodeService.class);
    private GamemodeController gamemodeController;

    @Autowired
    public void setGameController(GamemodeController gamemodeController) {
        this.gamemodeController = gamemodeController;
    }

    @GetMapping
    public List<GamemodeDTO> getAllGamemode() {
        return gamemodeController.findAll();
    }

    @GetMapping("/{id}")
    public GamemodeDTO getGamemodeById(@PathVariable(name = "id") final Integer id) {
        return gamemodeController.findById(id);
    }

    @PostMapping
    public GamemodeDTO postGamemode(@RequestBody final GamemodeDTO gamemode) {
        return gamemodeController.save(gamemode);
    }

    @DeleteMapping("/{id}")
    public void deleteGamemodeById(@PathVariable(name = "id") final Integer id) {
        gamemodeController.deleteById(id);
    }
}
