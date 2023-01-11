package com.bolsadeideas.springboot.web.app.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.web.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {
	
//	@RequestMapping(value = "/index", method = RequestMethod.GET)
	@GetMapping({"/index", "/", "", "home"})
	public String index(Model model) {
		model.addAttribute("titulo", "Hola Spring Framework con Model!");
		return "index";
	}
	
	@RequestMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("Jarlin");
		usuario.setApellido("Fonseca");
		usuario.setEmail("jarlinandres5000@gmail.com");
		
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Perfil del usuario: ".concat(usuario.getNombre()));
		
		return "perfil";
	}
	
	@RequestMapping("/listar")
	public String listar(Model model) {	
		model.addAttribute("titulo", "Listado de usuarios");
		return "listar";
	}
	
	@ModelAttribute("usuarios")
	public List<Usuario> poblarUsuarios(){
		List<Usuario> usuarios = Arrays.asList(new
				  Usuario("Jarlin", "Fonseca", "jarlinandres5000@gmail.com"),
				  new Usuario("Juan", "Lopez", "juanlopez@gmail.com"),
				  new Usuario("Jane", "Doe", "jane@gmail.com"),
				  new Usuario("Tornado", "Roe", "roe@gmail.com")
				  );
		return usuarios;
	}
	
	
	

}
