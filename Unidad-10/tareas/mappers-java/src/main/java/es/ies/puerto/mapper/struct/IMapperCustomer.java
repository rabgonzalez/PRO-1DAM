package es.ies.puerto.mapper.struct;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import es.ies.puerto.dto.CustomerDTO;
import es.ies.puerto.model.entity.Customer;

@Mapper(uses = IMapperAddress.class)
public interface IMapperCustomer {
    IMapperCustomer INSTANCE = Mappers.getMapper(IMapperCustomer.class);

    public CustomerDTO customerEntityToCustomerDto(Customer customer);
    public Customer customerDtoToCustomerEntity(CustomerDTO customerDTO);
}
