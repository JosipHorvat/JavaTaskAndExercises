package com.vjezba1.oopIntroductionExercises.personpet;

public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return this.day;
    }

    public int getMonth() {
        return this.month;
    }

    public int getYear() {
        return this.year;
    }

    public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }

        // if the type of the compared object is not SimpleDate, the objects are not equal
        if (!(compared instanceof SimpleDate)) {
            return false;
        }

        // convert the Object type compared object
        // into a SimpleDate type object called comparedSimpleDate
        SimpleDate comparedSimpleDate = (SimpleDate) compared;

        // if the values of the object variables are the same, the objects are equal
        if (this.day == comparedSimpleDate.day &&
                this.month == comparedSimpleDate.month &&
                this.year == comparedSimpleDate.year) {
            return true;
        }

        // otherwise the objects are not equal
        return false;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    // used to check if this date object (`this`) is before
    // the date object given as the parameter (`compared`)
    public boolean before(SimpleDate compared) {
        // first compare years
        if (this.year < compared.year) {
            return true;
        }

        if (this.year > compared.year) {
            return false;
        }

        // years are same, compare months
        if (this.month < compared.month) {
            return true;
        }

        if (this.month > compared.month) {
            return false;
        }

        // years and months are same, compare days
        if (this.day < compared.day) {
            return true;
        }

        return false;
    }

}
