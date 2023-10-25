package com.example.demo.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ClienteRecord;

@RestController
@RequestMapping("/api")
public class ParamsController {
	
	//Microservicio que se invoca con un parametro
	@RequestMapping("/parametro")
	public String parametro(@RequestParam String nombre) {
		return "Hola "+nombre;
	}
	
	//Microservicio que se invoca con parámetros opcionales
	@RequestMapping("/dos")
	public String dosParametros(@RequestParam(required=false) String nombre,
			@RequestParam(defaultValue="30") String edad) {
		return "Hola "+nombre+" tienes "+edad+" años!";
	}
	
	//Microservicio que se invoca con parámetros opcionales
	@RequestMapping("/parametrocomplejo")
	public ResponseEntity<List<ClienteRecord>> parametroComplejo(@RequestBody(required=true) ClienteRecord cliente) {
		ClienteRecord emmanuel = new ClienteRecord("Emmanuel", "Gómez", 3.50, true, 
				"Calle Malintzin", "Casado");
		return new ResponseEntity<>(List.of(cliente,emmanuel), HttpStatus.OK);
	}
	
}
