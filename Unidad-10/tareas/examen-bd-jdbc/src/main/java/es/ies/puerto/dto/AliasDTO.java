package es.ies.puerto.dto;
import java.util.Objects;

public class AliasDTO {
    String id;
    String descripcion;
    String personaje_id;

    public AliasDTO() {
    }

    public AliasDTO(String id, String descripcion, String personaje_id) {
        this.id = id;
        this.descripcion = descripcion;
        this.personaje_id = personaje_id;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPersonaje_id() {
        return this.personaje_id;
    }

    public void setPersonaje_id(String personaje_id) {
        this.personaje_id = personaje_id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof AliasDTO)) {
            return false;
        }
        AliasDTO aliasDTO = (AliasDTO) o;
        return Objects.equals(id, aliasDTO.id) && Objects.equals(descripcion, aliasDTO.descripcion) && Objects.equals(personaje_id, aliasDTO.personaje_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, descripcion, personaje_id);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", descripcion='" + getDescripcion() + "'" +
            ", personaje_id='" + getPersonaje_id() + "'" +
            "}";
    }
}
