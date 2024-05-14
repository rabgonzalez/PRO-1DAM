package es.ies.puerto.mappers.classic;

import es.ies.puerto.dto.AliasDTO;
import es.ies.puerto.dto.PersonajeDTO;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Personaje;

public class MapperAlias {

    public static Alias aliasDTOToAliasEntity(AliasDTO aliasDTO, PersonajeDTO personajeDTO){
        if (aliasDTO == null) {
            return null;
        }
        Alias alias = new Alias();
        alias.setId(aliasDTO.getId());
        alias.setDescripcion(aliasDTO.getDescripcion());
        alias.setPersonaje_id(personajeDTO.getId());
        return alias;
    }

    public static AliasDTO aliasEntityToAliasDTO(Alias alias, Personaje personaje){
        if (alias == null) {
            return null;
        }
        AliasDTO aliasDTO = new AliasDTO();
        aliasDTO.setId(alias.getId());
        aliasDTO.setDescripcion(alias.getDescripcion());
        aliasDTO.setPersonaje_id(personaje.getId());
        return aliasDTO;
    }
} 
