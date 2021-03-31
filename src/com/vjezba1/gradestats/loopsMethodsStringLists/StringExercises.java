package com.vjezba1.gradestats.loopsMethodsStringLists;

import java.util.Scanner;

public class StringExercises {
    /**
     * This class contains exercises for String.
     * Every method have name of the exercise
     */

    private static void concatString() {
        Scanner input = new Scanner(System.in);
        String  word = input.next();
        System.out.println(word+ " " + word);
    }

    private static void equalsMethodInAString() {
        Scanner input = new Scanner(System.in);
        System.out.println(" Write 'true'!");
        String  word = input.next();
        if(word.equals("true")){
            System.out.println("You got it right!");
        }else{
            System.out.println("You didn't write true");
        }
    }

    private static void splitString() {
        Scanner input = new Scanner(System.in);
        System.out.println("Write a sentence");
        String  sentence = input.nextLine();
        String[] pieces = sentence.split(" ");


        for (int i = 0; i < pieces.length; i++) {
            System.out.println(pieces[i]);
        }
    }

    private static void containsAvInAWord() {
        Scanner input = new Scanner(System.in);
        System.out.println("Write a sentence");
        String  sentence = input.nextLine();
        String[] pieces = sentence.split(" ");

        for (int i = 0; i < pieces.length; i++) {
            if(pieces[i].contains("av")){
                System.out.println(pieces[i]);
            }
        }
    }

    private static void lastWordOfSentence() {
        Scanner input = new Scanner(System.in);
        System.out.println("Write a sentence");
        String  sentence = input.nextLine();
        String[] pieces = sentence.split(" ");
        int index = pieces.length;
        System.out.println(pieces[index-1]);
    }
}
