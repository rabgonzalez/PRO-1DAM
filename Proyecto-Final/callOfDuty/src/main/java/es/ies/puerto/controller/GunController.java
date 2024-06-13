package es.ies.puerto.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import es.ies.puerto.controller.interfaces.IGunController;
import es.ies.puerto.model.dto.GunDTO;
import es.ies.puerto.model.entity.Game;
import es.ies.puerto.model.entity.Gun;
import es.ies.puerto.model.repository.IGameRepository;
import es.ies.puerto.model.repository.IGunRepository;
import mappers.IMapperGun;

@Controller
public class GunController implements IGunController {
    private IGunRepository iGunRepository;
    private IGameRepository iGameRepository;

    public IGameRepository getIGameRepository() {
        return this.iGameRepository;
    }

    @Autowired
    public void setIGameRepository(IGameRepository iGameRepository) {
        this.iGameRepository = iGameRepository;
    }

    @Override
    public IGunRepository getGunRepository() {
        return this.iGunRepository;
    }

    @Autowired
    @Override
    public void setGunRepository(IGunRepository iGunRepository) {
        this.iGunRepository = iGunRepository;
    }

    @Override
    public GunDTO findById(Integer id) {
        return IMapperGun.INSTANCE.toGunDTO(iGunRepository.findById(id).get());
    }

    @Override
    public List<GunDTO> findAll() {
        List<GunDTO> result = new ArrayList<>();
        List<Gun> guns = iGunRepository.findAll();
        for (Gun gun : guns) {
            result.add(IMapperGun.INSTANCE.toGunDTO(gun));
        }
        return result;
    }

    @Override
    public GunDTO save(GunDTO gun) {
        Gun gunEntity = IMapperGun.INSTANCE.toGun(gun);
        Set<Integer> games_id = gun.getGames_id();
        Set<Game> games = new HashSet<>();
        for(Integer id : games_id){
            games.add(iGameRepository.findById(id).get());
        }
        gunEntity.setGames(games);
        iGunRepository.save(gunEntity);
        return IMapperGun.INSTANCE.toGunDTO(gunEntity);
    }

    @Override
    public void deleteById(Integer id) {
        iGunRepository.deleteById(id);
    }
}
