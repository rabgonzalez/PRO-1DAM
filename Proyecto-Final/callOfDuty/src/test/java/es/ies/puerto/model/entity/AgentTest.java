package es.ies.puerto.model.entity;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class AgentTest {
    private static final String RARITY = "rarity";
    private static final String TYPE = "type";
    private static final String NAME = "name";
    Agent agent;
    Agent agent2;
    Agent agent3;
    Gun gun;
    Set<Gun> guns;

    @BeforeEach
    void beforeEach(){
        agent3 = new Agent();
        agent = new Agent(NAME);
        gun = new Gun();
        gun.setName(NAME);
        gun.setRarity(RARITY);
        gun.setType(TYPE);
        guns = new HashSet<>(Arrays.asList(gun));
        agent2 = new Agent(NAME, RARITY, 0, guns);
    }

    @Test
    void NotNullTest(){
        Assertions.assertNotNull(agent);
        Assertions.assertNotNull(agent2);
    }

    @Test
    void gettersSetters(){
        guns = new HashSet<>();
        agent.setGuns(guns);
        agent.setAge(0);
        agent.setGuns(guns);
        agent.setRarity(RARITY);
        Assertions.assertEquals(NAME, agent.getName());
        Assertions.assertEquals(0, agent.getAge());
        Assertions.assertEquals(RARITY, agent.getRarity());
        Assertions.assertEquals(guns, agent.getGuns());
    }

    @Test
    void toStringTest(){
        Assertions.assertTrue(agent.toString().contains(NAME));
    }

    @Test
    void hashCodeTest() {
        Assertions.assertEquals(Objects.hash(NAME), agent.hashCode());
    }

    @Test
    void equalsSameTest(){
        Assertions.assertEquals(agent, agent);
    }

    @Test
    void equalsTrueTest(){
        Assertions.assertEquals(agent, agent2);
    }

    @Test
    void equalsGunTest(){
        Assertions.assertNotEquals(agent, gun);
    }

    @Test
    void equalsFalseTest(){
        agent.setName("NAME");
        Assertions.assertNotEquals(agent, agent2);
    }
}
