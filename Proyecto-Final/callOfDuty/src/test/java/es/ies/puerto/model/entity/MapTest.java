package es.ies.puerto.model.entity;

import java.util.Objects;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MapTest {
    private static final int ID = 1;
    private static final String COUNTRY = "type";
    private static final String NAME = "name";
    Map map;
    Map map2;
    Game game;

    @BeforeEach
    void beforeEach(){
        map2 = new Map(ID, NAME, COUNTRY);
        map = new Map();
        map.setId(ID);
    }

    @Test
    void NotNullTest(){
        Assertions.assertNotNull(map);
        Assertions.assertNotNull(map2);
    }

    @Test
    void gettersSetters(){
        map.setName(NAME);
        map.setCountry(COUNTRY);
        Assertions.assertEquals(NAME, map.getName());
        Assertions.assertEquals(COUNTRY, map.getCountry());
    }

    @Test
    void toStringTest(){
        Assertions.assertTrue(map.toString().contains(NAME));
    }

    @Test
    void hashCodeTest() {
        Assertions.assertEquals(Objects.hash(ID), map.hashCode());
    }

    @Test
    void equalsSameTest(){
        Assertions.assertEquals(map, map);
    }

    @Test
    void equalsTrueTest(){
        Assertions.assertEquals(map, map2);
    }

    @Test
    void equalsGunTest(){
        Assertions.assertNotEquals(map, game);
    }

    @Test
    void equalsFalseTest(){
        map.setId(0);
        Assertions.assertNotEquals(map, map2);
    }
}
