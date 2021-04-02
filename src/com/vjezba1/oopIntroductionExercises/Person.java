package com.vjezba1.oopIntroductionExercises;

/*
 Person josip = new Person("Josip");
        Person mile = new Person("Mile");

        int i = 0;
        while (i < 30) {
            josip.growOlder();
            i = i + 1;
        }

        mile.growOlder();

        System.out.println("");

        if (josip.isOfLegalAge()) {
            System.out.println(josip.getName() + " is of legal age");
        } else {
            System.out.println(josip.getName() + " is underage");
        }

        if (mile.isOfLegalAge()) {
            System.out.println(mile.getName() + " is of legal age");
        } else {
            System.out.println(mile.getName() + " is underage ");
        }

    }
 */

public class Person {

    private String name;
    private int age;
    private int weight;
    private int height;

    public Person(String initialName, int age) {
        this.age = age;
        this.weight = 0;
        this.height = 0;
        this.name = initialName;
    }

    public int getAge() {
        return age;
    }

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }

    public void growOlder() {
        if (this.age < 30) {
            this.age = this.age + 1;
        }
    }

    public int returnAge() {
        return this.age;
    }

    public boolean isOfLegalAge() {
        if (this.age < 18) {
            return false;
        }
        return true;
    }

    public String getName() {
        return this.name;
    }

    public void setHeight(int newHeight) {
        this.height = newHeight;
    }

    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }

    public double bodyMassIndex() {
        double heigthPerHundred = this.height / 100.0;
        return this.weight / (heigthPerHundred * heigthPerHundred);
    }


    public String toString() {
        return this.name + ", age " + this.age + " years, my body mass index is " + bodyMassIndex();}

}
