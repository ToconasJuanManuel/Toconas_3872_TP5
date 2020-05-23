package ar.edu.unju.fi;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.fi.model.Usuario;
import ar.edu.unju.fi.service.IUsuarioService;

@SpringBootApplication
public class Toconas3872Tp5Application implements CommandLineRunner {
	
	@Autowired
	IUsuarioService usuarioService;
	@Autowired
	Usuario usuario;
	
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
		
		usuarioService.guardar();
		//usuarioService.mostrar();
		//usuarioService.modificar();
		//usuarioService.eliminar();
	}

}
