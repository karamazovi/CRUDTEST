package com.jmp.users.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="espacios")
public class Espacios {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column
	private String nombreespacios;
	
	@Column
	private int capacidad;
	
	@Column
	private String horario;
	
	@Column
	private String Fecha;

}
