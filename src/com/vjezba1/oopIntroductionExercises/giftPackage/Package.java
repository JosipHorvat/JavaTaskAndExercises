package com.vjezba1.oopIntroductionExercises.giftPackage;

import java.util.ArrayList;

public class Package {

  private ArrayList<Gift> gifts = new ArrayList<>();

    public Package() {
        this.gifts = gifts;
    }

    public void addGift(Gift gift){
        gifts.add(gift);
    }

    public int totalWeight(){
        int sumOfWeight = 0;
        for (Gift gift: gifts){
          sumOfWeight +=  gift.getWeightKg();
        }
        return  sumOfWeight;
    }
}
