package es.ies.puerto.model.entity;

import java.util.Set;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "Gamemode")
public class Gamemode implements Serializable {

    private static final long serialVersionUID = -9058773902L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    @ManyToMany
    private Set<Map> maps;

    @ManyToMany
    private Set<Game> games;

    public Gamemode() {
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

    public Set<Map> getMaps() {
        return this.maps;
    }

    public void setMaps(Set<Map> maps) {
        this.maps = maps;
    }

    public Set<Game> getGames() {
        return this.games;
    }

    public void setGame(Set<Game> games) {
        this.games = games;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Gamemode)) {
            return false;
        }
        Gamemode gamemode = (Gamemode) o;
        return id == gamemode.id;
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
            "}";
    }
}
