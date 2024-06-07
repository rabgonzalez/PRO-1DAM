package es.ies.puerto.model.entity;

import java.util.Objects;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameTest {
    private static final String RELEASEDATE = "07/06/2024";
    private static final String TYPE = "type";
    private static final String NAME = "name";
    Game game;
    Game game2;
    Game game3;
    Gun gun;

    @BeforeEach
    void beforeEach(){
        game3 = new Game();
        game = new Game(NAME);
        gun = new Gun();
        gun.setName(NAME);
        gun.setRarity(RELEASEDATE);
        gun.setType(TYPE);
        game2 = new Game(NAME, RELEASEDATE, 0f);
    }

    @Test
    void NotNullTest(){
        Assertions.assertNotNull(game);
        Assertions.assertNotNull(game2);
        Assertions.assertNotNull(game3);
    }

    @Test
    void gettersSetters(){
        game.setRating(0f);
        game.setReleaseDate(RELEASEDATE);
        Assertions.assertEquals(NAME, game.getGameName());
        Assertions.assertEquals(0f, game.getRating());
        Assertions.assertEquals(RELEASEDATE, game.getReleaseDate());
    }

    @Test
    void toStringTest(){
        Assertions.assertTrue(game.toString().contains(NAME));
    }

    @Test
    void hashCodeTest() {
        Assertions.assertEquals(Objects.hash(NAME), game.hashCode());
    }

    @Test
    void equalsSameTest(){
        Assertions.assertEquals(game, game);
    }

    @Test
    void equalsTrueTest(){
        Assertions.assertEquals(game, game2);
    }

    @Test
    void equalsGunTest(){
        Assertions.assertNotEquals(game, gun);
    }

    @Test
    void equalsFalseTest(){
        game.setGameName("NAME");
        Assertions.assertNotEquals(game, game2);
    }
}
