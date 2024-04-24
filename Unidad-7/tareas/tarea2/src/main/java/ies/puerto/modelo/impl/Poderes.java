package ies.puerto.modelo.impl;

import java.util.Set;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;


@Entity
@Table(name = "Poderes")
public class Poderes implements Serializable {

    private static final long serialVersionUID = -7250234396452258822L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "poder", nullable = false)
    private String poder;

    @ManyToMany
    @JoinTable(name = "Personajes_Poderes",
        joinColumns=
            @JoinColumn(name="poder_id", referencedColumnName="id"),
        inverseJoinColumns=
            @JoinColumn(name="personaje_id", referencedColumnName="id")
    )
    private Set<Personajes> personajes;

    public Poderes() {
    }

    public Poderes(Integer id){
        this.id = id;
    }

    public Poderes(Integer id, String poder) {
        this.id = id;
        this.poder = poder;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        return Objects.equals(poder, poderes.poder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, poder);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", poder='" + getPoder() + "'" +
            "}";
    }    
}
