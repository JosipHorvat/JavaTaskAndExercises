package com.vjezba1.oopIntroductionExercises;
/*
 Gauge g = new Gauge();

        while(!g.full()) {
            System.out.println("Not full! Value: " + g.value());
            g.increase();
        }

        System.out.println("Full! Value: " + g.value());
        g.decrease();
        System.out.println("Not full! Value: " + g.value());
 */
public class Gauge {

    private int value;

    public Gauge() {
    }

    public void increase(){
        if(this.value<5){
            this.value = this.value+1;
        }
    }

    public void decrease(){
        if(!(value <0)){
            this.value = this.value-1;
        }
    }

    public int value(){
        return this.value;
    }

    public boolean full(){
        if(!(value ==5)){
            return false;
        }
        return true;
    }
}
