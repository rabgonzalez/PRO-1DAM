package es.ies.puerto.controller;

import java.util.ArrayList;
import java.util.List;

import es.ies.puerto.controller.interfaces.IGunController;
import es.ies.puerto.model.dto.GunDTO;
import es.ies.puerto.model.entity.Gun;
import es.ies.puerto.model.repository.IGunRepository;
import mappers.IMapperGun;

public class GunController implements IGunController {
    private IGunRepository iGunRepository;

    @Override
    public IGunRepository getGunRepository() {
        return this.iGunRepository;
    }

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
        return IMapperGun.INSTANCE.toGunDTO(iGunRepository.save(IMapperGun.INSTANCE.toGun(gun)));
    }

    @Override
    public void deleteById(Integer id) {
        iGunRepository.deleteById(id);
    }
}
