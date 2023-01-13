package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

//@Component es lo mismo que Service la diferencia es semantica
//@Service("miServicioSimple")
//@Primary
public class MiServicio implements IServicio {
	
	@Override
	public String operacion() {
		return "ejecutando algún proceso importante simple...";
	}

}
