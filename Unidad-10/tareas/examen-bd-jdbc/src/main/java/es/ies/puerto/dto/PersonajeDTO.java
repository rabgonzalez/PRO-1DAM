package es.ies.puerto.dto;

import java.util.Set;
import java.util.Objects;

public class PersonajeDTO {
    private String id;
    private String nombre;
    private String genero;
    private AliasDTO alias;
    private Set<EquipamientoDTO> equipamientos;
    private Set<PoderDTO> poderes;

    public PersonajeDTO() {
    }

    public PersonajeDTO(String id){
        this.id = id;
    }

    public PersonajeDTO(String id, String nombre, String genero){
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
    }

    public PersonajeDTO(String id, String nombre, String genero, AliasDTO alias, Set<EquipamientoDTO> equipamientos, Set<PoderDTO> poderes) {
        this.id = id;
        this.nombre = nombre;
        this.genero = genero;
        this.alias = alias;
        this.equipamientos = equipamientos;
        this.poderes = poderes;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
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

    public AliasDTO getAlias() {
        return this.alias;
    }

    public void setAlias(AliasDTO alias) {
        this.alias = alias;
    }

    public Set<EquipamientoDTO> getEquipamientos() {
        return this.equipamientos;
    }

    public void setEquipamientos(Set<EquipamientoDTO> equipamientos) {
        this.equipamientos = equipamientos;
    }

    public Set<PoderDTO> getPoderes() {
        return this.poderes;
    }

    public void setPoderes(Set<PoderDTO> poderes) {
        this.poderes = poderes;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PersonajeDTO)) {
            return false;
        }
        PersonajeDTO mapperPersonaje = (PersonajeDTO) o;
        return Objects.equals(id, mapperPersonaje.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", genero='" + getGenero() + "'" +
            ", alias='" + getAlias() + "'" +
            ", equipamientos='" + getEquipamientos() + "'" +
            ", poderes='" + getPoderes() + "'" +
            "}";
    }    
}
