package com.vjezba1.oopIntroductionExercises;

/*
   Song jackSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
    Song anotherSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);

if (jackSparrow.equals(anotherSparrow)) {
        System.out.println("Songs are equal.");
    }

if (jackSparrow.equals("Another object")) {
        System.out.println("Strange things are afoot.");
    }
 */

public class Song {

    private String name;
    private String artist;
    private  int length;

    public Song(String name, String artist, int length) {
        this.name = name;
        this.artist = artist;
        this.length = length;
    }

    public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }

        // if the compared object is not of type Song, the objects are not equal
        if (!(compared instanceof Song)) {
            return false;
        }

        // convert the object into a Song object
        Song comparedSong = (Song) compared;

        // if the values of the object variables are equal, the objects are equal
        if (this.name.equals(comparedSong.name) &&
                this.artist == comparedSong.artist &&
                this.length == comparedSong.length) {
            return true;
        }

        // otherwise the objects are not equal
        return false;
    }
}
