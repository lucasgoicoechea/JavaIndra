package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServicioA {

	@GetMapping("/")
	public String metodo1() {
        return "hola es el metodo1";
	}


}
