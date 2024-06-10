package es.ies.puerto.model.entity;

import java.util.Objects;

import org.springframework.data.annotation.Id;

//@Entity
//@Table(name = "Agent")
public class Agent {
    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;
    private String rarity;
    private int age;

    public Agent() {
    }

    public Agent(int id) {
        this.id = id;
    }

    public Agent(Integer id, String name, String rarity, int age) {
        this.id = id;
        this.name = name;
        this.rarity = rarity;
        this.age = age;
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

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Agent)) {
            return false;
        }
        Agent agent = (Agent) o;
        return id == agent.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
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
