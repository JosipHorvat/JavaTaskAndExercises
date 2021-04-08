package com.vjezba1.oopIntroductionExercises.oopperson;

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
// CONSTRUCTOR OVERLOADINHG
    private String name;
    private int age;
    private double weight;
    private double height;


    public Person(String initialName, int age) {
        this.age = age;
        this.weight = 0;
        this.height = 0;
        this.name = initialName;
    }

    public Person(String name) {
        this(name, 0);
        //here the code of the second constructor is run, and the age is set to 0
    }

    public Person(String name, int age,double height , double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }

    public void growOlder() {
        this.age++;
    }
    //OVERLOADED METHOD, this one has a parameter and they cant be same
    public void growOlder(int years) {
        this.age = this.age + years;
    }

    public boolean isOfLegalAge() {
        if (this.age < 18) {
            return false;
        }
        return true;
    }
    public double bodyMassIndex() {
        double heigthPerHundred = this.height / 100.0;
        return this.weight / (heigthPerHundred * heigthPerHundred);
    }

    public double maximumHeartRate() {
        return 206.3 - (0.711 * this.age);
    }


    public int getAge() {
        return age;
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

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public String toString() {
        return this.name + ", age " + this.age + " years, my body mass index is " + bodyMassIndex()
                + " , Maximim heart rate: " +this.maximumHeartRate();

    }
}
