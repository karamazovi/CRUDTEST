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
@Table(name="reservas")
public class Reservas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="id")
	private Integer id;
	
	@OneToOne
	@JoinColumn(name="espacios_id",
	referencedColumnName = "id")
	private Espacios espacios;
	
	@OneToOne
	@JoinColumn(name="habitantes_id",
	referencedColumnName = "id")
	private Habitantes habitantes;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Espacios getEspacios() {
		return espacios;
	}

	public void setEspacios(Espacios espacios) {
		this.espacios = espacios;
	}

	public Habitantes getHabitantes() {
		return habitantes;
	}

	public void setHabitantes(Habitantes habitantes) {
		this.habitantes = habitantes;
	}
	
	
	
	
	

}
