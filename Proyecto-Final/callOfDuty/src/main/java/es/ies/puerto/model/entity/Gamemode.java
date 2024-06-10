package es.ies.puerto.model.entity;

import java.util.Set;
import java.util.Objects;

public class Gamemode {
    private int id;
    private String name;
    private Set<Map> maps;

    public Gamemode() {
    }

    public Gamemode(String name) {
        this.name = name;
    }

    public Gamemode(String name, Set<Map> maps) {
        this.name = name;
        this.maps = maps;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Map> getMaps() {
        return this.maps;
    }

    public void setMaps(Set<Map> maps) {
        this.maps = maps;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Gamemode)) {
            return false;
        }
        Gamemode gamemode = (Gamemode) o;
        return Objects.equals(name, gamemode.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "{" +
                " name='" + getName() + "'" +
                "}";
    }
}
