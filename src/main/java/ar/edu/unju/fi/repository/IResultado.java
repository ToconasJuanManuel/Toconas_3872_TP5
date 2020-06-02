package ar.edu.unju.fi.repository;
/**
 * Interfaz (clase que no puede instanciarse) y solo posee metodos abstractos(sin cuertpo)
 * Busca definir los metodos abstractos de la clase Resultado
 */
import ar.edu.unju.fi.model.Resultado;

public interface IResultado {
	//Metodo abstracto que permite guardar un obejto en BD
	public void guardar();
	//Metodo abstracto que permite mostrar un obejto en BD
	public Resultado mostrar();
	//Metodo abstracto que permite eliminar un obejto en BD
	public void eliminar();
	//Metodo abstracto que permite modificar un obejto en BD
	public Resultado modificar();
}
