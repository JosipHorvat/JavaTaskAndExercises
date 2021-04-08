package com.vjezba1.oopIntroductionExercises;

public class Apartment {
    /*
     Apartment manhattanStudioApt = new Apartment(1, 16, 5500);
        Apartment atlantaTwoBedroomApt = new Apartment(2, 38, 4200);
        Apartment bangorThreeBedroomApt = new Apartment(3, 78, 2500);

        System.out.println(manhattanStudioApt.largerThan(atlantaTwoBedroomApt));       // false
        System.out.println(bangorThreeBedroomApt.largerThan(atlantaTwoBedroomApt));  // true

        System.out.println(manhattanStudioApt.priceDifference(atlantaTwoBedroomApt));  //71600
        System.out.println(bangorThreeBedroomApt.priceDifference(atlantaTwoBedroomApt));   //35400

        System.out.println(manhattanStudioApt.moreExpensiveThan(atlantaTwoBedroomApt));  // false
        System.out.println(bangorThreeBedroomApt.moreExpensiveThan(atlantaTwoBedroomApt));   // true
     */

    private int rooms;
    private int squareM;
    private int pricePerSquare;

    public Apartment(int rooms, int squareM, int pricePerSquare) {
        this.rooms = rooms;
        this.squareM = squareM;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared){
            if(this.squareM > compared.squareM){
                return true;
            }
            return false;
    }

    public int priceDifference(Apartment compared){
        int price = this.pricePerSquare * squareM;
        int comparedPrice = compared.pricePerSquare* compared.squareM;
        int temp;
        if(price<comparedPrice){
          temp = price;
          price = comparedPrice;
          comparedPrice = temp;
        }
        int diff = price - comparedPrice;
        return diff;
        }

     public boolean moreExpensiveThan(Apartment compared){
         int price = this.pricePerSquare * squareM;
         int comparedPrice = compared.pricePerSquare* compared.squareM;
         if(price> comparedPrice){
             return true;
         }
         return false;
     }

    }

