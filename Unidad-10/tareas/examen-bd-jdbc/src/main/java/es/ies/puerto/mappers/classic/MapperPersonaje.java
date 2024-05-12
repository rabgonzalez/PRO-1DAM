package es.ies.puerto.mappers.classic;

import es.ies.puerto.dto.PersonajeDTO;
import es.ies.puerto.modelo.db.entidades.Personaje;

public class MapperPersonaje {
 
    public static Personaje personajeDTOToPersonajeEntity(PersonajeDTO personajeDTO){
        if(personajeDTO == null){
            return  null;
        }
        Personaje personaje = new Personaje();
        personaje.setId(personajeDTO.getId());
        personaje.setNombre(personajeDTO.getNombre());
        personaje.setGenero(personajeDTO.getGenero());
        personaje.setAlias(personajeDTO.getAlias());
        personaje.setEquipamientos(personajeDTO.getEquipamientos());
        personaje.setPoderes(personajeDTO.getPoderes());
        return personaje;
    }

    public static PersonajeDTO personajeEntityToPersonajeDTO(Personaje personaje){
        if(personaje == null){
            return  null;
        }
        PersonajeDTO personajeDTO = new PersonajeDTO();
        personajeDTO.setId(personaje.getId());
        personajeDTO.setNombre(personaje.getNombre());
        personajeDTO.setGenero(personaje.getGenero());
        personajeDTO.setAlias(personaje.getAlias());
        personajeDTO.setEquipamientos(personaje.getEquipamientos());
        personajeDTO.setPoderes(personaje.getPoderes());
        return personajeDTO;
    }
}
