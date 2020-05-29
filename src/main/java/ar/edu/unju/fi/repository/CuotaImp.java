package ar.edu.unju.fi.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.fi.Toconas3872Tp5Application;
import ar.edu.unju.fi.model.Cuota;

@Repository("cuotaImp")
public class CuotaImp implements ICuota {

	@Autowired
	private Cuota cuota;

	//El nombre Toconas3872Tp5Application.class se obtiene de la aplicacion del paquete fi
	public static Logger LOG = LoggerFactory.getLogger(Toconas3872Tp5Application.class);

	@Override
	public void guardar() {
		// accion ejecutada para guardar un objeto Cuota en la BD
		LOG.info("-------------------------------------------------------------");
		LOG.info("Se guardo la cuota $" + cuota.getMonto() + " del usuario " + cuota.getUsuario().getApellido());
		LOG.info("Estado :" + cuota.getEstado() + " Perido :" + cuota.getPeriodo());
		LOG.info("ID :" + cuota.getId() + " Con fecha de pago en :" + cuota.getFechaPago());
		LOG.info("-------------------------------------------------------------");

	}

	@Override
	public Cuota mostrar() {
		// se recuperan los datos de la cuota
		//LOG.info("A continuacion se muestran los datos de la cuota");
		return cuota;
	}

	@Override
	public void eliminar() {
		// Se elimina el objeto cuota de la BD
		LOG.info("Se elimino la cuota de la BD");
	}

	@Override
	public Cuota modificar() {
		// Se modifican los datos de la cuota en la BD
		LOG.info("Se han modificaco los datos de la cuota");
		LOG.info("Sus nuevos datos se mostraran a continuacion");
		return cuota;
	}

}
