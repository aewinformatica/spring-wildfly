package br.com.aewinformatica.springwildfly.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {
	
	@GetMapping()
	public String welcome(){
		
		return "Bem-Vindo AewInformatica \n # Server\r\n" + 
				"server.servletPath=/spring-wildfly";
	}

}
