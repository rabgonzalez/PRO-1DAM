package es.ies.puerto.model.entity;

import java.util.Objects;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GunTest {
    private static final String TYPE = "type";
    private static final String NAME = "name";
    private static final String RARITY = "rarity";
    Gun gun;
    Gun gun2;
    Gun gun3;
    Game game;

    @BeforeEach
    void beforeEach(){
        gun = new Gun(NAME);
        gun.setRarity(RARITY);
        gun.setType(TYPE);
        gun2 = new Gun(NAME, TYPE, RARITY);
        gun3 = new Gun();
    }

    @Test
    void NotNullTest(){
        Assertions.assertNotNull(gun);
        Assertions.assertNotNull(gun2);
        Assertions.assertNotNull(gun3);
    }

    @Test
    void gettersSetters(){
        gun.setRarity(RARITY);
        gun.setType(TYPE);
        Assertions.assertEquals(NAME, gun.getName());
        Assertions.assertEquals(RARITY, gun.getRarity());
        Assertions.assertEquals(TYPE, gun.getType());
    }

    @Test
    void toStringTest(){
        Assertions.assertTrue(gun.toString().contains(NAME));
    }

    @Test
    void hashCodeTest() {
        Assertions.assertEquals(Objects.hash(NAME), gun.hashCode());
    }

    @Test
    void equalsSameTest(){
        Assertions.assertEquals(gun, gun);
    }

    @Test
    void equalsTrueTest(){
        Assertions.assertEquals(gun, gun2);
    }

    @Test
    void equalsGunTest(){
        Assertions.assertNotEquals(gun, game);
    }

    @Test
    void equalsFalseTest(){
        gun.setName("NAME");
        Assertions.assertNotEquals(gun, gun2);
    }
}
