package ies.puerto.modelo.impl;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "Alias")
public class Alias implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Integer id;
    //@Column(name = "personaje_id", nullable = false)
    @Column(name = "alias", nullable = false)
    private String alias;

    @OneToOne
    private Integer personaje_id;
    //private Personajes personajes;
    
    public Alias() {
    }

    public Alias(Integer id){
        this.id = id;
    }

    public Alias(Integer id, Integer personaje_id, String alias/**, Personajes personajes */) {
        this.id = id;
        this.personaje_id = personaje_id;
        this.alias = alias;
        //this.personajes = personajes;
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

    /**
    public Personajes getPersonajes() {
        return this.personajes;
    }

    public void setPersonajes(Personajes personajes) {
        this.personajes = personajes;
    }
    */

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
        return Objects.hash(id, personaje_id, alias/**, personajes*/);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", personaje_id='" + getPersonaje_id() + "'" +
            ", alias='" + getAlias() + "'" +
            //", personajes='" + getPersonajes() + "'" +
            "}";
    }
}