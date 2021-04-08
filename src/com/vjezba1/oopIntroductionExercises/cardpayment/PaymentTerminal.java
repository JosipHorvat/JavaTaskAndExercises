package com.vjezba1.oopIntroductionExercises.cardpayment;

public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    public PaymentTerminal() {
        this.money = 1000;
        // register initially has 1000 euros of money
    }

    public double eatAffordably(double payment) {
        double price = 2.50;

        double change = payment-price;
        if(change>=0){
            this.money = this.money + price;
            this.affordableMeals++;
            return change;
        }
        return payment;
        // an affordable meal costs 2.50 euros
        // increase the amount of cash by the price of an affordable mean and return the change
        // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
    }
//
    public double eatHeartily(double payment) {
        double price = 4.30;
        double change = payment - price;
        if (change >= 0) {
            this.money = this.money + price;
            this.heartyMeals++;
            return change;
            // a hearty meal costs 4.30 euros
            // increase the amount of cash by the price of a hearty mean and return the change
            // if the payment parameter is not large enough, no meal is sold and the method should return the whole payment
        }
        return payment;
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
