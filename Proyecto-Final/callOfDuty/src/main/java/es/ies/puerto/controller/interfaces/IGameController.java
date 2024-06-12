package es.ies.puerto.controller.interfaces;

import java.util.List;

import es.ies.puerto.model.dto.GameDTO;
import es.ies.puerto.model.repository.IGameRepository;

public interface IGameController {
    public IGameRepository getGameRepository();

    public void setGameRepository(IGameRepository game);

    public GameDTO findById(Integer id);

    public List<GameDTO> findAll();

    public GameDTO save(GameDTO game);

    public void deleteById(Integer id);
}
