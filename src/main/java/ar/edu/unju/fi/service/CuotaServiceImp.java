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

import ar.edu.unju.fi.model.Cuota;
import ar.edu.unju.fi.repository.ICuota;

@Repository
public class CuotaServiceImp implements ICuotaService {
	/**
	 * Se inyecta la interfaz icuota para minimizar el acoplamiento que sera implementada
	 */
	@Autowired
	private ICuota icuota;
	/**
	 * Metodo sobrescrito para implementar metodo abstracto
	 */
	@Override
	public void guardar() {
		icuota.guardar();
	}
	/**
	 * Metodo sobrescrito para implementar metodo abstracto
	 */
	@Override
	public Cuota mostrar() {
		Cuota cuota = icuota.mostrar();
		return cuota;
	}
	/**
	 * Metodo sobrescrito para implementar metodo abstracto
	 */
	@Override
	public void eliminar() {
		icuota.eliminar();
	}
	/**
	 * Metodo sobrescrito para implementar metodo abstracto
	 */
	@Override
	public Cuota modificar() {
		Cuota cuota = icuota.modificar();
		return cuota;
	}
}
