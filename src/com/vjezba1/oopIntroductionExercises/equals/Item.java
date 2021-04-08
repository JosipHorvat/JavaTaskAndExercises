package com.vjezba1.oopIntroductionExercises.equals;

public class Item {

    private String name;
    private String id;


    public Item(String name, String id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return id + ":" + " " + name;
    }

    public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }

        // if the compared object is not of type Song, the objects are not equal
        if (!(compared instanceof Item)) {
            return false;
        }

        // convert the object into a Song object
        Item comparedItem = (Item) compared;

        // if the values of the object variables are equal, the objects are equal
        if (this.id.equals(comparedItem.id)) {
            return true;
        }

        // otherwise the objects are not equal
        return false;
    }

}
