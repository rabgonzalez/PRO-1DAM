package es.ies.puerto.mapper.classic;

import org.junit.jupiter.api.BeforeEach;

import es.ies.puerto.dto.AddressDTO;
import es.ies.puerto.model.entity.Address;

public class MappersHelp {
    private static final String PROVISLA = "San Borondon";
    private static final String CODIGO = "codigo";
    private static final long ID = 1L;
    private static final String PAIS = "Mi pais";
    private static final String DIRECCION = "Mi direccion";
    public MapperAddress mapperAddress;
    public Address addressEntity;
    public AddressDTO addressDTO;

    @BeforeEach
    public void beforeEach(){
        addressDTO = new AddressDTO();
        addressDTO.setAddress(DIRECCION);
        addressDTO.setCountry(PAIS);
        addressDTO.setId(ID);
        addressDTO.setZipCode(CODIGO);
        addressDTO.setIsla(PROVISLA);

        addressEntity = new Address();
        addressEntity.setAddress(DIRECCION);
        addressEntity.setCountry(PAIS);
        addressEntity.setId(ID);
        addressEntity.setZipCode(CODIGO);
        addressEntity.setProvincia(PROVISLA);
    }
}
