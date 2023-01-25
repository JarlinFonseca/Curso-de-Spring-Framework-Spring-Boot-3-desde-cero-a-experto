package com.bolsadeideas.springboot.horariointerceptor.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer{

	@Autowired
	@Qualifier("horario")
	private HandlerInterceptor horario;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//Es importante que el camino alternativo siempre se excluya del interceptor
		registry.addInterceptor(horario).excludePathPatterns("/cerrado");
	}

}
