package es.ies.puerto.mappers.struct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import es.ies.puerto.dto.PoderDTO;
import es.ies.puerto.modelo.db.entidades.Personaje;
import es.ies.puerto.modelo.db.entidades.Poder;

@Mapper
public interface IMapperPoder {
    IMapperPoder INSTANCE = Mappers.getMapper(IMapperPoder.class);

    @Mapping(source = "poderDTO.id", target = "id")
    @Mapping(source = "poderDTO.nombre", target = "nombre")
    @Mapping(source = "personaje", target = "personaje")
    public Poder poderDTOToPoderEntity(PoderDTO poderDTO, Personaje personaje);
    public PoderDTO poderEntityToPoderDTO(Poder poder);
} 
