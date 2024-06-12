package es.ies.puerto.model.dto;

import java.util.Objects;
import java.util.Set;

public class GamemodeDTO {
    private int id;
    private String name;
    private Set<Integer> maps_id;
    private Set<Integer> games_id;

    public Set<Integer> getMaps_id() {
        return this.maps_id;
    }

    public void setMaps_id(Set<Integer> maps_id) {
        this.maps_id = maps_id;
    }

    public Set<Integer> getGames_id() {
        return this.games_id;
    }

    public void setGames_id(Set<Integer> games_id) {
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
                "}";
    }
}
