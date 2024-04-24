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
    @Column(name = "id", nullable = false)
    private Integer id;
    @Column(name = "personaje_id", insertable = false, updatable = false) 
    private Integer personaje_id;
    @Column(name = "alias", nullable = false)
    private String alias;

    @OneToOne
    private Personajes personaje;
    
    public Alias() {
    }

    public Alias(Integer id){
        this.id = id;
    }

    public Alias(Integer id, Integer personaje_id, String alias) {
        this.id = id;
        this.personaje_id = personaje_id;
        this.alias = alias;
    }

    public Integer getId() {
        return this.id;
    }

    
    public Integer getPersonaje_id() {
        return this.personaje_id;
    }

    public void setPersonaje_id(Integer personaje_id) {
        this.personaje_id = personaje_id;
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
        return Objects.hash(id, personaje_id, alias);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", personaje_id='" + getPersonaje_id() + "'" +
            ", alias='" + getAlias() + "'" +
            "}";
    }
}