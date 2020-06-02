package ar.edu.unju.fi.repository;

/**
 * Interfaz (clase que no puede instanciarse) y solo posee metodos abstractos(sin cuertpo)
 * Busca definir los metodos abstractos de la clase Noticia
 */
import ar.edu.unju.fi.model.Noticia;

public interface INoticia {
	//Metodo abstracto que permite guardar un obejto en BD
	public void guardar();
	//Metodo abstracto que permite mostrar un obejto en BD
	public Noticia mostrar();
	//Metodo abstracto que permite eliminar un obejto en BD
	public void eliminar();
	//Metodo abstracto que permite modificar un obejto en BD
	public Noticia modificar();
}
