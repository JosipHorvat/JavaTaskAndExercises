package javaTwo.warehousingOop;

public class Warehouse {

    private double balance;
    private double capacity;

    public Warehouse(double capacity) {
        if (capacity > 0) {
            this.capacity = capacity;
        } else {
            this.capacity = 0;
        }

        this.balance = 0;

    }

    public double getBalance() {
        return balance;
    }

    public double getCapacity() {
        return capacity;
    }

    public double howMuchSpaceLeft(){
        return this.capacity - this.balance;
    }

    public void addToWarehouse(double amount){
        if(amount<0){
            return;
        }
        if (amount <= howMuchSpaceLeft()) {
            this.balance = this.balance + amount;
        } else {
            this.balance = this.capacity;
        }
    }

    public double takeFromWarehouse(double amount){
        if (amount < 0) {
            return 0;
        }
        if (amount > this.balance) {
            double allThatWeCan = this.balance;
            this.balance = 0;
            return allThatWeCan;
        }

        this.balance = this.balance - amount;
        return amount;

    }

    @Override
    public String toString() {
        return "balance = " +  this.getBalance() + ", space left: " + howMuchSpaceLeft();
    }
}
