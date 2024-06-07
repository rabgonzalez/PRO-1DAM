package es.ies.puerto.model.entity;

import java.util.Objects;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MapTest {
    private static final String COUNTRY = "type";
    private static final String NAME = "name";
    Map map;
    Map map2;
    Map map3;
    Game game;

    @BeforeEach
    void beforeEach(){
        map = new Map(NAME);
        map.setCountry(COUNTRY);
        map2 = new Map(NAME, COUNTRY);
        map3 = new Map();
    }

    @Test
    void NotNullTest(){
        Assertions.assertNotNull(map);
        Assertions.assertNotNull(map2);
        Assertions.assertNotNull(map3);
    }

    @Test
    void gettersSetters(){
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
        Assertions.assertEquals(Objects.hash(NAME), map.hashCode());
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
        map.setName("NAME");
        Assertions.assertNotEquals(map, map2);
    }
}
