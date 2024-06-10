package es.ies.puerto.model.entity;

import java.util.Objects;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AgentTest {
    private static final int ID = 1;
    private static final String RARITY = "rarity";
    private static final String TYPE = "type";
    private static final String NAME = "name";
    Agent agent;
    Agent agent2;
    Gun gun;

    @BeforeEach
    void beforeEach() {
        agent = new Agent();
        agent.setId(ID);
        gun = new Gun();
        gun.setName(NAME);
        gun.setRarity(RARITY);
        gun.setType(TYPE);
        agent2 = new Agent(ID, NAME, RARITY, 0);
    }

    @Test
    void NotNullTest() {
        Assertions.assertNotNull(agent);
        Assertions.assertNotNull(agent2);
    }

    @Test
    void gettersSetters() {
        agent.setName(NAME);
        agent.setAge(0);
        agent.setRarity(RARITY);
        Assertions.assertEquals(ID, agent.getId());
        Assertions.assertEquals(NAME, agent.getName());
        Assertions.assertEquals(0, agent.getAge());
        Assertions.assertEquals(RARITY, agent.getRarity());
    }

    @Test
    void toStringTest() {
        Assertions.assertTrue(agent.toString().contains(NAME));
    }

    @Test
    void hashCodeTest() {
        Assertions.assertEquals(Objects.hash(ID), agent.hashCode());
    }

    @Test
    void equalsSameTest() {
        Assertions.assertEquals(agent, agent);
    }

    @Test
    void equalsTrueTest() {
        Assertions.assertEquals(agent, agent2);
    }

    @Test
    void equalsGunTest() {
        Assertions.assertNotEquals(agent, gun);
    }

    @Test
    void equalsFalseTest() {
        agent.setId(0);
        Assertions.assertNotEquals(agent, agent2);
    }
}
