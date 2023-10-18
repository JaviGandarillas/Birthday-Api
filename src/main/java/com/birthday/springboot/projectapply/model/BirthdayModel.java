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
