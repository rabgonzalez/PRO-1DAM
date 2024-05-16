package es.ies.puerto.mappers.struct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import es.ies.puerto.dto.AliasDTO;
import es.ies.puerto.modelo.db.entidades.Alias;
import es.ies.puerto.modelo.db.entidades.Personaje;

@Mapper
public interface IMapperAlias {
    IMapperAlias INSTANCE = Mappers.getMapper(IMapperAlias.class);

    @Mapping(source = "personaje.id", target = "personaje_id")
    @Mapping(source = "aliasDTO.id", target = "id")
    public Alias aliasDTOToAliasEntity(AliasDTO aliasDTO, Personaje personaje);
    public AliasDTO aliasEntityToAliasDTO(Alias alias);
} 
