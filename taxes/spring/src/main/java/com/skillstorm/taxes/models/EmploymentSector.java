package com.skillstorm.taxes.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "employment_sector")

public class EmploymentSector {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name ="id")
	private int id;
	
	@Column(name="employment_sector")
	private String employment_sector;
	
	@OneToOne(mappedBy = "employment_sector", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("employment_sector")
	private Client client;

	public EmploymentSector() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployment_sector() {
		return employment_sector;
	}

	public void setEmployment_sector(String employment_sector) {
		this.employment_sector = employment_sector;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public EmploymentSector(int id, String employment_sector, Client client) {
		super();
		this.id = id;
		this.employment_sector = employment_sector;
		this.client = client;
	}

	@Override
	public String toString() {
		return "EmploymentSector [id=" + id + ", employment_sector=" + employment_sector + ", client=" + client + "]";
	}
	

}