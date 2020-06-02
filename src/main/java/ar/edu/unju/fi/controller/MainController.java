package ar.edu.unju.fi.controller;
/**
 * Clase con la anotacion @Controller que toman las peticiones y 
 * controlan la respuesta que debe ser presentada en la vista (página html) 
 * del proyecto.
 * @author Toconas Juan Manuel
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ar.edu.unju.fi.service.IUsuarioService;

@Controller
public class MainController {
	@Autowired
	private IUsuarioService usuarioService;
	
	/**
	 * En el main() se agrega la anotación 
	 * @RequestMapping para asociar una url 
	 * Aqui es http://localhost:8080 si colocamos esa url el método que
	 * responderá será main(Model model) que retorna un String “index”, 
	 * que representa la página html que se debe mostrar. 
	 * El objeto model es usado para adjuntar atributos que irán directo a la vista 
	 * @param objeto model es usado para adjuntar atributos que irán directo a la vista html
	 * @return pagina web es este caso Index, la pagina principal
	 */
	@RequestMapping("/")
	public String main(Model model) {
		model.addAttribute("usuario",usuarioService.mostrar().getNombre());
		return "Index";
	}
}
