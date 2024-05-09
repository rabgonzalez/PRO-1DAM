package es.ies.puerto.dto;
import java.util.Objects;

import es.ies.puerto.model.entity.Customer;

public class AddressDTO {
	private Long id;
	private Customer customer;
	private String country;
	private String address;
	private String zipCode;
    private String isla;

    public AddressDTO() {
    }

    public AddressDTO(Long id){
        this.id = id;
    }

    public AddressDTO(Long id, Customer customer, String country, String address, String zipCode, String isla) {
        this.id = id;
        this.customer = customer;
        this.country = country;
        this.address = address;
        this.zipCode = zipCode;
        this.isla = isla;
    }

    public String getIsla() {
        return this.isla;
    }

    public void setIsla(String isla) {
        this.isla = isla;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof AddressDTO)) {
            return false;
        }
        AddressDTO addressDTO = (AddressDTO) o;
        return Objects.equals(id, addressDTO.id) && Objects.equals(customer, addressDTO.customer) && Objects.equals(country, addressDTO.country) && Objects.equals(address, addressDTO.address) && Objects.equals(zipCode, addressDTO.zipCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, customer, country, address, zipCode);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", customer='" + getCustomer() + "'" +
            ", country='" + getCountry() + "'" +
            ", address='" + getAddress() + "'" +
            ", zipCode='" + getZipCode() + "'" +
            "}";
    }    
}
