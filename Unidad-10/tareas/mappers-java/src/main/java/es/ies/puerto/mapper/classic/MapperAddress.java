package main.java.es.ies.puerto.mapper.classic;

import es.ies.puerto.dto.CustomerDTO;
import es.ies.puerto.model.entity.Address;

public class MapperAddress {
    public static Adress customerDtoToAdress(CustomerDTO customerDTO){
        Adress address = null;

        if(customerDTO == null){
            return address;
        }
        address = new Address();
        address.setAddress(customerDTO.getAddress());
        address.setCountry(customerDTO.getCountry());
        address.setZipCode(customerDTO.getZipCode());
        
        return address;
    }

    public static CustomerDTO adressToCustomerDto(Adress address){
        CustomerDTO customerDTO = null;

        if(address == null){
            return customerDTO;
        }
        customerDTO = new CustomerDTO();
        customerDTO.setAddress(address.getAddress());
        customerDTO.setCountry(address.getCountry());
        customerDTO.setZipCode(address.getZipCode());
        
        return customerDTO;
    }
}
