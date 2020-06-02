package ar.edu.unju.fi.repository;
/**
 * Clase que implementa todo lo definido en la interfaz IResultado
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
import ar.edu.unju.fi.model.Resultado;

@Repository("resultadoImp")
public class ResultadoImp implements IResultado {

	/**
	 * Se inyecta el objeto resultado para minimizar el acoplamiento
	 * De esta manera el main no necesitara la instancia de esta sino que solo se buscara cuando sea necesaria
	 */
	@Autowired
	private Resultado resultado;

	public static Logger LOG = LoggerFactory.getLogger(Toconas3872Tp5Application.class);

	@Override
	public void guardar() {
		LOG.info("-------------------------------------------------------------");
		LOG.info("El resultado guardado de la fecha " + resultado.getFecha() + " fue |" + resultado.getEquipo1().getNombre() + "-" + resultado.getGolesEquipo1()+ " | " + resultado.getEquipo2().getNombre() + "-" + resultado.getGolesEquipo2());
		LOG.info("-------------------------------------------------------------");

	}

	@Override
	public Resultado mostrar() {
		//LOG.info("A continuacion se muestran los datos del resultado");
		return resultado;
	}

	@Override
	public void eliminar() {
		// Se elimina el objeto resultado de la BD
		LOG.info("Se elimino el resultado de la BD");
	}

	@Override
	public Resultado modificar() {
		// Se modifican los datos del usuario en la BD
		LOG.info("Se han modificaco los datos del resultado");
		LOG.info("Sus nuevos datos se mostraran a continuacion");
		return resultado;
	}

}
