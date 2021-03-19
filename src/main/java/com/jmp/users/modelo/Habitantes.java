package com.jmp.users.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Habitantes")
public class Habitantes {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String nombreyapellido;
	
	
	@OneToOne
	@JoinColumn(name="apartment_id",
	referencedColumnName = "id")
	private Apartment apartment;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombreyapellido() {
		return nombreyapellido;
	}


	public void setNombreyapellido(String nombreyapellido) {
		this.nombreyapellido = nombreyapellido;
	}


	public Apartment getApartment() {
		return apartment;
	}


	public void setApartment(Apartment apartment) {
		this.apartment = apartment;
	}
	
	

}
