package es.ies.puerto.model.entity;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {
    private static final String RELEASEDATE = "07/06/2024";
    private static final String TYPE = "type";
    private static final String NAME = "name";
    private static final String COUNTRY = "country";
    Game game;
    Game game2;
    Game game3;
    Gun gun;
    Map map;
    Gamemode gamemode;
    Set<Gun> guns;
    Set<Map> maps;
    Set<Gamemode> gamemodes;

    @BeforeEach
    void beforeEach() {
        game3 = new Game();
        game = new Game(NAME);

        gun = new Gun();
        gun.setName(NAME);
        gun.setRarity(RELEASEDATE);
        gun.setType(TYPE);
        guns = new HashSet<>(Arrays.asList(gun));

        map = new Map();
        map.setName(NAME);
        map.setCountry(COUNTRY);
        maps = new HashSet<>(Arrays.asList(map));

        gamemode = new Gamemode();
        gamemode.setName(NAME);
        gamemode.setMaps(maps);
        gamemodes = new HashSet<>(Arrays.asList(gamemode));

        game2 = new Game(NAME, RELEASEDATE, 0f, gamemodes, maps, guns);
    }

    @Test
    void NotNullTest() {
        Assertions.assertNotNull(game);
        Assertions.assertNotNull(game2);
        Assertions.assertNotNull(game3);
    }

    @Test
    void gettersSetters() {
        gamemodes = new HashSet<>();
        maps = new HashSet<>();
        guns = new HashSet<>();
        game.setRating(0f);
        game.setReleaseDate(RELEASEDATE);
        game.setGamemodes(gamemodes);
        game.setMaps(maps);
        game.setGuns(guns);
        Assertions.assertEquals(NAME, game.getGameName());
        Assertions.assertEquals(0f, game.getRating());
        Assertions.assertEquals(RELEASEDATE, game.getReleaseDate());
        Assertions.assertEquals(gamemodes, game.getGamemodes());
        Assertions.assertEquals(maps, game.getMaps());
        Assertions.assertEquals(guns, game.getGuns());
    }

    @Test
    void toStringTest() {
        Assertions.assertTrue(game.toString().contains(NAME));
    }

    @Test
    void hashCodeTest() {
        Assertions.assertEquals(Objects.hash(NAME), game.hashCode());
    }

    @Test
    void equalsSameTest() {
        Assertions.assertEquals(game, game);
    }

    @Test
    void equalsTrueTest() {
        Assertions.assertEquals(game, game2);
    }

    @Test
    void equalsGunTest() {
        Assertions.assertNotEquals(game, gun);
    }

    @Test
    void equalsFalseTest() {
        game.setGameName("NAME");
        Assertions.assertNotEquals(game, game2);
    }
}
