package com.vjezba1.objectsinalist;

import java.time.LocalDate;
/*
       Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();

// Read the names of persons from the user
        while (true) {
            System.out.print("Enter a item, empty will stop: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }


            // Add to the list a new person
            // whose name is the previous user input
            items.add(new Item(name));
        }

// Print the number of the entered persons, and their individual information
        System.out.println();
        System.out.println("Persons in total: " + items.size());
        System.out.println("Persons: ");

        for (Item item: items) {
            System.out.println(item);
        }
 */

public class Item {

    private String name;
    private LocalDate dateCreated;

    public Item(String name ) {
        this.name = name;
        this.dateCreated = LocalDate.now();
    }

    @Override
    public String toString() {
        return "Item.. " + "name: " + name +
                ", dateCreated: " +  dateCreated;

    }
}
