package es.ies.puerto.model;

import java.util.Objects;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import es.ies.puerto.model.entity.Game;
import es.ies.puerto.model.entity.User;

class UserTest {
    private static final String TEST = "test";
    User user;
    User user2;

    @BeforeEach
    void beforeEach(){
        user = new User();
        user.setName(TEST);
        user.setPassword(TEST);
        user2 = new User(TEST, TEST);
    }

    @Test
    void notNullTest(){
        Assertions.assertNotNull(user);
        Assertions.assertNotNull(user2);
    }

    @Test
    void gettersSettersTest(){
        Assertions.assertEquals(TEST, user.getName());
        Assertions.assertEquals(TEST, user.getPassword());
    }

    @Test
    void equalsSameTest(){
        Assertions.assertEquals(user, user);
    }

    @Test
    void equalsNotSameTest(){
        Game game = new Game();
        Assertions.assertNotEquals(user, game);
    }

    @Test
    void equalsTrueTest(){
        Assertions.assertEquals(user, user2);
    }

    @Test
    void equalsFalseTest(){
        user2.setName("TEST");
        Assertions.assertNotEquals(user, user2);
    }

    @Test
    void toStringTest(){
        Assertions.assertTrue(user.toString().contains(TEST));
    }

    @Test
    void equalsTest(){
        Assertions.assertEquals(user.hashCode(), Objects.hash(TEST, TEST));
    }
}
