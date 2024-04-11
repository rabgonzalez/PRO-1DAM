package ies.puerto.modelo.impl;

import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

public class Personaje {
    private String nombre;
    private String alias;
    private String genero;
    private Set<String> poderes;

    public Personaje(){
        poderes = new HashSet<>();
    }

    public Personaje(String nombre, String alias, String genero, Set<String> poderes) {
        this.nombre = nombre;
        this.alias = alias;
        this.genero = genero;
        this.poderes = poderes;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return this.alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Set<String> getPoderes() {
        return this.poderes;
    }

    public void setPoderes(Set<String> poderes) {
        this.poderes = poderes;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Personaje)) {
            return false;
        }
        Personaje personaje = (Personaje) o;
        return Objects.equals(nombre, personaje.nombre) && Objects.equals(alias, personaje.alias) && Objects.equals(genero, personaje.genero) && Objects.equals(poderes, personaje.poderes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, alias, genero, poderes);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", alias='" + getAlias() + "'" +
            ", genero='" + getGenero() + "'" +
            ", poderes='" + getPoderes() + "'" +
            "}";
    }
}