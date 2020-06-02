package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * La clase Resultado se identifica como Bean al usar @component de forma que sera
 * administrata por el contenedor de Spring
 */
@Component
public class Resultado {
	//ATRIBUTOS
	/**
	 * Variable de tipo fecha LocalDate que representa la fecha del resultado del partido
	 */
	private LocalDate fecha;
	/**
	 * Variable de tipo Equipo que representa un equipo a jugar
	 */
	@Autowired
	private Equipo equipo1;
	/**
	 * Variable de tipo Equipo que representa el segundo equipo a jugar
	 */
	@Autowired
	private Equipo equipo2;
	/**
	 * Variable de tipo entero que representa los goles del primer equipo
	 */
	private int golesEquipo1;
	/**
	 * Variable de tipo entero que representa los goles del segundo equipo
	 */
	private int golesEquipo2;

	//CONSTRUCTORES
	/**
	 * CONSTRUCTOR PARAMETRIZADO
	 */
	public Resultado(LocalDate fecha, Equipo equipo1, Equipo equipo2, int golesEquipo1, int golesEquipo2) {
		this.fecha = fecha;
		this.equipo1 = equipo1;
		this.equipo2 = equipo2;
		this.golesEquipo1 = golesEquipo1;
		this.golesEquipo2 = golesEquipo2;
	}

	/**
	 * CONSTRUCTOR SIN PARAMETROS
	 */
	public Resultado() {
	}

	//METODOS ACCESORES
	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Equipo getEquipo1() {
		return equipo1;
	}

	public void setEquipo1(Equipo equipo1) {
		this.equipo1 = equipo1;
	}

	public Equipo getEquipo2() {
		return equipo2;
	}

	public void setEquipo2(Equipo equipo2) {
		this.equipo2 = equipo2;
	}

	public int getGolesEquipo1() {
		return golesEquipo1;
	}

	public void setGolesEquipo1(int golesEquipo1) {
		this.golesEquipo1 = golesEquipo1;
	}

	public int getGolesEquipo2() {
		return golesEquipo2;
	}

	public void setGolesEquipo2(int golesEquipo2) {
		this.golesEquipo2 = golesEquipo2;
	}
}
