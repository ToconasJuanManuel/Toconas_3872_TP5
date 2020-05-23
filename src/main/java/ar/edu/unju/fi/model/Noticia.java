package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class Noticia {
	//ATRIBUTOS
	/**
	 * Variable de tipo fecha LocalDate que representa la fecha de la noticia
	 */
	private LocalDate fecha;
	/**
	 * Variable de tipo cadena que representa el titulo de la noticia
	 */
	private String titulo;
	/**
	 * Variable de tipo cadena que representa un resumen de la noticia
	 */
	private String resumen;

	//CONSTRUCTORES
	/**
	 * CONSTRUCTOR PARAMETRIZADO
	 */
	public Noticia(LocalDate fecha, String titulo, String resumen) {
		this.fecha = fecha;
		this.titulo = titulo;
		this.resumen = resumen;
	}
	
	/**
	 * CONSTRUCTOR SIN PARAMETROS
	 */
	public Noticia() {
	}
	
	
	//METODOS ACCESORES

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}


}
