package com.vjezba1.oopIntroductionExercises;

public class Cube {
    /*
     Cube smallCube = new Cube(4);
        System.out.println(smallCube.volume());
        System.out.println(smallCube);

        System.out.println();

        Cube bigCube = new Cube(2);
        System.out.println(bigCube.volume());
        System.out.println(bigCube);

     */

    private int edgeLength;

    public Cube(int edgeLength) {
        this.edgeLength = edgeLength;
    }

    public int volume(){
        int volume = this.edgeLength*this.edgeLength*this.edgeLength;
        return volume;
    }

    @Override
    public String toString() {
        return "The length of the edge is "+ edgeLength + "and the volume "+ volume();
    }
}
