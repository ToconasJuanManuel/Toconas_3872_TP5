package ar.edu.unju.fi.controller;

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
	
	@RequestMapping("home")
	public String Home (Model model) {
		model.addAttribute("usuario",usuarioService.mostrar().getNombre());
		return "Index";
	}
	
	
	@RequestMapping("Index")
	public String Index (Model model) {
		model.addAttribute("usuario",usuarioService.mostrar().getNombre());
		return "Index";
	}
	
	@RequestMapping("fixture")
	public String Fixture (Model model) {
		model.addAttribute("usuario",usuarioService.mostrar().getNombre());
		return "fixture";
	}
	
	@RequestMapping("equipos")
	public String equipos (Model model) {
		model.addAttribute("usuario",usuarioService.mostrar().getNombre());
		return "equipos";
	}
}
