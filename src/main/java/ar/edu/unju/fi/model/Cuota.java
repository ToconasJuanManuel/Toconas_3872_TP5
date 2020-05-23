package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Cuota {
	//ATRIBUTOS
	/**
	 * Variable de tipo long que representa el numero identificaroeio de la cuota
	 */
	private long id ;
	/**
	 * Variable de tipo fecha que representa la fecha de pago de la cuota
	 */
	private LocalDate fechaPago ;
	/**
	 * Variable de tipo cadena que representa el periodo 
	 */
	private String periodo ;
	/**
	 * Variable de tipo double que representa el monto de la cuota
	 */
	private double monto ;
	/**
	 * Variable de tipo cadena que representa el estado de la cuota
	 */
	private String estado ;
	/**
	 * Variable de tipo Usuario que representa los datos del dueño de la cuenta
	 */
	@Autowired
	private Usuario usuario ;

	//CONSTRUCTORES
	/**
	 * CONSTRUCTOR PARAMETRIZADO
	 */
	public Cuota(long id, LocalDate fechaPago, String periodo, double monto, String estado, Usuario usuario) {
		this.id = id;
		this.fechaPago = fechaPago;
		this.periodo = periodo;
		this.monto = monto;
		this.estado = estado;
		this.usuario = usuario;
	}
	/**
	 * CONSTRUCTOR SIN PARAMETROS
	 */
	public Cuota() {
	}

	//METODOS ACCESORES
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public LocalDate getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(LocalDate fechaPago) {
		this.fechaPago = fechaPago;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}
