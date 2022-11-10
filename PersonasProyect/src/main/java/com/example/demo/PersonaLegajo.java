package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class PersonaLegajo {
	Persona persona = new Persona();
	Legajo legajo = new Legajo();
	String fechaCreacion;
}
