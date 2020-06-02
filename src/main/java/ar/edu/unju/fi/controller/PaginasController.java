package ar.edu.unju.fi.controller;

/**
 * Clase controlador encargada de tomar las peticiones (aqui localhost:8080/)y
 * controlar que respuesta debe ser presentada en la vista 
 * (página html) de nuestro proyecto.
 * @author Toconas Juan Manuel
 */
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.service.IUsuarioService;

@Controller
@RequestMapping("/")
public class PaginasController {
	@Autowired
	private IUsuarioService usuarioService;
	
	/**
	 * En el main() se agrega la anotación 
	 * @RequestMapping para asociar una url 
	 * Aqui es http://localhost:8080/home si colocamos esa url el método que
	 * responderá será main(Model model) que retorna un String “index”, 
	 * que representa la página html que se debe mostrar. 
	 * El objeto model es usado para adjuntar atributos que irán directo a la vista 
	 * @param objeto model es usado para adjuntar atributos que irán directo a la vista html
	 * @return pagina web es este caso Index, la pagina princioal pero respondiendo a /home
	 */
	@RequestMapping("home")
	public String Home (Model model) {
		model.addAttribute("usuario",usuarioService.mostrar().getNombre());
		return "Index";
	}
	
	/**
	 * En el main() se agrega la anotación 
	 * @RequestMapping para asociar una url 
	 * Aqui es http://localhost:8080/Index si colocamos esa url el método que
	 * responderá será main(Model model) que retorna un String “index”, 
	 * que representa la página html que se debe mostrar. 
	 * El objeto model es usado para adjuntar atributos que irán directo a la vista 
	 * @param objeto model es usado para adjuntar atributos que irán directo a la vista html
	 * @return pagina web es este caso Index, la pagina princioal pero respondiendo a /Index
	 */
	@RequestMapping("Index")
	public String Index (Model model) {
		model.addAttribute("usuario",usuarioService.mostrar().getNombre());
		return "Index";
	}
	
	/**
	 * En el main() se agrega la anotación 
	 * @RequestMapping para asociar una url 
	 * Aqui es http://localhost:8080/home si colocamos esa url el método que
	 * responderá será main(Model model) que retorna un String "fixture", 
	 * que representa la página html que se debe mostrar. 
	 * El objeto model es usado para adjuntar atributos que irán directo a la vista 
	 * @param objeto model es usado para adjuntar atributos que irán directo a la vista html
	 * @return pagina web es este caso fixture, la pagina princioal pero respondiendo a /fixture
	 */
	@RequestMapping("fixture")
	public String Fixture (Model model) {
		model.addAttribute("usuario",usuarioService.mostrar().getNombre());
		return "fixture";
	}
	
	/**
	 * En el main() se agrega la anotación 
	 * @RequestMapping para asociar una url 
	 * Aqui es http://localhost:8080/home si colocamos esa url el método que
	 * responderá será main(Model model) que retorna un String “equipos”, 
	 * que representa la página html que se debe mostrar. 
	 * El objeto model es usado para adjuntar atributos que irán directo a la vista 
	 * @param objeto model es usado para adjuntar atributos que irán directo a la vista html
	 * @return pagina web es este caso equipos, la pagina princioal pero respondiendo a /equipos
	 */
	@RequestMapping("equipos")
	public String equipos (Model model) {
		model.addAttribute("usuario",usuarioService.mostrar().getNombre());
		return "equipos";
	}
}
