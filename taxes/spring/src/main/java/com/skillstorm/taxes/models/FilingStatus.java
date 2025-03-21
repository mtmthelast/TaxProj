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
@Table(name = "filing_status")

public class FilingStatus {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	
	@Column(name ="id")
	private int id;
	
	@Column(name="filing_status")
	private String employment_sectorfiling_status;
	
	@OneToOne(mappedBy = "filing_status", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("filing_status")
	private Client client;

	public FilingStatus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployment_sectorfiling_status() {
		return employment_sectorfiling_status;
	}

	public void setEmployment_sectorfiling_status(String employment_sectorfiling_status) {
		this.employment_sectorfiling_status = employment_sectorfiling_status;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public FilingStatus(int id, String employment_sectorfiling_status, Client client) {
		super();
		this.id = id;
		this.employment_sectorfiling_status = employment_sectorfiling_status;
		this.client = client;
	}

	@Override
	public String toString() {
		return "FilingStatus [id=" + id + ", employment_sectorfiling_status=" + employment_sectorfiling_status
				+ ", client=" + client + "]";
	}

	
}
