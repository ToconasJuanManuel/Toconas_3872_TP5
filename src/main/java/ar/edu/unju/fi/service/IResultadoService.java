package ar.edu.unju.fi.service;
/**
 * Interfaz donde se declaran los métodos necesarios que serán implementados por la lógica de negocio del proyecto
 * @author Toconas Juan Manuel
 */
import ar.edu.unju.fi.model.Resultado;

public interface IResultadoService {
	/**
	 * Metodo abstracto que permite guardar un obejto en la base de datos
	 */
	public void guardar();
	/**
	 * Metodo abstracto que permite mostrar un obejto en la base de datos
	 */
	public Resultado mostrar();
	/**
	 * Metodo abstracto que permite eliminar un obejto en la base de datos
	 */
	public void eliminar();
	/**
	 * Metodo abstracto que permite modificar un obejto en la base de datos
	 */
	public Resultado modificar();
}
