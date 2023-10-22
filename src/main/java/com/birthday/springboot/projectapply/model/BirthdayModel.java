/**
 * Modelo de datos que representa la información relacionada con la fecha de cumpleaños.
 *
 * Esta clase almacena la fecha de cumpleaños en formato LocalDate.
 *
 * Constructores:
 * - Constructor sin argumentos: Permite crear una instancia de BirthdayModel sin proporcionar la fecha de cumpleaños.
 * - Constructor con argumentos: Permite crear una instancia de BirthdayModel proporcionando la fecha de cumpleaños.
 *
 * Uso:
 * Puedes utilizar esta clase para representar la fecha de cumpleaños en tu aplicación y pasarla entre diferentes componentes.
 *
 * Autor: Javiera Gandarillas
 * Fecha: 22-10-2023
 */
package com.birthday.springboot.projectapply.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;

public class BirthdayModel {

    private LocalDate date;

    // Constructor sin argumentos
    public BirthdayModel() {
    }

    // Constructor con argumentos
    @JsonCreator
    public BirthdayModel(@JsonProperty("date") LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
