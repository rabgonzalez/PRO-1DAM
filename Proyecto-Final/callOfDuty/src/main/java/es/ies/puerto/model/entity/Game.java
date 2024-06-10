package es.ies.puerto.model.entity;

import java.util.Objects;
import java.util.Set;

public class Game {
    private int id;
    private String gameName;
    private String releaseDate;
    private Float rating;
    private Set<Gamemode> gamemodes;
    private Set<Map> maps;
    private Set<Gun> guns;

    public Game() {
    }

    public Game(String gameName) {
        this.gameName = gameName;
    }

    public Game(String gameName, String releaseDate, Float rating, Set<Gamemode> gamemodes, Set<Map> maps,
            Set<Gun> guns) {
        this.gameName = gameName;
        this.releaseDate = releaseDate;
        this.rating = rating;
        this.gamemodes = gamemodes;
        this.maps = maps;
        this.guns = guns;
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

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Game)) {
            return false;
        }
        Game game = (Game) o;
        return Objects.equals(gameName, game.gameName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gameName);
    }

    @Override
    public String toString() {
        return "{" +
                " gameName='" + getGameName() + "'" +
                ", releaseDate='" + getReleaseDate() + "'" +
                ", rating='" + getRating() + "'" +
                "}";
    }
}
