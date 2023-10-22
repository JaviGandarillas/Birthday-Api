/**
 * Servicio de Spring Boot para la gestión de cálculos relacionados con cumpleaños.
 *
 * Este servicio proporciona métodos para calcular la cantidad de días hasta el próximo cumpleaños a partir de una fecha de nacimiento.
 *
 * Uso:
 * Este servicio se utiliza para realizar cálculos relacionados con cumpleaños, como determinar cuántos días faltan hasta el próximo cumpleaños.
 *
 * Métodos Importantes:
 * - calculateDaysUntilNextBirthday: Este método toma un objeto BirthdayModel que contiene la fecha de nacimiento y devuelve la cantidad
 *   de días hasta el próximo cumpleaños.
 *
 * Ejemplo de Uso:
 * 1. Crea una instancia de BirthdayService.
 * 2. Llama al método calculateDaysUntilNextBirthday pasando un objeto BirthdayModel con la fecha de nacimiento.
 * 3. El método devolverá la cantidad de días hasta el próximo cumpleaños.
 *
 * Autor: Javiera Gandarillas
 * Fecha: 22-10-2023
 */
package com.birthday.springboot.projectapply.service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.springframework.stereotype.Service;

import com.birthday.springboot.projectapply.model.BirthdayModel;

//Define servicio de Spring
@Service
public class BirthdayService {
	   //Método que toma un BirthdayModel(objeto con fecha) devuelve un entero
	
	   public int calculateDaysUntilNextBirthday(BirthdayModel birthday) {
		   LocalDate date = birthday.getDate();
		    if (date == null) {
		        throw new IllegalArgumentException("La fecha de nacimiento no puede ser null");
		    }
		    //Obtiene la fecha actual
	        LocalDate now = LocalDate.now();
	        //Obtiene la fecha de su proximo cumpleaños de ese año
	        LocalDate nextBirthday = birthday.getDate().withYear(now.getYear());
	        //Si el próximo cumpleaños es el año siguiente entonces se suma un año
	        if (nextBirthday.isBefore(now)) {
	            nextBirthday = nextBirthday.plusYears(1);
	        }
	        //Calcula diferencia de días entre cumpleaños
	        return (int) ChronoUnit.DAYS.between(now, nextBirthday);
	    }
}
