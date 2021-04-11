package com.vjezba1.programingParadigms;

import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private Container container;


    public UserInterface(Container container, Scanner scanner) {
        this.scanner = scanner;
        this.container = container;

    }

    public void start() {

        while (true) {
            System.out.println(container);
            System.out.print("Enter a word: ");
            String word = scanner.nextLine();

            if (end(word)) {
                break;
            }
            if(add(word)){
                String[] parts = word.split(" ");
                int amount = Integer.valueOf(parts[1]);
                this.container.add(amount);
            }
            if(move(word)){
                String[] parts = word.split(" ");
                int amount = Integer.valueOf(parts[1]);
                this.container.move(amount);
            }
            if(remove(word)){
                String[] parts = word.split(" ");
                int amount = Integer.valueOf(parts[1]);
                this.container.remove(amount);
            }
        }

        System.out.println("Bye Bye!");
    }



    public boolean end(String word) {
        if (word.equals("end")) {
            return true;
        }
        return false;
    }

    public boolean add(String word){
        String[] parts = word.split(" ");
        String command = parts[0];
        if(command.equals("add")){
           return true;
        }
        return false;
    }

    public boolean move(String word){
        String[] parts = word.split(" ");
        String command = parts[0];
        if(command.equals("move")){
            return true;
        }
        return false;
    }

    public boolean remove(String word){
        String[] parts = word.split(" ");
        String command = parts[0];
        if(command.equals("remove") ){
            return true;
        }
        return false;
    }
}
