package com.vjezba1.oopIntroductionExercises.oopperson;

public class HealthStation {

    private int counting= 0;

    public int weigh(Person person) {
       int weight = (int) person.getWeight();
       counting++;
        return weight;
    }

    public void feed(Person person){
       person.setWeight((int)person.getWeight()+1);
    }

    public int weighings(){
        return counting;
    }
}
