package es.ies.puerto.mapper.classic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import es.ies.puerto.dto.AddressDTO;
import es.ies.puerto.model.entity.Address;

public class MapperAddressTest extends MappersHelp{
    AddressDTO addressDTOMapper;
    Address addressEntityMapper;

    @Test
    public void AddressToAddressDTOTest(){
        addressDTOMapper = mapperAddress.addressToAddressDTO(addressEntity);
        Assertions.assertEquals(addressDTO.getId(), addressDTOMapper.getId());
        Assertions.assertEquals(addressDTO.getAddress(), addressDTOMapper.getAddress());
        Assertions.assertEquals(addressDTO.getClass(), addressDTOMapper.getClass());
        Assertions.assertEquals(addressDTO.getCountry(), addressDTOMapper.getCountry());
        Assertions.assertEquals(addressDTO.getZipCode(), addressDTOMapper.getZipCode());
        Assertions.assertEquals(addressDTO.getCustomer(), addressDTOMapper.getCustomer());
    }

    @Test
    public void AddressDTOToAddressTest(){
        addressEntityMapper = mapperAddress.addressDTOToAddress(addressDTO);
        Assertions.assertEquals(addressEntityMapper.getId(), addressEntity.getId());
        Assertions.assertEquals(addressEntityMapper.getAddress(), addressEntity.getAddress());
        Assertions.assertEquals(addressEntityMapper.getClass(), addressEntity.getClass());
        Assertions.assertEquals(addressEntityMapper.getCountry(), addressEntity.getCountry());
        Assertions.assertEquals(addressEntityMapper.getZipCode(), addressEntity.getZipCode());
        Assertions.assertEquals(addressEntityMapper.getCustomer(), addressEntity.getCustomer());
    }
}