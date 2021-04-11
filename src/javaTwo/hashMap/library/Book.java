package javaTwo.hashMap.library;

/*
********EXERCISE 1****************
Book senseAndSensibility = new Book("Sense and Sensibility", 1811, "...");
Book prideAndPrejudice = new Book("Pride and Prejudice", 1813, "....");

Library library = new Library();
library.addBook(senseAndSensibility);
library.addBook(prideAndPrejudice);

System.out.println(library.getBook("pride and prejudice");
System.out.println();

System.out.println(library.getBook("PRIDE AND PREJUDICE");
System.out.println();

System.out.println(library.getBook("SENSE"));
 */
/*
********EXERCISE 2 ************
*   Program program = new Program();

        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        program.printValues(hashmap);
        System.out.println("---");
        program.printValueIfNameContains(hashmap, "prejud");
 */
public class Book {

    private String name;
    private String content;
    private int published;

    public Book(String name, int published, String content) {
        this.name = name;
        this.published = published;
        this.content = content;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublished() {
        return this.published;
    }

    public void setPublished(int published) {
        this.published = published;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String toString() {
        return "Name: " + this.name + " (" + this.published + ")\n"
                + "Content: " + this.content;
    }
}
