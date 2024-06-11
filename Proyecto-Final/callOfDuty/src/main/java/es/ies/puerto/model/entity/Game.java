package es.ies.puerto.model.entity;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name = "Game")
public class Game implements Serializable {

    private static final long serialVersionUID = -9058773902L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String gameName;
    private String releaseDate;
    private Float rating;

    @ManyToMany
    private Set<Gamemode> gamemodes;

    @OneToMany(mappedBy = "game")
    private Set<Map> maps;

    @ManyToMany
    private Set<Gun> guns;

    @OneToMany(mappedBy = "game")
    private Set<Agent> agents;

    public Game() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGameName() {
        return this.gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getReleaseDate() {
        return this.releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Float getRating() {
        return this.rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public Set<Gamemode> getGamemodes() {
        return this.gamemodes;
    }

    public void setGamemodes(Set<Gamemode> gamemodes) {
        this.gamemodes = gamemodes;
    }

    public Set<Map> getMaps() {
        return this.maps;
    }

    public void setMaps(Set<Map> maps) {
        this.maps = maps;
    }

    public Set<Gun> getGuns() {
        return this.guns;
    }

    public void setGuns(Set<Gun> guns) {
        this.guns = guns;
    }

    public Set<Agent> getAgents() {
        return this.agents;
    }

    public void setAgents(Set<Agent> agents) {
        this.agents = agents;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Game)) {
            return false;
        }
        Game game = (Game) o;
        return id == game.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", gameName='" + getGameName() + "'" +
            ", releaseDate='" + getReleaseDate() + "'" +
            ", rating='" + getRating() + "'" +
            ", gamemodes='" + getGamemodes() + "'" +
            "}";
    }
}
