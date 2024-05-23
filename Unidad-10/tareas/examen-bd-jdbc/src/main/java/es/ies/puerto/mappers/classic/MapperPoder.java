package es.ies.puerto.mappers.classic;

import es.ies.puerto.dto.PoderDTO;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.db.entidades.Poder;

public class MapperPoder {
    
    public static Poder poderDTOToPoderEntity(PoderDTO poderDTO, Personaje personaje){
        if(poderDTO == null || personaje == null){
            return null;
        }
        Poder poder = new Poder();
        poder.setId(poderDTO.getId());
        poder.setNombre(poderDTO.getNombre());
        poder.setPersonaje(personaje);
        return poder;
    }

    public static PoderDTO poderEntityToPoderDTO(Poder poder){
        if(poder == null){
            return null;
        }
        PoderDTO poderDTO = new PoderDTO();
        poderDTO.setId(poder.getId());
        poderDTO.setNombre(poder.getNombre());
        return poderDTO;
    }
}
