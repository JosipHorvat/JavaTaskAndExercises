package com.vjezba1.oopIntroductionExercises.personpet;

public class Pet {

    private String name;

    public Pet(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
