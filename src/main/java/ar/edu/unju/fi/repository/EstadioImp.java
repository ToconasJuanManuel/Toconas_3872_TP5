package ar.edu.unju.fi.repository;
/**
 * Clase que implementa todo lo definido en la interfaz IEstadio
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
import ar.edu.unju.fi.model.Estadio;

@Repository("estadioImp")
public class EstadioImp implements IEstadio {

	/**
	 * Se inyecta el objeto estadio para minimizar el acoplamiento
	 * De esta manera el main no necesitara la instancia de esta sino que solo se buscara cuando sea necesaria
	 */
	@Autowired
	private Estadio estadio;

	//El nombre Toconas3872Tp5Application.class se obtiene de la aplicacion del paquete fi
	public static Logger LOG = LoggerFactory.getLogger(Toconas3872Tp5Application.class);


	@Override
	public void guardar() {
		// accion ejecutada para guardar un objeto Estadio en la BD
		LOG.info("-------------------------------------------------------------");
		LOG.info("El Estadio guardado fue " + estadio.getNombre() + " fundado en " + estadio.getFechaFundacion());
		LOG.info("Se ubica en la ciudad " + estadio.getCiudad() + " especificamente en " + estadio.getDireccion() + " y tiene una capacidad de " + estadio.getCapacidad() + " espectadores");
		LOG.info("-------------------------------------------------------------");

	}

	@Override
	public Estadio mostrar() {
		// se recuperan los datos del Estadio
		//LOG.info("A continuacion se muestran los datos del usuario");
		return estadio;
	}

	@Override
	public void eliminar() {
		// Se elimina el objeto Estadio de la BD
		LOG.info("Se elimino el estadio de la BD");
	}

	@Override
	public Estadio modificar() {
		// Se modifican los datos del usuario en la BD
		LOG.info("Se han modificaco los datos del estadio");
		LOG.info("Sus nuevos datos se mostraran a continuacion");
		return estadio;
	}

}
