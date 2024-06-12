package es.ies.puerto.controller;

import java.util.List;

import es.ies.puerto.controller.interfaces.IGameController;
import es.ies.puerto.model.dto.GameDTO;
import es.ies.puerto.model.repository.IGameRepository;

public class GameController implements IGameController {

    @Override
    public IGameRepository getGameRepository() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getGameRepository'");
    }

    @Override
    public void setGameRepository(IGameRepository game) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setGameRepository'");
    }

    @Override
    public GameDTO findById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @Override
    public List<GameDTO> findAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @Override
    public GameDTO save(GameDTO game) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    @Override
    public void deleteById(Integer id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

}
