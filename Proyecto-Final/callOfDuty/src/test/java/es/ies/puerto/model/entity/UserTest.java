package es.ies.puerto.model.entity;

import java.util.Objects;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UserTest {
    private static final String NAME = "name";
    private static final String PASSWORD = "password";
    User user;
    User user2;
    Game game;

    @BeforeEach
    void beforeEach(){
        user = new User();
        user.setUsername(NAME);
        user.setPassword(PASSWORD);
        user2 = new User(NAME, PASSWORD);
    }

    @Test
    void NotNullTest(){
        Assertions.assertNotNull(user);
        Assertions.assertNotNull(user2);
    }

    @Test
    void gettersSetters(){
        user.setUsername(NAME);
        user.setPassword(PASSWORD);
        Assertions.assertEquals(NAME, user.getUsername());
        Assertions.assertEquals(PASSWORD, user.getPassword());
    }

    @Test
    void toStringTest(){
        Assertions.assertTrue(user.toString().contains(NAME));
    }

    @Test
    void hashCodeTest() {
        Assertions.assertEquals(Objects.hash(NAME, PASSWORD), user.hashCode());
    }

    @Test
    void equalsSameTest(){
        Assertions.assertEquals(user, user);
    }

    @Test
    void equalsTrueTest(){
        Assertions.assertEquals(user, user2);
    }

    @Test
    void equalsGunTest(){
        Assertions.assertNotEquals(user, game);
    }

    @Test
    void equalsFalseTest(){
        user.setUsername("NAME");
        Assertions.assertNotEquals(user, user2);
    }
}
