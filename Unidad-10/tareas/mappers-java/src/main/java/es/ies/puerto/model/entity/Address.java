package es.ies.puerto.model.entity;

import javax.persistence.*;

@Entity
@Table(name="address")
public class Address {
    @Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@ManyToMany()
	@JoinColumn(name="fk_customer")
	private Customer customer;
	@Column(name="country")
	private String country;
	@Column(name="address")
	private String address;
	@Column(name="zipcode")
	private String zipCode;

    public Address(){}

    public Address(Long id){
        this.id = id;
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
}
