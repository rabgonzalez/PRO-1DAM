package ies.puerto.modelo.impl;

import java.util.Set;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;


@Entity
@Table(name = "Poderes")
public class Poderes implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "poder", nullable = false)
    private String poder;

    @ManyToMany
    private Set<Personajes> personajes;

    public Poderes() {
    }

    public Poderes(Integer id){
        this.id = id;
    }

    public Poderes(Integer id, String poder, Set<Personajes> personajes) {
        this.id = id;
        this.poder = poder;
        this.personajes = personajes;
    }

    public Integer getId() {
        return this.id;
    }

    public String getPoder() {
        return this.poder;
    }

    public void setPoder(String poder) {
        this.poder = poder;
    }

    public Set<Personajes> getPersonajes() {
        return this.personajes;
    }

    public void setPersonajes(Set<Personajes> personajes) {
        this.personajes = personajes;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Poderes)) {
            return false;
        }
        Poderes poderes = (Poderes) o;
        return Objects.equals(id, poderes.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, poder, personajes);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", poder='" + getPoder() + "'" +
            ", personajes='" + getPersonajes() + "'" +
            "}";
    }    
}
