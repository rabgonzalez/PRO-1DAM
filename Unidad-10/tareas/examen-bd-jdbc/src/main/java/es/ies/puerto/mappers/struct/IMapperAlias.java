package es.ies.puerto.mappers.struct;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import es.ies.puerto.dto.AliasDTO;
import es.ies.puerto.modelo.db.entidades.Alias;

@Mapper
public interface IMapperAlias {
    IMapperAlias INSTANCE = Mappers.getMapper(IMapperAlias.class);

    public Alias aliasDTOToAliasEntity(AliasDTO aliasDTO);
    public AliasDTO aliasEntityToAliasDTO(Alias alias);
} 
