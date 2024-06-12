package es.ies.puerto.model.dto;

import java.util.Objects;
import java.util.Set;

public class GunDTO {
    private int id;
    private String name;
    private String type;
    private String rarity;
    private Set<Integer> games_id;

    public Set<Integer> getGames_id() {
        return this.games_id;
    }

    public void setGames_id(Set<Integer> games_id) {
        this.games_id = games_id;
    }

    public GunDTO() {
    }

    public GunDTO(int id){
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

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRarity() {
        return this.rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof GunDTO)) {
            return false;
        }
        GunDTO gunDTO = (GunDTO) o;
        return id == gunDTO.id;
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
                ", type='" + getType() + "'" +
                ", rarity='" + getRarity() + "'" +
                "}";
    }
}
