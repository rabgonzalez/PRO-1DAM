package es.ies.puerto.mappers.classic;

import es.ies.puerto.dto.EquipamientoDTO;
import es.ies.puerto.dto.PersonajeDTO;
import es.ies.puerto.modelo.db.entidades.Equipamiento;
import es.ies.puerto.modelo.db.entidades.Personaje;

public class MapperEquipamiento {
    
    public static Equipamiento equipamientoDTOToEquipamientoEntity(EquipamientoDTO equipamientoDTO, PersonajeDTO personajeDTO){
        if(equipamientoDTO == null){
            return null;
        }
        Equipamiento equipamiento = new Equipamiento();
        equipamiento.setId(equipamientoDTO.getId());
        equipamiento.setNombre(equipamientoDTO.getNombre());
        equipamiento.setDescripcion(equipamientoDTO.getDescripcion());
        equipamiento.setPersonaje_id(personajeDTO.getId());
        return equipamiento;
    }

    public static EquipamientoDTO equipamientoEntityToEquipamientoDTO(Equipamiento equipamiento, Personaje personaje){
        if(equipamiento == null){
            return null;
        }
        EquipamientoDTO equipamientoDTO = new EquipamientoDTO();
        equipamientoDTO.setId(equipamiento.getId());
        equipamientoDTO.setNombre(equipamiento.getNombre());
        equipamientoDTO.setDescripcion(equipamiento.getDescripcion());
        equipamientoDTO.setPersonaje_id(personaje.getId());
        return equipamientoDTO;
    }
}
