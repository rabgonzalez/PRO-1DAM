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

import es.ies.puerto.controller.MapController;
import es.ies.puerto.model.dto.MapDTO;

class MapServiceTest {
    @Mock
    MapController mapController;
    MapService mapService;

    @BeforeEach
    void beforeEach() {
        MockitoAnnotations.openMocks(this);
        mapService = new MapService();
        mapService.setMapController(mapController);
    }

    @Test
    void getControllerTest() {
        Assertions.assertEquals(mapController, mapService.getMapController());
    }

    @Test
    void getAllTest() {
        when(mapController.findAll()).thenReturn(new ArrayList<>());
        List<MapDTO> maps = mapService.getAllMap();
        Assertions.assertNotNull(maps);
    }

    @Test
    void getByIDTest() {
        when(mapController.findById(anyInt())).thenReturn(new MapDTO());
        MapDTO map = mapService.getMapById(1);
        Assertions.assertNotNull(map);
    }

    @Test
    void saveTest() {
        when(mapController.save(any())).thenReturn(new MapDTO());
        MapDTO map = mapService.postMap(new MapDTO());
        Assertions.assertNotNull(map);
    }

    @Test
    void deleteByIdTest() {
        mapService.deleteMapById(1);
        Assertions.assertNull(mapService.getMapById(1));
    }
}
