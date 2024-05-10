package es.ies.puerto.mapper.struct;

import org.mapstruct.Context;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import es.ies.puerto.dto.CustomerDTO;
import es.ies.puerto.model.entity.Address;
import es.ies.puerto.model.entity.Customer;

@Mapper(uses = IMapperAddress.class)
public interface IMapperCustomer {
    IMapperCustomer INSTANCE = Mappers.getMapper(IMapperCustomer.class);

    @Mapping(source = "address", target = "address")
    @Mapping(source = "customer.id", target = "id")
    @Mapping(source = "customer", target = "fullName", qualifiedByName = "transformarNombre")
    public CustomerDTO customerEntityToCustomerDto(Address address, @Context Customer customer);
    public Customer customerDtoToCustomerEntity(CustomerDTO customerDTO);

    @Named("transformarNombre")
    public static String crearNombre(Customer customer){
        return customer.getFirstname()+" "+customer.getLastname();
    }
}
