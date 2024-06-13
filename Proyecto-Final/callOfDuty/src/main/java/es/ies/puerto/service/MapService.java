package es.ies.puerto.service;

import org.springframework.web.bind.annotation.RestController;

import es.ies.puerto.controller.MapController;
import es.ies.puerto.model.dto.MapDTO;

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
@RequestMapping("/map")
@Service
public class MapService {
    Logger logger = LoggerFactory.getLogger(MapService.class);
    private MapController mapController;

    @Autowired
    public void setMapController(MapController mapController) {
        this.mapController = mapController;
    }

    @GetMapping("/")
    public List<MapDTO> getAllMap() {
        return mapController.findAll();
    }

    @GetMapping("/{id}")
    public MapDTO getMapById(@PathVariable(name = "id") final Integer id) {
        return mapController.findById(id);
    }

    @PostMapping("/")
    public MapDTO postMap(@RequestBody final MapDTO map) {
        return mapController.save(map);
    }

    @DeleteMapping("/{id}")
    public void deleteMapById(@PathVariable(name = "id") final Integer id) {
        mapController.deleteById(id);
    }
}
