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

