package es.ies.puerto.model.dto;

import java.util.Objects;

public class GameDTO {
    private int id;
    private String gameName;
    private String releaseDate;
    private Float rating;
    private int gamemode_id;
    private int map_id;
    private int agent_id;
    private int gun_id;

    public int getGamemode_id() {
        return this.gamemode_id;
    }

    public void setGamemode_id(int gamemode_id) {
        this.gamemode_id = gamemode_id;
    }

    public int getMap_id() {
        return this.map_id;
    }

    public void setMap_id(int map_id) {
        this.map_id = map_id;
    }

    public int getAgent_id() {
        return this.agent_id;
    }

    public void setAgent_id(int agent_id) {
        this.agent_id = agent_id;
    }

    public int getGun_id() {
        return this.gun_id;
    }

    public void setGun_id(int gun_id) {
        this.gun_id = gun_id;
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
                ", agent_id='" + getAgent_id() + "'" +
                ", gamemode_id='" + getGamemode_id() + "'" +
                ", map_id='" + getMap_id() + "'" +
                "}";
    }
}
