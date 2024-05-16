package es.ies.puerto.modelo.db.entidades;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name = "Poder")
public class Poder implements Serializable {

    private static final long serialVersionUID = -7250234396452258822L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    String id;
    String nombre;

    @ManyToMany(mappedBy = "poderes")
    private Personaje personaje;

    public Poder() {
    }

    public Poder(String id) {
        this.id = id;
    }

    public Poder(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Poder(String id, String nombre, Personaje personaje) {
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

    public Personaje getPersonaje() {
        return this.personaje;
    }

    public void setPersonaje(Personaje personaje) {
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
        return Objects.hash(id, nombre, personaje);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", personaje='" + getPersonaje() + "'" +
            "}";
    }

}
