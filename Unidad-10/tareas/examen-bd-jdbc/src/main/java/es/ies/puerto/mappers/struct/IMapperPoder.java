package es.ies.puerto.mappers.struct;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import es.ies.puerto.dto.PoderDTO;
import es.ies.puerto.modelo.db.entidades.Poder;

@Mapper
public interface IMapperPoder {
    IMapperPoder INSTANCE = Mappers.getMapper(IMapperPoder.class);

    public Poder poderDTOToPoderEntity(PoderDTO poderDTO);
    public PoderDTO poderEntityToPoderDTO(Poder poder);
} 
