package ar.edu.unju.fi.service;
/**
 * Interfaz donde se declaran los métodos necesarios que serán implementados por la lógica de negocio del proyecto
 * @author Toconas Juan Manuel
 */
import ar.edu.unju.fi.model.Cuota;

public interface ICuotaService {
	/**
	 * Metodo abstranco que permite guardar un obejto en la base de datos
	 */
	public void guardar();
	/**
	 * Metodo abstranco que permite mostrar un obejto en la base de datos
	 */
	public Cuota mostrar();
	/**
	 * Metodo abstranco que permite eliminar un obejto en la base de datos
	 */
	public void eliminar();
	/**
	 * Metodo abstranco que modificar guardar un obejto en la base de datos
	 */
	public Cuota modificar();
}
