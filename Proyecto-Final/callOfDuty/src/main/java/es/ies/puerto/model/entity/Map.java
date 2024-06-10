package es.ies.puerto.model.entity;

import java.util.Objects;

public class Map {
    private int id;
    private String name;
    private String country;

    public Map() {
    }

    public Map(int id, String name, String country) {
        this.id = id;
        this.name = name;
        this.country = country;
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

    public Map id(int id) {
        setId(id);
        return this;
    }

    public Map name(String name) {
        setName(name);
        return this;
    }

    public Map country(String country) {
        setCountry(country);
        return this;
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
