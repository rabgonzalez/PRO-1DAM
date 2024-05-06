package es.ies.puerto.dto;

import java.io.Serializable;

public class CustomerDTO implements Serializable{
    private Long id;
	private String fullName;
	private String country;
	private String address;
	private String zipCode;

    public CustomerDTO(){}

    public CustomerDTO(Long id){
        this.id = id;
    }

    public CustomerDTO(Long id, String fullName, String country, String address, String zipCode) {
        this.id = id;
        this.fullName = fullName;
        this.country = country;
        this.address = address;
        this.zipCode = zipCode;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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
        if (!(o instanceof CustomerDTO)) {
            return false;
        }
        CustomerDTO customerDTO = (CustomerDTO) o;
        return Objects.equals(id, customerDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fullName, country, address, zipCode);
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", fullName='" + getFullName() + "'" +
            ", country='" + getCountry() + "'" +
            ", address='" + getAddress() + "'" +
            ", zipCode='" + getZipCode() + "'" +
            "}";
    }
}
