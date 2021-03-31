package com.vjezba1.gradestats.loopsMethodsStringLists;

import java.util.Scanner;

public class RepeatingBreakingRemebering {
    /**
     @since 27/03/2021,
     Author Josip Horvat

     This is Exercise from https://java-programming.mooc.fi/part-2/3-more-loops
     Program ask user to enter numbers until user input the number -1, then program ends and do
     following: Sum of all numbers inserted
     Total number of numbers user did insert
     Average Number of all numbers inserted
     Number of Odd and Even numbers user did insert

     To check this program copy comment from this class
     and call it in main method of Main class.
     */

    public  void sumAverageEvenOddTotalNumbers(){

        /*
        Call it in main method:
        RepeatingBreakingRemebering repeatingBreakingRemebering = new RepeatingBreakingRemebering();
        repeatingBreakingRemebering.sumAverageEvenOddTotalNumbers();
         */

        Scanner scanner = new Scanner(System.in);

        int broj = 0;
        int zbroj = 0;
        int brojBrojeva =0;
        double average;
        int evenNumber =0;
        int oddNumber =0;

        System.out.println("Upisi brojeve: ");
        while (true){
            if(broj == -1){
                zbroj++;
                brojBrojeva--;
                evenNumber--;
                average = zbroj / brojBrojeva ;
                break;
            }
            if(broj % 2 ==0){
                evenNumber++;
            }
            if(broj %2 == 1){
                oddNumber++;
            }

            broj = scanner.nextInt();
            zbroj = zbroj + broj ;
            brojBrojeva++;

        }
        System.out.println(zbroj);
        System.out.println(brojBrojeva);
        System.out.println(average);
        System.out.println(evenNumber);
        System.out.println(oddNumber);
    }
}
