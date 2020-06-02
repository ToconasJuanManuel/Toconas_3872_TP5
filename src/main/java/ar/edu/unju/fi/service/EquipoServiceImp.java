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
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.model.Equipo;
import ar.edu.unju.fi.repository.IEquipo;

@Repository
@Qualifier("equipo")
public class EquipoServiceImp implements IEquipoService {
	/**
	 * Se inyecta la interfaz iquipo para minimizar el acoplamiento que sera implementada
	 */
	@Autowired
	private IEquipo iequipo;
	
	/**
	 * Metodo sobrescrito para implementar metodo abstracto
	 */
	@Override
	public void guardar() {
		iequipo.guardar();
	}
	/**
	 * Metodo sobrescrito para implementar metodo abstracto
	 */
	@Override
	public Equipo mostrar() {
		Equipo equipo = iequipo.mostrar();
		return equipo;
	}
	/**
	 * Metodo sobrescrito para implementar metodo abstracto
	 */
	@Override
	public void eliminar() {
		iequipo.eliminar();
	}
	/**
	 * Metodo sobrescrito para implementar metodo abstracto
	 */
	@Override
	public Equipo modificar() {
		Equipo equipo = iequipo.modificar();
		return equipo;
	}

}
