package com.vjezba1.objectsinalist;

public class Book {

    private String title;
    private int pages;
    private int publicationYear;

    public Book(String title, int pages, int publicationYear) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return title+", " + pages+ " pages, "+publicationYear;
    }

    public void printOnlyTitle(){
        System.out.println(title);
    }
}
