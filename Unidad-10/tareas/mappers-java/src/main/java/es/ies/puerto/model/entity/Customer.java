package es.ies.puerto.model.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="customers")
public class Customer {
    @Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	@Column(name="firstname")
	private String firstname;
	@Column(name="lastname")
	private String lastname;
	@Column(name="password")
	private String password;

	public Customer(){}

	public Customer(Long id){
		this.id = id;
	}

	public Customer(Long id, String firstname, String lastname, String password) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
