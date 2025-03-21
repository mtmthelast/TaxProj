package com.skillstorm.taxes.models;

//import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	@Column(name ="id")
	private int id;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name ="last_name")
	private String last_name;
	
	@Column(name="employee_id")
	private String employee_id;

	@Column(name ="Administrator")
	private boolean Administrator;
	
//	@OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
//	@JsonIgnoreProperties("employee")
//	private Client client;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(String employee_id) {
		this.employee_id = employee_id;
	}

	public boolean isAdministrator() {
		return Administrator;
	}

	public void setAdministrator(boolean administrator) {
		Administrator = administrator;
	}

//	public Client getClient() {
//		return client;
//	}
//
//	public void setClient(Client client) {
//		this.client = client;
//	}

	public Employee(int id, String first_name, String last_name, String employee_id, boolean administrator) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.employee_id = employee_id;
		Administrator = administrator;
		//this.client = client;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", employee_id="
				+ employee_id + ", Administrator=" + Administrator + "]";
	}

	
}
