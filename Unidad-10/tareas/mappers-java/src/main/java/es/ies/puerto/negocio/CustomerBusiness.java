package es.ies.puerto.negocio;

import es.ies.puerto.dto.CustomerDTO;
import es.ies.puerto.model.entity.Address;
import es.ies.puerto.model.entity.Customer;
import es.ies.puerto.mapper.classic.MapperAddress;
import es.ies.puerto.mapper.classic.MapperCustomer;

public class CustomerBusiness {
    public CustomerDTO obtenerCustomer(CustomerDTO customerDTO){
        if(customerDTO == null){
            return null;
        }
        Customer customer = MapperCustomer.customerDtoToCustomerEntity(customerDTO);
        Address address = MapperAddress.customerDtoToAdress(customerDTO);
        
        return MapperCustomer.customerEntityToCustomerDto(customer, address);
    }

    public CustomerDTO obtenerCustomer(Long id){
        if(id == null){
            return null;
        }
        CustomerDTO customerDTO = new CustomerDTO(id);
        return obtenerCustomer(customerDTO);
    }
}
