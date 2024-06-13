package es.ies.puerto.service;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import es.ies.puerto.controller.GunController;
import es.ies.puerto.model.dto.GunDTO;

class GunServiceTest {
    @Mock
    GunController gunController;
    GunService gunService;

    @BeforeEach
    void beforeEach() {
        MockitoAnnotations.openMocks(this);
        gunService = new GunService();
        gunService.setGunController(gunController);
    }

    @Test
    void getControllerTest() {
        Assertions.assertEquals(gunController, gunService.getGunController());
    }

    @Test
    void getAllTest() {
        when(gunController.findAll()).thenReturn(new ArrayList<>());
        List<GunDTO> guns = gunService.getAllGun();
        Assertions.assertNotNull(guns);
    }

    @Test
    void getByIDTest() {
        when(gunController.findById(anyInt())).thenReturn(new GunDTO());
        GunDTO gun = gunService.getGunById(1);
        Assertions.assertNotNull(gun);
    }

    @Test
    void saveTest() {
        when(gunController.save(any())).thenReturn(new GunDTO());
        GunDTO gun = gunService.postGun(new GunDTO());
        Assertions.assertNotNull(gun);
    }

    @Test
    void deleteByIdTest() {
        gunService.deleteGunById(1);
        Assertions.assertNull(gunService.getGunById(1));
    }
}
