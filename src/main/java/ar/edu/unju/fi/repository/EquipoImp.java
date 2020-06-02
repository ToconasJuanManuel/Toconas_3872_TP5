package ar.edu.unju.fi.repository;
/**
 * Clase que implementa todo lo definido en la interfaz IEquipo
 * Aqui se definidira el codigo de cada metodo de la interfaz
 * La anotacion repository es derivada de component, que se usa en la capa
 * de acceso en la base de datos para permitir a Spring crear las instancias
 * de los objetos de esta clase
 */
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Toconas3872Tp5Application;
import ar.edu.unju.fi.model.Equipo;

@Repository("equipoImp")
@Qualifier("equipo")
public class EquipoImp implements IEquipo {
	/**
	 * Se inyecta el objeto equipo para minimizar el acoplamiento
	 * De esta manera el main no necesitara la instancia de esta sino que solo se buscara cuando sea necesaria
	 */
	@Autowired
	private Equipo equipo;

	//El nombre Toconas3872Tp5Application.class se obtiene de la aplicacion del paquete fi
	public static Logger LOG = LoggerFactory.getLogger(Toconas3872Tp5Application.class);

	@Override
	public void guardar() {
		// accion ejecutada para guardar un objeto usuario en la BD
		LOG.info("-------------------------------------------------------------");
		LOG.info("El equipo guardado fue " + equipo.getNombre());
		LOG.info("Su estadio es " + equipo.getEstadio().getNombre());
		LOG.info("-------------------------------------------------------------");
	}

	@Override
	public Equipo mostrar() {
		// se recuperan los datos del usuario
		//LOG.info("A continuacion se muestran los datos del equipo");
		return equipo;
	}

	@Override
	public void eliminar() {
		// Se elimina el objeto equipo de la BD
		LOG.info("Se elimino el equipo de la BD");
	}

	@Override
	public Equipo modificar() {
		// Se modifican los datos del equipo en la BD
		LOG.info("Se han modificaco los datos del equipo");
		LOG.info("Sus nuevos datos se mostraran a continuacion");
		return equipo;
	}

}
