package es.ies.puerto.mappers.struct;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import es.ies.puerto.dto.EquipamientoDTO;
import es.ies.puerto.modelo.db.entidades.Equipamiento;

@Mapper
public interface IMapperEquipamiento {
    IMapperEquipamiento INSTANCE = Mappers.getMapper(IMapperEquipamiento.class);

    public Equipamiento equipamientoDTOToEquipamientoEntity(EquipamientoDTO equipamientoDTO);
    public EquipamientoDTO equipamientoEntityToEquipamientoDTO(Equipamiento equipamiento);
} 
