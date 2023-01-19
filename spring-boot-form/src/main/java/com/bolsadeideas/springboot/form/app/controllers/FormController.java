package com.bolsadeideas.springboot.form.app.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.bolsadeideas.springboot.form.app.models.domain.Usuario;

@Controller
@SessionAttributes("usuario")
public class FormController {
	
	@GetMapping("/form")
	public String form(Model model) {
		Usuario usuario = new Usuario();
		usuario.setNombre("John");
		usuario.setApellido("Doe");
		usuario.setIdentificador("123.456.789-K");
		
		model.addAttribute("titulo", "Formulario Usuarios");
		model.addAttribute("usuario", usuario);
		return "form";
	}
	
	/*
	 * @PostMapping("/form") public String procesar(Model model, @RequestParam(name
	 * = "username") String username,
	 * 
	 * @RequestParam String password,
	 * 
	 * @RequestParam String email) {
	 * 
	 * Usuario usuario = new Usuario(); usuario.setUsername(username);
	 * usuario.setEmail(email); usuario.setPassword(password);
	 * 
	 * model.addAttribute("titulo", "Resultado form"); model.addAttribute("usuario",
	 * usuario);
	 * 
	 * return "resultado"; }
	 */
	
	@PostMapping("/form")
	public String procesar(@Valid Usuario usuario, BindingResult result, Model model,
			SessionStatus status) {
		
		model.addAttribute("titulo", "Resultado form");
		
		if(result.hasErrors()) {
			/*
			 * Map<String, String> errores = new HashMap<>();
			 * result.getFieldErrors().forEach(err ->{ errores.put(err.getField(),
			 * "El campo ".concat(err.getField().concat(" ").concat(err.getDefaultMessage())
			 * )); });
			 * 
			 * model.addAttribute("error", errores);
			 */
			return "form";
		}
		
		model.addAttribute("usuario", usuario);
		status.setComplete();
		return "resultado";
	}
	
}
