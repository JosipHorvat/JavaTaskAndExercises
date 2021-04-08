package com.vjezba1.oopIntroductionExercises.equals;

/*
   Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Enter name of book, empty will end: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.println("Publication year: ");
            int published = Integer.valueOf(scanner.nextLine());

            Book bookToAdd = new Book(name,published);
            if(books.contains(bookToAdd)){
                System.out.println("Book is already on th list");
            }else {
                books.add(bookToAdd);
            }
        }

        System.out.println();

        // We'll print all details about book
        for (Book book: books ) {
                 System.out.println(book);
        }
        System.out.println("Thank you! Books added:" +books.size() );
 */

public class Book {
    private String name;
    private  int yearPublished;

    public Book(String name, int yearPublished) {
        this.name = name;
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return "Name of the book: " + name + ", published: " + yearPublished;
    }

    public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }

        // if the compared object is not of type Song, the objects are not equal
        if (!(compared instanceof Book)) {
            return false;
        }

        // convert the object into a Song object
        Book comparedBook = (Book) compared;

        // if the values of the object variables are equal, the objects are equal
        if (this.name.equals(comparedBook.name)) {
            return true;
        }

        // otherwise the objects are not equal
        return false;
    }
}
