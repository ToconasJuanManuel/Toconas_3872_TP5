package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

/**
 * La clase Estadio se identifica como Bean al usar @component de forma que sera
 * administrata por el contenedor de Spring
 */
@Component
public class Estadio {
	// ATRIBUTOS
	/**
	 * Variable de tipo cadena que representa el nombre del estadio
	 */
	private String nombre;
	/**
	 * Variable de tipo fecha LocalDate que representa la fecha de fundacion del estadio
	 */
	private LocalDate fechaFundacion;
	/**
	 * Variable de tipo cadena que representa la ciudad del estadio
	 */
	private String ciudad;
	/**
	 * Variable de tipo entero que representa la capacidad maxima del estadio
	 */
	private int capacidad;
	/**
	 * Variable de tipo cadena que representa la ubicacion del estadio
	 */
	private String direccion;

	//CONSTRUCTORES

	/**
	 * CONSTRUCTOR PARAMETRIZADO
	 */
	public Estadio(String nombre, LocalDate fechaFundacion, String ciudad, int capacidad, String direccion) {
		this.nombre = nombre;
		this.fechaFundacion = fechaFundacion;
		this.ciudad = ciudad;
		this.capacidad = capacidad;
		this.direccion = direccion;
	}

	/**
	 *  CONSTRUCTOR SIN PARAMETROS
	 */
	public Estadio() {
	}

	
	//METODOS ACCESORES
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaFundacion() {
		return fechaFundacion;
	}

	public void setFechaFundacion(LocalDate fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
