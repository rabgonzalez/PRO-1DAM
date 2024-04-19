package ies.puerto.modelo.impl;

import java.util.Set;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "Personajes")
public class Personajes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "genero")
    private String genero;

    @ManyToMany(mappedBy = "personajes")
    private Set<Poderes> poderes;

    @OneToOne(mappedBy = "personajes")
    private Alias alias;

    public Personajes() {
    }

    public Personajes(Integer id){
        this.id = id;
    }

    public Personajes(Integer id, String nombre, String genero, Set<Poderes> poderes, Alias alias) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.poderes = poderes;
        this.alias = alias;
    }

    public Integer getId() {
        return this.id;
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

    public Set<Poderes> getPoderes() {
        return this.poderes;
    }

    public void setPoderes(Set<Poderes> poderes) {
        this.poderes = poderes;
    }

    public Alias getAlias() {
        return this.alias;
    }

    public void setAlias(Alias alias) {
        this.alias = alias;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Personajes)) {
            return false;
        }
        Personajes personajes = (Personajes) o;
        return Objects.equals(id, personajes.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, genero, poderes, alias);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", genero='" + getGenero() + "'" +
            ", poderes='" + getPoderes() + "'" +
            ", alias='" + getAlias() + "'" +
            "}";
    }    
}