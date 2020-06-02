package ar.edu.unju.fi.service;
/**
 * En el paquete servicios se crean interfaces y clases implementadoras 
 * que permiten desarrollar la lógica de negocio del proyecto 
 * y a su vez conectarse con los datos que se encuentran 
 * almacenados en algún repositorio de datos.
 * 
 * En este caso al no implementarse una base de datos ejecutara los metodos 
 * de del paquete repository que muestran datos a travez del LOG en ICuota
 *  * @author Toconas Juan Manuel
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.model.Noticia;
import ar.edu.unju.fi.repository.INoticia;

@Repository
public class NoticiaServiceImp implements INoticiaService {
	/**
	 * Se inyecta la interfaz inoticia para minimizar el acoplamiento que sera implementada
	 */
	@Autowired
	private INoticia inoticia;
	
	/**
	 * Metodo sobrescrito para implementar metodo abstracto
	 */
	@Override
	public void guardar() {
		inoticia.guardar();
	}
	
	/**
	 * Metodo sobrescrito para implementar metodo abstracto
	 */
	@Override
	public Noticia mostrar() {
		Noticia noticia = inoticia.mostrar();
		return noticia;
	}
	
	/**
	 * Metodo sobrescrito para implementar metodo abstracto
	 */
	@Override
	public void eliminar() {
		inoticia.eliminar();
	}
	
	/**
	 * Metodo sobrescrito para implementar metodo abstracto
	 */
	@Override
	public Noticia modificar() {
		Noticia noticia = inoticia.modificar();
		return noticia;
	}

}
