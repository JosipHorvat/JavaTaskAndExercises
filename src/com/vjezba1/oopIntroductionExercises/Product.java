package com.vjezba1.oopIntroductionExercises;

public  class Product {

    private Double price;
    private int quantity;
    private String name;

    public Product(String name, Double price, int quantity ) {
        this.price = price;
        this.quantity = quantity;
        this.name = name;
    }
    public void priceUp(){
        this.price = this.price +2.5;
    }

    public void print(){
        System.out.println(name + " " + price + " " + quantity);
    }
}
