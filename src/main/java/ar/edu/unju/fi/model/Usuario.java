package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

/**
 * La clase Usuario se identifica como Bean al usar @component de forma que sera
 * administrata por el contenedor de Spring
 */
@Component
public class Usuario {
	//ATRIBUTOS
	/**
	 * Variable de tipo long que representa el numero identificaroeio del usuario
	 */
	private long id;
	/**
	 * Variable de tipo cadena que representa el nombre del usuario 
	 */
	private String nombre;
	/**
	 * Variable de tipo cadena que representa el apellido del usuario 
	 */
	private String apellido;
	/**
	 * Variable de tipo fecha LocalDate que representa la fecha de nacimiento del usuario 
	 */
	private LocalDate fechaNacimiento;
	/**
	 * Variable de tipo Cadena que representa la direccion del usuario 
	 */
	private String direccion ;
	/**
	 * Variable de tipo long que representa el dni del usuario
	 */
	private long dni;
	/**
	 * Variable de tipo LocalDate que representa la fecha en la que se dio de alta al usuario
	 */
	private LocalDate fechaAlta;
	/**
	 * Variable de tipo cadena que representa el tipos de usuario que puede ser SOCIO, ADMIN O CONSULTOR
	 */
	private String tipo;
	/**
	 * Variable de tipo cadena que representa la constraseña del usuario
	 */
	private String password;

	//CONSTRUCTORES
	/**
	 * CONSTRUCTOR PARAMETRIZADO
	 */
	public Usuario(long id, String nombre, String apellido, LocalDate fechaNacimiento, String direccion, long dni,
			LocalDate fechaAlta, String tipo, String password) {

		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaNacimiento = fechaNacimiento;
		this.direccion = direccion;
		this.dni = dni;
		this.fechaAlta = fechaAlta;
		this.tipo = tipo;
		this.password = password;
	}

	/**
	 * CONSTRUCTOR SIN PARAMETROS
	 */
	public Usuario (){
	}

	//METODOS ACCESORES

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		this.dni = dni;
	}

	public LocalDate getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(LocalDate fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}




}
