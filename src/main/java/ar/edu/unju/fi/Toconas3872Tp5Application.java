package ar.edu.unju.fi;

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

@SpringBootApplication
public class Toconas3872Tp5Application implements CommandLineRunner {

	@Autowired
	IUsuarioService usuarioService;
	@Autowired
	Usuario usuario;

	@Autowired
	IResultadoService resultadoService;
	@Autowired
	Resultado resultado;

	@Autowired
	INoticiaService noticiaService;
	@Autowired
	Noticia noticia;

	@Autowired
	IEstadioService estadioService;
	@Autowired
	Estadio estadio;

	@Autowired
	IEquipoService equipoService;
	@Autowired
	Equipo equipo;
	@Autowired
	Equipo equipo2;
    
	@Autowired
	ICuotaService cuotaService;
	@Autowired
	Cuota cuota;

	public static void main(String[] args) {
		SpringApplication.run(Toconas3872Tp5Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		//inicializa las variables del objeto usuario
		usuario.setApellido("Toconas");
		usuario.setDireccion("Av William King 494");
		usuario.setDni(36183332);
		usuario.setFechaAlta(LocalDate.now());
		usuario.setFechaNacimiento(LocalDate.of(1993, 9, 20));
		usuario.setId(1);
		usuario.setNombre("Juan");
		usuario.setPassword("1234");
		usuario.setTipo("SOCIO");
		//inicializa las variables del objeto cuota
		cuota.setEstado("Al dia");
		cuota.setFechaPago(LocalDate.now());
		cuota.setId(123123253);
		cuota.setMonto(100.50);
		cuota.setPeriodo("3 meses");
		cuota.setUsuario(usuario);
		//inicializa las variables del objeto estadio
		estadio.setNombre("Estadio Ficticio");
		estadio.setCiudad("Buenos Aires");
		estadio.setDireccion("Direccion Ficticia");
		estadio.setFechaFundacion(LocalDate.of(1930, 3, 24));
		estadio.setCapacidad(8000);
		//inicializa las variables del objeto equipo
		equipo.setNombre("Equipo Ficticio");
		equipo.setEstadio(estadio);
		
		equipo2.setNombre("Equipo Ficticio Rival");
		equipo.setEstadio(estadio);
		
		//inicializa las variables del objeto noticia
		noticia.setTitulo("Victoria del equipo Ficticio sobre su rival");
		noticia.setFecha(LocalDate.now());
		noticia.setResumen("Cierto equipo salio victorioso en los ultimos segundos");
		
		//inicializa las variables del objeto resultado
		resultado.setEquipo1(equipo);
		resultado.setEquipo2(equipo2);
		resultado.setGolesEquipo1(2);
		resultado.setGolesEquipo2(3);
		resultado.setFecha(LocalDate.now());
		
		usuarioService.guardar();
		cuotaService.guardar();
		estadioService.guardar();
		equipoService.guardar();
		resultadoService.guardar();
		noticiaService.guardar();
		 
	}

}
