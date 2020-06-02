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

import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.repository.IUsuario;

@Repository
public class UsuarioServiceImp implements IUsuarioService {
	/**
	 * Se inyecta la interfaz iusuario para minimizar el acoplamiento que sera implementada
	 */
	@Autowired
	private IUsuario iusuario;
	/**
	 * Metodo sobrescrito para implementar metodo abstracto
	 */
	@Override
	public void guardar() {
		iusuario.guardar();
	}
	/**
	 * Metodo sobrescrito para implementar metodo abstracto
	 */
	@Override
	public Usuario mostrar() {
		Usuario usuario = iusuario.mostrar();
		return usuario;
	}
	/**
	 * Metodo sobrescrito para implementar metodo abstracto
	 */
	@Override
	public void eliminar() {
		iusuario.eliminar();
	}
	/**
	 * Metodo sobrescrito para implementar metodo abstracto
	 */
	@Override
	public Usuario modificar() {
		Usuario usuario = iusuario.modificar();
		return usuario;
	}

}
