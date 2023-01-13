package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.stereotype.Service;

//@Component es lo mismo que Service la diferencia es semantica
@Service
public class MiServicio {
	
	public String operacion() {
		return "ejecutando algún proceso importante...";
	}

}
