/**
 * Controlador de Spring Boot para la gestión de información de cumpleaños.
 *
 * Este controlador proporciona una API RESTful para calcular la cantidad de días hasta el próximo cumpleaños
 * a partir de la fecha de nacimiento proporcionada.
 *
 * Rutas y Métodos:
 * - POST /birthday: Calcula la cantidad de días hasta el próximo cumpleaños. Se espera una solicitud con
 *   un objeto BirthdayModel en el cuerpo del mensaje.
 *
 * Uso:
 * Este controlador se utiliza para manejar solicitudes relacionadas con cumpleaños a través de una interfaz web o API.
 *
 * Métodos Importantes:
 * - calculateDaysUntilNextBirthday: Este método toma un objeto BirthdayModel y devuelve la cantidad de días hasta
 *   el próximo cumpleaños.
 *
 * Ejemplo de Uso:
 * 1. Realiza una solicitud POST a la ruta "/birthday" con un objeto BirthdayModel en el cuerpo del mensaje para
 *    calcular los días hasta el próximo cumpleaños.
 *
 * Autor: Javiera Gandarillas
 * Fecha: 22-10-2023
 */
package com.birthday.springboot.projectapply.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;



import com.birthday.springboot.projectapply.model.BirthdayModel;
import com.birthday.springboot.projectapply.service.BirthdayService;

//Define Birthday conttroller como controlador restful
@CrossOrigin(origins = "http://localhost:4200", methods = {RequestMethod.GET, RequestMethod.POST})
@RestController
public class BirthdayController {
	 //Declara que se utilizará este cálculo
	 private final BirthdayService birthdayService;
        //Define constructor que toma instancia como parámetro
	    public BirthdayController(BirthdayService birthdayService) {
	        this.birthdayService = birthdayService;
	    }
        //Define un método que maneja solicitudes http y maneja ruta
	    @PostMapping("/birthday")
	    //Define método que toma BirthdayModel y devuelve un int
	    public int calculateDaysUntilNextBirthday(@RequestBody BirthdayModel birthday) {
	        return birthdayService.calculateDaysUntilNextBirthday(birthday);
	    }
}

