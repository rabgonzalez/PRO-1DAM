package es.ies.puerto.mapper.struct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import es.ies.puerto.dto.AddressDTO;
import es.ies.puerto.model.entity.Address;

@Mapper
public interface IMapperAddress {
    IMapperAddress INSTANCE = Mappers.getMapper(IMapperAddress.class);

    @Mapping(source = "isla", target = "provincia")
    Address addressDTOToAddress(AddressDTO addressDTO);

    @Mapping(source = "provincia", target = "isla")
    AddressDTO addressToAddressDTO(Address address);
}
