package es.ies.puerto.model.dto;

import java.util.Set;
import java.util.Objects;

public class GameDTO {
    private int id;
    private String gameName;
    private String releaseDate;
    private Float rating;
    private Set<Integer> gamemodes_id;
    private Set<Integer> maps_id;
    private Set<Integer> agents_id;
    private Set<Integer> guns_id;

    public Set<Integer> getGamemodes_id() {
        return this.gamemodes_id;
    }

    public void setGamemodes_id(Set<Integer> gamemodes_id) {
        this.gamemodes_id = gamemodes_id;
    }

    public Set<Integer> getMaps_id() {
        return this.maps_id;
    }

    public void setMaps_id(Set<Integer> maps_id) {
        this.maps_id = maps_id;
    }

    public Set<Integer> getAgents_id() {
        return this.agents_id;
    }

    public void setAgents_id(Set<Integer> agents_id) {
        this.agents_id = agents_id;
    }

    public Set<Integer> getGuns_id() {
        return this.guns_id;
    }

    public void setGuns_id(Set<Integer> guns_id) {
        this.guns_id = guns_id;
    }

    public GameDTO() {
    }

    public GameDTO(int id) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof GameDTO)) {
            return false;
        }
        GameDTO gameDTO = (GameDTO) o;
        return id == gameDTO.id;
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
                "}";
    }
}
