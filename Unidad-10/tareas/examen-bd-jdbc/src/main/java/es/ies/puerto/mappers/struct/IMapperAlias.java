package es.ies.puerto.mappers.struct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import es.ies.puerto.dto.AliasDTO;
import es.ies.puerto.dto.PersonajeDTO;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Personaje;

@Mapper(uses = IMapperPersonaje.class)
public interface IMapperAlias {
    IMapperAlias INSTANCE = Mappers.getMapper(IMapperAlias.class);

    @Mapping(source = "aliasDTO.id", target = "id")
    @Mapping(source = "personajeDTO.id", target = "personaje_id")
    public Alias aliasDTOToAliasEntity(AliasDTO aliasDTO, PersonajeDTO personajeDTO);

    @Mapping(source = "alias.id", target = "id")
    @Mapping(source = "personaje.id", target = "personaje_id")
    public AliasDTO aliasEntityToAliasDTO(Alias alias, Personaje personaje);
} 
