package es.ies.puerto.controller.interfaces;

import java.util.List;

import es.ies.puerto.model.dto.GamemodeDTO;
import es.ies.puerto.model.repository.IGamemodeRepository;

public interface IGamemodeController {
    public IGamemodeRepository getGamemodeRepository();

    public void setGamemodeRepository(IGamemodeRepository gamemode);

    public GamemodeDTO findById(Integer id);

    public List<GamemodeDTO> findAll();

    public GamemodeDTO save(GamemodeDTO gamemode);

    public void deleteById(Integer id);
}
