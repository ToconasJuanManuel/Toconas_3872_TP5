package ar.edu.unju.fi;
/**
 * Clase principal que implementara los servicios y mostrara los resultados por Log
 * @author Toconas Juan Manuel
 */
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.fi.model.Cuota;
import ar.edu.unju.fi.model.Equipo;
import ar.edu.unju.fi.model.Estadio;
import ar.edu.unju.fi.model.Noticia;
import ar.edu.unju.fi.model.Resultado;
import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.service.ICuotaService;
import ar.edu.unju.fi.service.IEquipoService;
import ar.edu.unju.fi.service.IEstadioService;
import ar.edu.unju.fi.service.INoticiaService;
import ar.edu.unju.fi.service.IResultadoService;
import ar.edu.unju.fi.service.IUsuarioService;

/**
 * Se implementa la interface CommandLineRunner y 
 * se sobreescribimos su método public void run(String... args).
 */
@SpringBootApplication
public class Toconas3872Tp5Application implements CommandLineRunner {
	/**
	 * Se autoinyecta servicio
	 */
	@Autowired
	IUsuarioService usuarioService;
	/**
	 * Se autoinyecta objeto usuario
	 */
	@Autowired
	Usuario usuario;
	
	/**
	 * Se autoinyecta servicio
	 */
	@Autowired
	IResultadoService resultadoService;
	/**
	 * Se autoinyecta objeto resultado
	 */
	@Autowired
	Resultado resultado;

	/**
	 * Se autoinyecta servicio
	 */
	@Autowired
	INoticiaService noticiaService;
	/**
	 * Se autoinyecta objeto noticia
	 */
	@Autowired
	Noticia noticia;

	/**
	 * Se autoinyecta servicio
	 */
	@Autowired
	IEstadioService estadioService;
	/**
	 * Se autoinyecta objeto estadio
	 */
	@Autowired
	Estadio estadio;
	Estadio estadioDos = new Estadio();

	/**
	 * Se autoinyecta servicio
	 */
	@Autowired
	IEquipoService equipoService;
	//Se instacia ambas variables de tipo equipo mediante constructor en vez de autoinyectarlas debido a que de otra manera 
	//al ser utilizadas en resultado el autowire hara que ocupen la misma direccion de memoria
	Equipo equipo = new Equipo();
	Equipo equipoDos = new Equipo();
	
	/**
	 * Se autoinyecta servicio
	 */
	@Autowired
	ICuotaService cuotaService;
	/**
	 * Se autoinyecta objeto cuota
	 */
	@Autowired
	Cuota cuota;

	public static void main(String[] args) {
		SpringApplication.run(Toconas3872Tp5Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		//inicializa las variables del objeto usuario
		/**
		 * Se hace set del atributo apellido de usuario
		 */
		usuario.setApellido("Toconas");
		/**
		 * Se hace set del atributo direccion de usuario
		 */
		usuario.setDireccion("Av William King 494");
		/**
		 * Se hace set del atributo dni de usuario
		 */
		usuario.setDni(36183332);
		/**
		 * Se hace set del atributo fechaAlta de usuario
		 */
		usuario.setFechaAlta(LocalDate.now());
		/**
		 * Se hace set del atributo fechaNacimiento de usuario
		 */
		usuario.setFechaNacimiento(LocalDate.of(1993, 9, 20));
		/**
		 * Se hace set del atributo Id de usuario
		 */
		usuario.setId(1);
		/**
		 * Se hace set del atributo nombre de usuario
		 */
		usuario.setNombre("Juan");
		/**
		 * Se hace set del atributo password de usuario
		 */
		usuario.setPassword("1234");
		/**
		 * Se hace set del atributo socio de usuario
		 */
		usuario.setTipo("SOCIO");
		//inicializa las variables del objeto cuota
		/**
		 * Se hace set del atributo estado de cuota
		 */
		cuota.setEstado("Al dia");
		/**
		 * Se hace set del atributo fechaPago de cuota
		 */
		cuota.setFechaPago(LocalDate.now());
		/**
		 * Se hace set del atributo Id de cuota
		 */
		cuota.setId(123123253);
		/**
		 * Se hace set del atributo monto de cuota
		 */
		cuota.setMonto(100.50);
		/**
		 * Se hace set del atributo periodo de cuota
		 */
		cuota.setPeriodo("3 meses");
		/**
		 * Se hace set del atributo Usuario de cuota
		 */
		cuota.setUsuario(usuario);
		//inicializa las variables del objeto estadio
		/**
		 * Se hace set del atributo Nombre de estadio
		 */
		estadio.setNombre("Estadio Ficticio");
		/**
		 * Se hace set del atributo ciudad de estadio
		 */
		estadio.setCiudad("Buenos Aires");
		/**
		 * Se hace set del atributo Direccion de estadio
		 */
		estadio.setDireccion("Direccion Ficticia");
		/**
		 * Se hace set del atributo FechaFundacion de estadio
		 */
		estadio.setFechaFundacion(LocalDate.of(1930, 3, 24));
		/**
		 * Se hace set del atributo Capacidad de estadio
		 */
		estadio.setCapacidad(8000);
		/**
		 * Se hace set del atributo Nombre de estadioDos solo a modo de prueba
		 */
		estadioDos.setNombre("Estadio Ficticio Rival");
		//inicializa las variables del objeto equipo
		/**
		 * Se hace set del atributo nombre de equipo
		 */
		equipo.setNombre("Coca");
		/**
		 * Se hace set del atributo estadio de equipo
		 */
		equipo.setEstadio(estadio);
		/**
		 * Se hace set del atributo nombre de equipoDos
		 */
		equipoDos.setNombre("Pepsi");
		/**
		 * Se hace set del atributo estadio de equipoDos
		 */
		equipoDos.setEstadio(estadioDos);
		
		//inicializa las variables del objeto noticia
		/**
		 * Se hace set del atributo titulo de noticia
		 */
		noticia.setTitulo("Victoria del equipo Ficticio sobre su rival");
		/**
		 * Se hace set del atributo fecha de noticia
		 */
		noticia.setFecha(LocalDate.now());
		/**
		 * Se hace set del atributo resumen de noticia
		 */
		noticia.setResumen("Cierto equipo salio victorioso en los ultimos segundos");
		
		//inicializa las variables del objeto resultado
		
		/**
		 * Se hace set del atributo equipo de resultado
		 */
		resultado.setEquipo1(equipo);
		/**
		 * Se hace set del atributo equipo2 de resultado
		 */
		resultado.setEquipo2(equipoDos);
		/**
		 * Se hace set del atributo goles1 de resultado
		 */
		resultado.setGolesEquipo1(2);
		/**
		 * Se hace set del atributo goles2 de resultado
		 */
		resultado.setGolesEquipo2(3);
		/**
		 * Se hace set del atributo fecha de resultado
		 */
		resultado.setFecha(LocalDate.now());
		
		//Se implementan los servicios
		
		/**
		 * Se llama al metodo guardar del usuarioService
		 */
		usuarioService.guardar();
		/**
		 * Se llama al metodo guardar del cuotaService
		 */
		cuotaService.guardar();
		/**
		 * Se llama al metodo guardar del estadiooService
		 */
		estadioService.guardar();
		/**
		 * Se llama al metodo guardar del equipoService
		 */
		equipoService.guardar();
		/**
		 * Se llama al metodo guardar del resultadoService
		 */
		resultadoService.guardar();
		/**
		 * Se llama al metodo guardar del noticiaService
		 */
		noticiaService.guardar(); 
	}
}
