package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Toconas3872Tp5Application;
import ar.edu.unju.fi.model.Noticia;

@Repository("noticiaImp")
public class NoticiaImp implements INoticia {

	@Autowired
	private Noticia noticia;

	//El nombre Toconas3872Tp5Application.class se obtiene de la aplicacion del paquete fi
	public static Logger LOG = LoggerFactory.getLogger(Toconas3872Tp5Application.class);

	@Override
	public void guardar() {
		// accion ejecutada para guardar un objeto usuario en la BD
		LOG.info("-------------------------------------------------------------");
		LOG.info("La noticia fue guardada | " + noticia.getTitulo() + " | fecha : "+ noticia.getFecha());
		LOG.info("Su resumen indica | " + noticia.getResumen());
		LOG.info("-------------------------------------------------------------");

	}

	@Override
	public Noticia mostrar() {
		//System.out.println("Se muestran los datos de la noticia");
		return noticia;
	}

	@Override
	public void eliminar() {
		// Se elimina el objeto noticia de la BD
		LOG.info("Se elimino la noticia de la BD");
	}

	@Override
	public Noticia modificar() {
		// Se modifican los datos del usuario en la BD
		LOG.info("Se han modificaco los datos de la noticia");
		LOG.info("Sus nuevos datos se mostraran a continuacion");
		return noticia;
	}

}
