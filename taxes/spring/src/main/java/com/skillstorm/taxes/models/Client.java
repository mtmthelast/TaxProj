package com.skillstorm.taxes.models;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "client")


//This is the biggest section of our code
//The other sections hold employee or processing information
//The other three tables directly link to THIS table
public class Client {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name ="social_security_number")
	private int social_security_number;
	
	@Column(name="first_name")
	private String first_name;
	
	@Column(name ="last_name")
	private String last_name;
	
	@Column(name="employee_id1")
	private int employee_id1;

	@Column(name ="date_of_birth")
	private Date date_of_birth;
	
	@Column(name="street_address")
	private String street_address;
	
	@Column(name ="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name ="adjusted_gross_income")
	private int adjusted_gross_income;
	
	@Column(name="withheld income tax")
	private int withheld_income_tax;

	@Column(name ="tax_return")
	private int tax_return;
	
	@Column(name="employment_sect")
	private int employment_sect;
	
	@Column(name="filing_stat")
	private int filing_stat;

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSocial_security_number() {
		return social_security_number;
	}

	public void setSocial_security_number(int social_security_number) {
		this.social_security_number = social_security_number;
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

	public int getEmployee_id1() {
		return employee_id1;
	}

	public void setEmployee_id1(int employee_id1) {
		this.employee_id1 = employee_id1;
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getStreet_address() {
		return street_address;
	}

	public void setStreet_address(String street_address) {
		this.street_address = street_address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getAdjusted_gross_income() {
		return adjusted_gross_income;
	}

	public void setAdjusted_gross_income(int adjusted_gross_income) {
		this.adjusted_gross_income = adjusted_gross_income;
	}

	public int getWithheld_income_tax() {
		return withheld_income_tax;
	}

	public void setWithheld_income_tax(int withheld_income_tax) {
		this.withheld_income_tax = withheld_income_tax;
	}

	public int getTax_return() {
		return tax_return;
	}

	public void setTax_return(int tax_return) {
		this.tax_return = tax_return;
	}

	public int getEmployment_sect() {
		return employment_sect;
	}

	public void setEmployment_sect(int employment_sect) {
		this.employment_sect = employment_sect;
	}

	public int getFiling_stat() {
		return filing_stat;
	}

	public void setFiling_stat(int filing_stat) {
		this.filing_stat = filing_stat;
	}

	public Client(int social_security_number, String first_name, String last_name, int employee_id1, Date date_of_birth,
			String street_address, String city, String state, int adjusted_gross_income, int withheld_income_tax,
			int tax_return, int employment_sect, int filing_stat) {
		super();
		this.social_security_number = social_security_number;
		this.first_name = first_name;
		this.last_name = last_name;
		this.employee_id1 = employee_id1;
		this.date_of_birth = date_of_birth;
		this.street_address = street_address;
		this.city = city;
		this.state = state;
		this.adjusted_gross_income = adjusted_gross_income;
		this.withheld_income_tax = withheld_income_tax;
		this.tax_return = tax_return;
		this.employment_sect = employment_sect;
		this.filing_stat = filing_stat;
	}

	@Override
	public String toString() {
		return "Client [social_security_number=" + social_security_number + ", first_name=" + first_name
				+ ", last_name=" + last_name + ", employee_id1=" + employee_id1 + ", date_of_birth=" + date_of_birth
				+ ", street_address=" + street_address + ", city=" + city + ", state=" + state
				+ ", adjusted_gross_income=" + adjusted_gross_income + ", withheld_income_tax=" + withheld_income_tax
				+ ", tax_return=" + tax_return + ", employment_sect=" + employment_sect + ", filing_stat=" + filing_stat
				+ "]";
	}

	
	
}
