package com.vjezba1.gradestats.loopsMethodsStringLists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExercises {

    /**
     * This class contains commented exercises of ArrayList
     * To run it it need to be copied to main method of a main class.
     */

    //  PRINT ALL, FIRST AND LAST VALUE OF A LIST

//    ArrayList<String> list = new ArrayList<>();
//    Scanner input = new Scanner(System.in);
//        System.out.println("Insert names, quit loop with 0");
//
//        while (true){
//        String name = input.nextLine();
//        if(name.equals("0")){
//            break;
//        }
//        list.add(name);
//    }
//     System.out.println("Values of all names in list are: ");
//        for(int i =0; i< list.size(); i++){
//        String name = list.get(i);
//        System.out.println(name);
//    }
//         System.out.println(  "First value of list is: "+list.get(0) +
//                ", and the last value of list is: "+ list.get(list.size()-1));
//**************************************************************************************
// *************************************************************************************


    //  INSERT VALUES TO LIST, GET ALL VALUES AND GET VALUES FROM N INDEX TO N INDEX

//    ArrayList<Integer> list = new ArrayList<>();
//    Scanner input = new Scanner(System.in);
//        System.out.println("Insert numbers, quit loop with 0");
//
//        while (true){
//        int number = input.nextInt();
//        if(number == 0){
//            break;
//        }
//        list.add(number);
//    }
//        System.out.println("Values of all numbers in the list are: ");
//        for(int i =0; i< list.size(); i++){
//        int number = list.get(i);
//        System.out.println(number);
//    }
//        System.out.println("From where:");
//    int indexFrom = input.nextInt();
//        System.out.println("To where:");
//    int indexTo = input.nextInt();
//
//       for (int i = indexFrom; indexFrom< indexTo; indexFrom++){
//        int number = list.get(indexFrom);
//        System.out.println(number);
//    }
//**************************************************************************************
// *************************************************************************************


//PACKED AND DIRTY BUT WORKS FINE: get all values of numbers int the list, get index of certain number,
// get numbers from index n to index n, get highest number from list

//    ArrayList<Integer> list = new ArrayList<>();
//    Scanner input = new Scanner(System.in);
//        System.out.println("Insert numbers, quit loop with 0");
//
//                while (true){
//                int number = input.nextInt();
//                if(number == 0){
//                break;
//                }
//                list.add(number);
//                }
//                System.out.println("Values of all numbers in the list are: ");
//                int highestNumber = list.get(0);
//
//                System.out.println("Enter number to find out at what index number is: ");
//                int lookingForNumber =input.nextInt();
//
//                for(int i =0; i< list.size(); i++){
//        int number = list.get(i);
//        if (highestNumber < number){
//        highestNumber = number;
//        }
//        System.out.println(number);
//
//        if(lookingForNumber == i){
//        System.out.println("Number " +lookingForNumber +" is at index: " + list.indexOf(i));
//        }
//        }
//        System.out.println("Highest number in list is: "+ highestNumber);
//
//        System.out.println("get number from index?");
//        int indexFrom = input.nextInt();
//        System.out.println("To where:");
//        int indexTo = input.nextInt();
//
//        for (int i = indexFrom; indexFrom< indexTo; indexFrom++){
//        int number = list.get(indexFrom);
//        System.out.println(number);
//        }
//**************************************************************************************
// *************************************************************************************

    // SUM NUMBERS IN A LIST USING FOR EACH LOOP

//    ArrayList<Integer> list = new ArrayList<>();
//    Scanner input = new Scanner(System.in);
//        System.out.println("Insert numbers, quit loop with 0");
//
//        while (true){
//        int number = input.nextInt();
//        if(number == 0){
//            break;
//        }
//        list.add(number);
//    }
//    int sum =0;
//        for (int numbers: list) {
//        sum += numbers;
//    }
//        System.out.println(sum);

//**************************************************************************************
// *************************************************************************************
    // LIST AS A METHOD PARAMETER

    // PRINT INT VALUES LESS THAN N
    public static void printSmallerThan(ArrayList<Integer> numbers, int threshold) {
        for (int number : numbers) {
            if (number < threshold) {
                System.out.println(number);
            }
        }
    }

    // PRINT METHOD
    public static void print(ArrayList<String> list) {
        for (String value : list) {
            System.out.println(value);
        }
    }


    // print values in range < >
    public static void print(ArrayList<Integer> list, int lowerLimit, int upperLimit) {
        for (Integer value : list) {

            if (value >= lowerLimit && value <= upperLimit)
                System.out.println(value);
        }
    }

    // Method that returns list size
    public static int size(ArrayList<String> list) {
        return list.size();
    }

    // Sum all integers in List
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (Integer value : list) {
            sum += value;
        }
        return sum;
    }

    public static void removeLast(ArrayList<Integer> numbers) {
        if (numbers.size() == 0) {
            return;
        }
        numbers.remove(numbers.size() - 1);
    }

}