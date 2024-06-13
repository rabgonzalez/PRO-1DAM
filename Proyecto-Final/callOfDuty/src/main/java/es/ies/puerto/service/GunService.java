package es.ies.puerto.service;

import org.springframework.web.bind.annotation.RestController;

import es.ies.puerto.controller.GunController;
import es.ies.puerto.model.dto.GunDTO;

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
@RequestMapping("/gun")
@Service
public class GunService {
    Logger logger = LoggerFactory.getLogger(GunService.class);
    private GunController gunController;

    public GunController getGunController() {
        return this.gunController;
    }

    @Autowired
    public void setGunController(GunController gunController) {
        this.gunController = gunController;
    }

    @GetMapping("/")
    public List<GunDTO> getAllGun() {
        return gunController.findAll();
    }

    @GetMapping("/{id}")
    public GunDTO getGunById(@PathVariable(name = "id") final Integer id) {
        return gunController.findById(id);
    }

    @PostMapping("/")
    public GunDTO postGun(@RequestBody final GunDTO gun) {
        return gunController.save(gun);
    }

    @DeleteMapping("/{id}")
    public void deleteGunById(@PathVariable(name = "id") final Integer id) {
        gunController.deleteById(id);
    }
}
