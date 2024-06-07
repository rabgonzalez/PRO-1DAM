package es.ies.puerto.model;

import java.util.Set;
import java.util.Objects;

public class Agent {
    private String name;
    private String rarity;
    private int age;
    private Set<Gun> guns;

    public Agent() {
    }

    public Agent(String name){
        this.name = name;
    }

    public Agent(String name, String rarity, int age, Set<Gun> guns) {
        this.name = name;
        this.rarity = rarity;
        this.age = age;
        this.guns = guns;
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

    public Set<Gun> getGuns() {
        return this.guns;
    }

    public void setGuns(Set<Gun> guns) {
        this.guns = guns;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Agent)) {
            return false;
        }
        Agent agent = (Agent) o;
        return name == agent.name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "{" +
            "name='" + getName() + "'" +
            ", rarity='" + getRarity() + "'" +
            ", age='" + getAge() + "'" +
            ", guns='" + getGuns() + "'" +
            "}";
    }    
}
