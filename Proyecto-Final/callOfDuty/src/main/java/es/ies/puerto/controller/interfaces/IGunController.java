package es.ies.puerto.controller.interfaces;

import java.util.List;

import es.ies.puerto.model.dto.GunDTO;
import es.ies.puerto.model.repository.IGunRepository;

public interface IGunController {
    public IGunRepository getGunRepository();

    public void setGunRepository(IGunRepository gun);

    public GunDTO findById(Integer id);

    public List<GunDTO> findAll();

    public GunDTO save(GunDTO gun);

    public void deleteById(Integer id);
}
