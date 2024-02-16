package main.java.ies.puerto.presentacion;
import java.util.Objects;

public abstract class Articulo {
    private String nombre;
    private String id;
    private String fentrada;
    private String fcaducidad;
    private float precio;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return this.id;
    }

    public String getFentrada() {
        return this.fentrada;
    }

    public void setFentrada(String fentrada) {
        this.fentrada = fentrada;
    }

    public String getFcaducidad() {
        return this.fcaducidad;
    }

    public void setFcaducidad(String fcaducidad) {
        this.fcaducidad = fcaducidad;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Articulo() {
    }

    public Articulo(String nombre, String id, String fentrada, String fcaducidad, float precio) {
        this.nombre = nombre;
        this.id = id;
        this.fentrada = fentrada;
        this.fcaducidad = fcaducidad;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", id='" + getId() + "'" +
            ", fentrada='" + getFentrada() + "'" +
            ", fcaducidad='" + getFcaducidad() + "'" +
            ", precio='" + getPrecio() + "'" +
            "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Articulo)) {
            return false;
        }
        Articulo articulo = (Articulo) o;
        return Objects.equals(id, articulo.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }    
}
