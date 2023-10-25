package com.example.demo.dto;

public record ClienteRecord(String nombre, String apellido, double saldo, 
		boolean isPersonaFisica,String domicilio, String estadoCivil) {

}
