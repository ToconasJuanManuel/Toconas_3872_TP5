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

import ar.edu.unju.fi.model.Resultado;
import ar.edu.unju.fi.repository.IResultado;

@Repository
public class ResultadoServiceImp implements IResultadoService {
	/**
	 * Se inyecta la interfaz iresultado para minimizar el acoplamiento que sera implementada
	 */
	@Autowired
	private IResultado iresultado;
	/**
	 * Metodo sobrescrito para implementar metodo abstracto
	 */
	@Override
	public void guardar() {
		iresultado.guardar();

	}
	/**
	 * Metodo sobrescrito para implementar metodo abstracto
	 */
	@Override
	public Resultado mostrar() {
		Resultado resultado = iresultado.mostrar();
		return resultado;
	}
	/**
	 * Metodo sobrescrito para implementar metodo abstracto
	 */
	@Override
	public void eliminar() {
		iresultado.eliminar();
	}
	
	/**
	 * Metodo sobrescrito para implementar metodo abstracto
	 */
	@Override
	public Resultado modificar() {
		Resultado resultado = iresultado.modificar();
		return resultado;
	}

}
