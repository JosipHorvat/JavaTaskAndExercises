package com.vjezba1.oopIntroductionExercises;

public class PaymentCard {
    /*
     PaymentCard paul = new PaymentCard(20);
        PaymentCard matt = new PaymentCard(30);
        paul.eatHeartily();
        matt.eatAffordably();
        System.out.println("Paul: " + paul);
        System.out.println("Matt: " +matt);
        paul.addMoney(20);
        matt.eatHeartily();
        System.out.println("Paul: " + paul);
        System.out.println("Matt: " +matt);
        paul.eatAffordably();
        paul.eatAffordably();
        matt.addMoney(50);
        System.out.println("Paul: " + paul);
        System.out.println("Matt: " +matt);
     */

    private double balance;

    public PaymentCard(double openingBalance) {
       this.balance = openingBalance;
    }

    public void eatAffordably() {
        this.balance = this.balance -2.60;
        if(this.balance< 0){
            this.balance = this.balance +2.60;
         }
       }


    public void eatHeartily() {
        this.balance = this.balance - 4.60;
        if(this.balance< 0){
            this.balance = this.balance +4.60;
        }
    }

    public void addMoney(double amount) {

        if(amount<0){
            amount=0;
        }
        this.balance = this.balance+amount;
        if(this.balance> 150){
            this.balance = 150;
        }
    }

    public String toString() {
        return "The card has balance of " + Math.round(this.balance);
    }
}
