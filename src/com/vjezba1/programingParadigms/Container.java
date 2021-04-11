package com.vjezba1.programingParadigms;

public class Container {

   private int firstContainer;
   private  int secondContainer;
   private static final int SECOND_CONTAINER_MAX_AMOUNT =100;
   private static final int MAX_AMOUNT =100;

    public Container() {
        this.firstContainer =0;
        this.secondContainer =0;
    }

    public void add(int amount){
        if(amount< 0){
            amount= 0;
        }
        this.firstContainer += amount;
        if(this.firstContainer >100){
            this.firstContainer =100;
        }
    }

    public void remove(int amount){
          secondContainer -= amount;
        if(secondContainer<0){
           secondContainer =0;
        }
    }

    public void move(int amount){


        this.firstContainer -= amount;
        if(this.firstContainer <0){
            this.firstContainer =0;
        }
        this.secondContainer +=amount;

        if(secondContainer> 100){
            secondContainer =100;
        }

    }

    public int contains(){
        return this.firstContainer;
    }

    @Override
    public String toString() {
        return firstContainer + "/" + MAX_AMOUNT + "\n"
             + secondContainer + "/" + SECOND_CONTAINER_MAX_AMOUNT;
    }
}
