/**
 * Clase principal de la aplicación Birthday Project.
 *
 * Esta clase inicia la aplicación Spring Boot que gestiona información relacionada con cumpleaños.
 * Cuando se ejecuta, la aplicación se encarga de manejar las solicitudes y respuestas para la funcionalidad
 * de la aplicación.
 *
 * Uso:
 * Para iniciar la aplicación, simplemente ejecuta el método main de esta clase.
 *
 * Métodos Importantes:
 * - main: El método principal que inicia la aplicación Spring Boot.
 *
 * Ejemplo de Uso:
 * public class App {
 *     public static void main(String[] args) {
 *         SpringApplication.run(BirthdayProjectApplication.class, args);
 *     }
 * }
 *
 * Autor: Javiera Gandarillas
 * Fecha: 22-10-2023
 */
package com.birthday.springboot.projectapply;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BirthdayProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BirthdayProjectApplication.class, args);
	}

}
