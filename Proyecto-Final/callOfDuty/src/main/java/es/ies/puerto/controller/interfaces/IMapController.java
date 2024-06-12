package es.ies.puerto.controller.interfaces;

import java.util.List;

import es.ies.puerto.model.dto.MapDTO;
import es.ies.puerto.model.repository.IMapRepository;

public interface IMapController {
    public IMapRepository getMapRepository();

    public void setMapRepository(IMapRepository map);

    public MapDTO findById(Integer id);

    public List<MapDTO> findAll();

    public MapDTO save(MapDTO map);

    public void deleteById(Integer id);
}
