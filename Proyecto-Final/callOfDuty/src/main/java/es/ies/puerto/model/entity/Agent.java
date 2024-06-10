package es.ies.puerto.model.entity;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.*;

@Entity
@Table(name = "Agent")
public class Agent implements Serializable {

    private static final long serialVersionUID = -9058773902L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String rarity;
    private int age;

    @ManyToOne
    private Game game;

    public Agent() {
    }

    public Agent(Integer id, String name, String rarity, int age, Game game) {
        this.id = id;
        this.name = name;
        this.rarity = rarity;
        this.age = age;
        this.game = game;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRarity() {
        return this.rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Game getGame() {
        return this.game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Agent id(Integer id) {
        setId(id);
        return this;
    }

    public Agent name(String name) {
        setName(name);
        return this;
    }

    public Agent rarity(String rarity) {
        setRarity(rarity);
        return this;
    }

    public Agent age(int age) {
        setAge(age);
        return this;
    }

    public Agent game(Game game) {
        setGame(game);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Agent)) {
            return false;
        }
        Agent agent = (Agent) o;
        return Objects.equals(id, agent.id) && Objects.equals(name, agent.name) && Objects.equals(rarity, agent.rarity) && age == agent.age && Objects.equals(game, agent.game);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, rarity, age, game);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", rarity='" + getRarity() + "'" +
            ", age='" + getAge() + "'" +
            "}";
    }
}
