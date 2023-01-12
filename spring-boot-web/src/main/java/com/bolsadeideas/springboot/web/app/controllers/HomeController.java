package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	/*
	 * @GetMapping("/") public String home() { return "redirect:/app/index"; }
	 */
	
	@GetMapping("/")
	public String home() {
		return "forward:/app/index";
	}
	
	/* La diferencia es que con el Fordward se mantiene dentro de la misma 
	 * petición http, y no pierdes los parámetros que tienes dentro del 
	 * request, tampoco cambia la ruta url, ya que no hace un refresh 
	 * (refresca la página), sino que despacha a otra acción del controlador 
	 * pero sin recargar la página, mientras que el redirect cambia la ruta 
	 * url, reinicia el request y refresca el navegador, además que todos 
	 * los parámetros del request que teníamos antes del redirect se pierden 
	 * en este nuevo request.
	 * 
	 */
	
	
}
