package es.ies.puerto.modelo.db.entidades;

import java.io.Serializable;
import java.util.Objects;
import java.util.Set;

public class Poder implements Serializable {
    String id;
    String nombre;
    private Set<Personaje> personaje;

    public Poder() {
    }

    public Poder(String id) {
        this.id = id;
    }

    public Poder(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Poder(String id, String nombre, Set<Personaje> personaje) {
        this.id = id;
        this.nombre = nombre;
        this.personaje = personaje;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Set<Personaje> getPersonaje() {
        return this.personaje;
    }

    public void setPersonaje(Set<Personaje> personaje) {
        this.personaje = personaje;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Poder)) {
            return false;
        }
        Poder poder = (Poder) o;
        return Objects.equals(id, poder.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nombre='" + getNombre() + "'" +
            "}";
    }

}
