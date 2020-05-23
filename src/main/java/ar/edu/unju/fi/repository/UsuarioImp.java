package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Toconas3872Tp5Application;
import ar.edu.unju.fi.model.Usuario;

@Repository("usuarioImp")
public class UsuarioImp implements IUsuario {

	@Autowired
	private Usuario usuario;
	
	//El nombre Toconas3872Tp5Application.class se obtiene de la aplicacion del paquete fi
	public static Logger LOG = LoggerFactory.getLogger(Toconas3872Tp5Application.class);
	
	@Override
	public void guardar() {
		// accion ejecutada para guardar un objeto usuario en la BD
		LOG.info("El usuario fue guardado fue " + usuario.getApellido() + ",  " + usuario.getNombre());
	}

	@Override
	public Usuario mostrar() {
		// se recuperan los datos del usuario
		LOG.info("A continuacion se muestran los datos del usuario");
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
