package ar.edu.unju.fi.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * La clase Equipo se identifica como Bean al usar @component de forma que sera
 * administrata por el contenedor de Spring
 */
@Component
public class Equipo {
	
	// ATRIBUTOS
	
	/**
	 * Variable que representa el nombre del equipo
	 */
	private String nombre;
	
	/**
	 * Variables que representa el estadio pertinente al equipo
	 */
	@Autowired
	private Estadio estadio;

	//CONSTRUCTORES

	/**
	 * CONSTRUCTOR PARAMETRIZADO
	 */
	public Equipo(String nombre, Estadio estadio) {
		this.nombre = nombre;
		this.estadio = estadio;
	}

	/**
	 *  CONSTRUCTOR SIN PARAMETROS
	 */
	public Equipo() {
	}

	//METODOS ACCESORES

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Estadio getEstadio() {
		return estadio;
	}

	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}
}
