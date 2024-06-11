package es.ies.puerto.model.dto;

import java.util.Objects;

public class GamemodeDTO {
    private int id;
    private String name;
    private int maps_id;
    private int games_id;

    public int getMaps_id() {
        return this.maps_id;
    }

    public void setMaps_id(int maps_id) {
        this.maps_id = maps_id;
    }

    public int getGames_id() {
        return this.games_id;
    }

    public void setGames_id(int games_id) {
        this.games_id = games_id;
    }

    public GamemodeDTO() {
    }

    public GamemodeDTO(int id) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof GamemodeDTO)) {
            return false;
        }
        GamemodeDTO gamemodeDTO = (GamemodeDTO) o;
        return id == gamemodeDTO.id;
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
                ", game_id='" + getGames_id() + "'" +
                ", map_id='" + getMaps_id() + "'" +
                "}";
    }
}
