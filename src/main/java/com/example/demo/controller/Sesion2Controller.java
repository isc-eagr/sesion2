package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sesion2Controller {

	//Microservicio que se puede consumir por POST
	@PostMapping("/prueba")
	public String holaMundo() {
		return "Hola Mundo!";
	}
	
	//Microservicio que se puede consumir por DELETE
	@DeleteMapping("/ejercicio")
	public String ejercicio() {
		return "Hoy es Miércoles";
	}
	
	//Microservicio que se puede consumir por todos los métodos 
	@RequestMapping("/multi")
	public String multiMetodo() {
		return "Hoy es Miércoles";
	}
	
	//Microservicio que puede accederse mediante varias rutas
	/*@PostMapping({"/test","/ruta","/path"})
	public String multiRuta() {
		return "Hola Mundo!";
	}*/
	
	//Microservicio que puede accederse mediante varias rutas
	@PostMapping({"/test","/ruta","/path"})
	public String returnObject() {
		return "Hola Mundo!";
	}
		
}
