package es.ies.puerto.model.entity;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GamemodeTest {
    private static final String COUNTRY = "country";
    private static final String NAME = "name";
    Gamemode gamemode;
    Gamemode gamemode2;
    Gamemode gamemode3;
    Map map;
    Set<Map> maps;

    @BeforeEach
    void beforeEach(){
        gamemode3 = new Gamemode();
        gamemode = new Gamemode(NAME);
        map = new Map();
        map.setName(NAME);
        map.setCountry(COUNTRY);
        maps = new HashSet<>(Arrays.asList(map));
        gamemode2 = new Gamemode(NAME, maps);
    }

    @Test
    void NotNullTest(){
        Assertions.assertNotNull(gamemode);
        Assertions.assertNotNull(gamemode2);
        Assertions.assertNotNull(gamemode3);
    }

    @Test
    void gettersSetters(){
        gamemode.setMaps(maps);
        Assertions.assertEquals(NAME, gamemode.getName());
        Assertions.assertEquals(maps, gamemode.getMaps());
    }

    @Test
    void toStringTest(){
        Assertions.assertTrue(gamemode.toString().contains(NAME));
    }

    @Test
    void hashCodeTest() {
        Assertions.assertEquals(Objects.hash(NAME), gamemode.hashCode());
    }

    @Test
    void equalsSameTest(){
        Assertions.assertEquals(gamemode, gamemode);
    }

    @Test
    void equalsTrueTest(){
        Assertions.assertEquals(gamemode, gamemode2);
    }

    @Test
    void equalsGunTest(){
        Assertions.assertNotEquals(gamemode, map);
    }

    @Test
    void equalsFalseTest(){
        gamemode.setName("NAME");
        Assertions.assertNotEquals(gamemode, gamemode2);
    }
}
