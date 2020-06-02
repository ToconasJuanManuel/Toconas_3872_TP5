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

import ar.edu.unju.fi.model.Estadio;
import ar.edu.unju.fi.repository.IEstadio;

@Repository
public class EstadioServiceImp implements IEstadioService {
	/**
	 * Se inyecta la interfaz iestadio para minimizar el acoplamiento que sera implementada
	 */
	@Autowired
	private IEstadio iestadio;
	
	/**
	 * Metodo sobrescrito para implementar metodo abstracto
	 */
	@Override
	public void guardar() {
		iestadio.guardar();
	}
	
	/**
	 * Metodo sobrescrito para implementar metodo abstracto
	 */
	@Override
	public Estadio mostrar() {
		Estadio estadio = iestadio.mostrar();
		return estadio;
	}
	
	/**
	 * Metodo sobrescrito para implementar metodo abstracto
	 */
	@Override
	public void eliminar() {
		iestadio.eliminar();
	}
	/**
	 * Metodo sobrescrito para implementar metodo abstracto
	 */
	@Override
	public Estadio modificar() {
		Estadio estadio = iestadio.modificar();
		return estadio;
	}

}
