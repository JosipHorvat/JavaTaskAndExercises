package com.vjezba1.oopIntroductionExercises.personpet;

/*

 Pet lucy = new Pet("Lucy the cat");
        Person josip = new Person("Josip", lucy);

        System.out.println(josip);
 */
public class Person {

    private String name;
    private Pet pet;

    private SimpleDate birthday;
    private int height;
    private  int weight;


    public Person(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }

    public Person(String name, SimpleDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public boolean olderThan(Person compared) {
        if (this.birthday.before(compared.getBirthday())) {
            return true;
        }

        return false;

        // or return more directly:
        // return this.birthday.before(compared.getBirthday());
    }


    @Override
    public String toString() {
        return  name + " has a friend " + pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public SimpleDate getBirthday() {
        return birthday;
    }

    public void setBirthday(SimpleDate birthday) {
        this.birthday = birthday;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
