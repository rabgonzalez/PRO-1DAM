package ies.puerto.modelo.impl;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import ies.puerto.utilidades.Utilidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Root(name="personaje")
public class Persona extends Utilidades {
    @Element(name="nombre")
    private String nombre;

    @Element(name="alias")
    private String alias;

    @Element(name="genero")
    private String genero;

    @ElementList(name="poderes")
    private List<String> poderes;

    public Persona(){
        poderes = new ArrayList<>();
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, String alias, String genero, List<String> poderes) {
        this.nombre = nombre;
        this.alias = alias;
        this.genero = genero;
        this.poderes = poderes;
    }

    public String getNombre() {
        return this.nombre;
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

    public List<String> getPoderes() {
        return this.poderes;
    }

    public void setPoderes(List<String> poderes) {
        this.poderes = poderes;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Persona)) {
            return false;
        }
        Persona persona = (Persona) o;
        return Objects.equals(nombre, persona.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
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

    public String personaToCsv(){
        return nombre+DELIMITADOR+alias+DELIMITADOR+genero+DELIMITADOR+poderes;
    }
}
