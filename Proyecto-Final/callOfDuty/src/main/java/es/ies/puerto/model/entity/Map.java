package es.ies.puerto.model.entity;

import java.util.Set;
import java.util.Objects;

public class Map {
    private String name;
    private String country;

    public Map() {
    }

    public Map(String name){
        this.name = name;
    }

    public Map(String name, String country) {
        this.name = name;
        this.country = country;
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
        if (!(o instanceof Map)) {
            return false;
        }
        Map map = (Map) o;
        return Objects.equals(name, map.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", country='" + getCountry() + "'" +
            "}";
    }    
}
