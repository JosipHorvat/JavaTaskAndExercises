package com.vjezba1.oopIntroductionExercises.giftPackage;

/*
 Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);
        Gift kamen = new Gift("Harry Potter and the Philosopher's Stone", 8);

        Package gifts = new Package();
        gifts.addGift(book);
        gifts.addGift(kamen);
        System.out.println(gifts.totalWeight());
 */

public class Gift {

   private String name;
   private int weightKg;

    public Gift(String name, int weightKg) {
        this.name = name;
        this.weightKg = weightKg;
    }

    public String getName() {
        return name;
    }

    public int getWeightKg() {
        return weightKg;
    }

    @Override
    public String toString() {
        return "Gift: " + name + " (" + weightKg+ " kg.)";

    }
}
