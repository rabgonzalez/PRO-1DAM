package ies.puerto.modelo.impl;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "Alias")
public class Alias implements Serializable {

    private static final long serialVersionUID = -7250234396452258822L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "alias")
    private String alias;

    @OneToOne
    @JoinColumn(name = "personaje_id")
    private Personajes personaje;
    
    public Alias() {
    }

    public Alias(Integer id){
        this.id = id;
    }

    public Alias(Integer id, Personajes personaje, String alias) {
        this.id = id;
        this.personaje = personaje;
        this.alias = alias;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public Personajes getPersonaje() {
        return this.personaje;
    }

    public void setPersonaje(Personajes personaje) {
        this.personaje = personaje;
    }

    public Integer getId() {
        return this.id;
    }

    public String getAlias() {
        return this.alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public Personajes getPersonajes() {
        return this.personaje;
    }

    public void setPersonajes(Personajes personaje) {
        this.personaje = personaje;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Alias)) {
            return false;
        }
        Alias alias = (Alias) o;
        return Objects.equals(id, alias.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", personaje='" + getPersonaje() + "'" +
            ", alias='" + getAlias() + "'" +
            "}";
    }
}