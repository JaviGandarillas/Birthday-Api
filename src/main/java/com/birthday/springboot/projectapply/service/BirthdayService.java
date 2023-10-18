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
