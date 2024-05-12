package es.ies.puerto.dto;

import java.util.Set;

import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.db.entidades.Poder;
import java.util.Objects;

public class PersonajeDTO {
    private String id;
    private String nombre;
    private String genero;
    private Alias alias;
    private Set<Equipamiento> equipamientos;
    private Set<Poder> poderes;


    public PersonajeDTO() {
    }

    public PersonajeDTO(String id, String nombre, String genero, Alias alias, Set<Equipamiento> equipamientos, Set<Poder> poderes) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.alias = alias;
        this.equipamientos = equipamientos;
        this.poderes = poderes;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Alias getAlias() {
        return this.alias;
    }

    public void setAlias(Alias alias) {
        this.alias = alias;
    }

    public Set<Equipamiento> getEquipamientos() {
        return this.equipamientos;
    }

    public void setEquipamientos(Set<Equipamiento> equipamientos) {
        this.equipamientos = equipamientos;
    }

    public Set<Poder> getPoderes() {
        return this.poderes;
    }

    public void setPoderes(Set<Poder> poderes) {
        this.poderes = poderes;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PersonajeDTO)) {
            return false;
        }
        PersonajeDTO mapperPersonaje = (PersonajeDTO) o;
        return Objects.equals(id, mapperPersonaje.id) && Objects.equals(nombre, mapperPersonaje.nombre) && Objects.equals(genero, mapperPersonaje.genero) && Objects.equals(alias, mapperPersonaje.alias) && Objects.equals(equipamientos, mapperPersonaje.equipamientos) && Objects.equals(poderes, mapperPersonaje.poderes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, genero, alias, equipamientos, poderes);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", genero='" + getGenero() + "'" +
            ", alias='" + getAlias() + "'" +
            ", equipamientos='" + getEquipamientos() + "'" +
            ", poderes='" + getPoderes() + "'" +
            "}";
    }    
}
