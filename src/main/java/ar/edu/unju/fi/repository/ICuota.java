package ar.edu.unju.fi.repository;
/**
 * Interfaz (clase que no puede instanciarse) y solo posee metodos abstractos(sin cuertpo)
 * Busca definir los metodos abstractos de la clase Cuota
 */

import ar.edu.unju.fi.model.Cuota;

public interface ICuota {
	//Metodo abstracto que permite guardar un obejto en BD
	public void guardar();
	//Metodo abstracto que permite mostrar un objeto en la BD
	public Cuota mostrar();
	//Metodo abstracto que permite eliminar un objeto en la BD
	public void eliminar();
	//Metodo abstracto que permite modificar un objeto en la BD
	public Cuota modificar();
}
