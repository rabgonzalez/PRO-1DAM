package es.ies.puerto.model.entity;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "Map")
public class Map implements Serializable {

    private static final long serialVersionUID = -9058773902L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String country;

    @ManyToOne
    private Game game;

    @ManyToMany
    private Set<Gamemode> gamemodes;

    public Map() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Game getGame() {
        return this.game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public Set<Gamemode> getGamemodes() {
        return this.gamemodes;
    }

    public void setGamemodes(Set<Gamemode> gamemodes) {
        this.gamemodes = gamemodes;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Map)) {
            return false;
        }
        Map map = (Map) o;
        return id == map.id;
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
                ", country='" + getCountry() + "'" +
                "}";
    }
}
