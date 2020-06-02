package ar.edu.unju.fi.repository;
/**
 * Clase que implementa todo lo definido en la interfaz IUsuario
 * Aqui se definidira el codigo de cada metodo de la interfaz
 * La anotacion repository es derivada de component, que se usa en la capa
 * de acceso en la base de datos para permitir a Spring crear las instancias
 * de los objetos de esta clase
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Toconas3872Tp5Application;
import ar.edu.unju.fi.model.Usuario;

@Repository("usuarioImp")
public class UsuarioImp implements IUsuario {
	/**
	 * Se inyecta el objeto usuario para minimizar el acoplamiento
	 * De esta manera el main no necesitara la instancia de esta sino que solo se buscara cuando sea necesaria
	 */
	@Autowired
	private Usuario usuario;
	//El nombre Toconas3872Tp5Application.class se obtiene de la aplicacion del paquete fi
	public static Logger LOG = LoggerFactory.getLogger(Toconas3872Tp5Application.class);
	
	@Override
	public void guardar() {
		// accion ejecutada para guardar un objeto usuario en la BD
		LOG.info("-------------------------------------------------------------");
		LOG.info("El usuario guardado fue " + usuario.getApellido() + ",  " + usuario.getNombre());
		LOG.info("ID: " + usuario.getId()+ " DNI:  " + usuario.getDni());
		LOG.info("Fecha de nacimiento: " + usuario.getFechaNacimiento() + " Direccion:  " + usuario.getDireccion());
		LOG.info("Fecha de alta: " + usuario.getFechaAlta()+ " Tipo de socio:  " + usuario.getTipo() + " Contraseña: " + usuario.getPassword());
		LOG.info("-------------------------------------------------------------");

	}

	@Override
	public Usuario mostrar() {
		// se recuperan los datos del usuario
		return usuario;
	}

	@Override
	public void eliminar() {
		// Se elimina el objeto usuario de la BD
		LOG.info("Se elimino el usuario de la BD");
	}

	@Override
	public Usuario modificar() {
		// Se modifican los datos del usuario en la BD
		LOG.info("Se han modificaco los datos del usuario");
		LOG.info("Sus nuevos datos se mostraran a continuacion");
		return usuario;
	}

}
