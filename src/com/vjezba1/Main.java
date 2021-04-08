package com.vjezba1;


import com.vjezba1.oopIntroductionExercises.equals.Item;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();


        while (true) {
            System.out.print("Enter name of item, empty will end: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("Identifier?: ");
            String id = scanner.nextLine();
            if (id.isEmpty()) {
                break;
            }

            Item itemToAdd = new Item(name, id);
            if(items.contains(itemToAdd)){
                continue;
            }else{
                items.add(itemToAdd);
            }

        }
//      Hint! It is probably smart to add each item to the list at most once
        System.out.println();
        for (Item item : items) {
                System.out.println(item);
        }

        System.out.println("Thank you! Items added:" + items.size());
    }
}






