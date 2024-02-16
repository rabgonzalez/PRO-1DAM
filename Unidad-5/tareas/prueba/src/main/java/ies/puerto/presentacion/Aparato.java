package main.java.ies.puerto.presentacion;

public class Aparato extends Articulo {
    public Aparato(String nombre, String id, String fentrada, float precio){
        super(nombre, id, fentrada, precio);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", id='" + getId() + "'" +
            ", fentrada='" + getFentrada() + "'" +
            ", precio='" + getPrecio() + "'" +
            "}";
    }
}