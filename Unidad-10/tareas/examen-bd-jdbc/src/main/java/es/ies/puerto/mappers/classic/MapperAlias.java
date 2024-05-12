package es.ies.puerto.mappers.classic;

import es.ies.puerto.dto.AliasDTO;
import es.ies.puerto.modelo.db.entidades.Alias;

public class MapperAlias {

    public static Alias aliasDTOToAliasEntity(AliasDTO aliasDTO){
        if (aliasDTO == null) {
            return null;
        }
        Alias alias = new Alias();
        alias.setId(aliasDTO.getId());
        alias.setDescripcion(aliasDTO.getDescripcion());
        alias.setPersonaje_id(aliasDTO.getPersonaje_id());
        return alias;
    }

    public static AliasDTO aliasEntityToAliasDTO(Alias alias){
        if (alias == null) {
            return null;
        }
        AliasDTO aliasDTO = new AliasDTO();
        aliasDTO.setId(alias.getId());
        aliasDTO.setDescripcion(alias.getDescripcion());
        aliasDTO.setPersonaje_id(alias.getPersonaje_id());
        return aliasDTO;
    }
} 
