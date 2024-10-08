package es.ies.puerto.modelo.db.entidades;

import java.io.Serializable;
import java.util.Objects;

public class Equipamiento implements Serializable {

    String id;
    String nombre;
    String descripcion;

    String personaje_id;

    public Equipamiento() {
    }

    public Equipamiento(String id) {
        this.id = id;
    }

    public Equipamiento(String id, String nombre, String descripcion, String personaje_id) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.personaje_id = personaje_id;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPersonaje_id() {
        return this.personaje_id;
    }

    public void setPersonaje_id(String personaje_id) {
        this.personaje_id = personaje_id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Equipamiento)) {
            return false;
        }
        Equipamiento equipamiento = (Equipamiento) o;
        return Objects.equals(id, equipamiento.id);
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
            ", descripcion='" + getDescripcion() + "'" +
            "}";
    }

}

