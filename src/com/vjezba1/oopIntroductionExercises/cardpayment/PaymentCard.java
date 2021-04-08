package com.vjezba1.oopIntroductionExercises.cardpayment;

public class PaymentCard {


    private double balance;

    public PaymentCard(double balance) {
       this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void addMoney(double increase) {
        this.balance = this.balance + increase;
    }

    public boolean takeMoney(double amount) {
         double credit = this.balance;
        if(this.balance - amount  >=0){
           this.balance = credit -amount;
            return true;
        }
        return false;
        // implement the method so that it only takes money from the card if
        // the balance is at least the amount parameter.
        // returns true if successful and false otherwise
    }

    public String toString() {
        return "The card has balance of " + Math.round(this.balance);
    }
}
