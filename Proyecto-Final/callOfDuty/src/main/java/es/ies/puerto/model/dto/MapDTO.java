package es.ies.puerto.model.dto;

import java.util.Objects;

public class MapDTO {
    private Integer id;
    private String name;
    private String country;
    private int game_id;
    private int gamemode_id;

    public int getGame_id() {
        return this.game_id;
    }

    public void setGame_id(int game_id) {
        this.game_id = game_id;
    }

    public int getGamemode_id() {
        return this.gamemode_id;
    }

    public void setGamemode_id(int gamemode_id) {
        this.gamemode_id = gamemode_id;
    }

    public MapDTO() {
    }

    public MapDTO(Integer id) {
        this.id = id;
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

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof MapDTO)) {
            return false;
        }
        MapDTO mapDTO = (MapDTO) o;
        return Objects.equals(id, mapDTO.id);
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
                ", game_id='" + getGame_id() + "'" +
                ", map_id='" + getGamemode_id() + "'" +
                "}";
    }
}