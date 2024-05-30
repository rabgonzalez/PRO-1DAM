package es.ies.puerto.mappers.struct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import es.ies.puerto.dto.AliasDTO;
import es.ies.puerto.dto.PersonajeDTO;
import es.ies.puerto.modelo.db.entidades.Alias;

@Mapper
public interface IMapperAlias {
    IMapperAlias INSTANCE = Mappers.getMapper(IMapperAlias.class);

    @Mapping(source = "personajeDTO.id", target = "personaje_id")
    @Mapping(source = "aliasDTO.id", target = "id")
    public Alias aliasDTOToAliasEntity(AliasDTO aliasDTO, PersonajeDTO personajeDTO);
    public AliasDTO aliasEntityToAliasDTO(Alias alias);
} 
