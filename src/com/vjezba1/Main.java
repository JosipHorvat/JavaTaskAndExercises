package com.vjezba1;

import com.vjezba1.gradestats.Grades;
import com.vjezba1.gradestats.Matrica;

import java.util.*;

public class Main {

        public static void main(String[] args) {
        /*
        Write a program that reads integers representing course point totals from the user.
        Numbers between [0-100] are acceptable and the number -1 ends the reading of input.
        Other numbers are erroneous input, which should be ignored. When the user enters the number -1,
        the program should print the average of the point totals that were input.
         */

            Grades grades = new Grades();
            grades.setOcjene(listOfGrades());
            System.out.println(grades.getOcjene().toString());
            averageGrade(grades.getOcjene());
            highGrade(grades.getOcjene());
            postotakProlaznihOcjena(grades.getOcjene());
            printGrades(grades.getOcjene());

            Matrica pero = new Matrica();
            pero.spirala();

    }

    private static List listOfGrades() {
        int ocjena;
        List<Integer> listaOcjena = new ArrayList<>();
        System.out.println("Unesi broj bodova ispita: ");

        //Sve dok ne uneses -1 broj ocjene ce se dodavati u listu ocjena
        while (true) {

            ocjena = ucitajBroj();

            if (ocjena == -1) {
                System.out.println("Svi rezultati ispita su uneseni. Racunam...");
                break;
            }
            listaOcjena.add(ocjena);
            if (ocjena > 100 || ocjena < -1) {
                int index = listaOcjena.size() - 1;
                listaOcjena.remove(index);
                System.out.println("Unesena je kriv broj bodova te se nece racunati u prosjek");
            }
        }
    return  listaOcjena;
    }

    // Metoda koja racuna prosjek svih unesenih ocjena (1-100)
    public static void averageGrade(List<Integer> grades){
        double sum = 0;
        for (int i : grades) {
            sum += i;
        }
        double average = sum / grades.size();

        System.out.println("Prosjek bodova svih ispita je:  " + average);
    }

    /*
        ++++++++++DRUGI DIO ZADATKA++++++++++++

   Extend the program, such that it in addition to giving the point average of all totals also provides
   the point average for points giving a passing grade.
   A passing grade is achieved by getting a minimum of 50 course points.
   You may assume that the user always provides at least one integer between [0-100]. If there are no
   numbers giving a passing grade, the program should print a line "-" where the average would be.
    */

    public static void highGrade(List<Integer> grades){
        List<Integer> highGrades = new ArrayList<>();
        for (int i : grades) {
            if(i>50){
                highGrades.add(i);
            }
    }
        double sum = 0;
        for (int j : highGrades) {
            sum += j;
        }
        double average = sum / highGrades.size();

        if(average >= 50){
            System.out.println("Prosjek bodova prolaznih ispita: "+ average);
        }
        else {
            System.out.println("Nema prolaznih ocjena");
        }
    }


    //Metoda koja racuna postotak prolaznosti ispita
    public static void postotakProlaznihOcjena(List<Integer> sveOcjene){
        List<Integer> prolazneOcjene = new ArrayList<>();
        for (int i : sveOcjene) {
           if(i >=50){
               prolazneOcjene.add(i);
           }
        }
        float postotakProlaznosti = 100* prolazneOcjene.size()/sveOcjene.size();
        System.out.println("Postotak prolaznosti ispita: "+ postotakProlaznosti + "%");

    }



    //Metoda koja handla exceptione
    public static int ucitajBroj() throws IndexOutOfBoundsException {
        Scanner input = new Scanner(System.in);
        int point = 0;
        try {
            point = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Krivi unos, morat ce te poceti ispocetka :P");
            listOfGrades();
        }
        return point;
    }

    public static void printGrades(List<Integer> grades) {
        ArrayList five = new ArrayList();
        ArrayList four = new ArrayList();
        ArrayList three = new ArrayList();
        ArrayList two = new ArrayList();
        ArrayList one = new ArrayList();
        ArrayList failedExam = new ArrayList();
        String star = "*";
        for (int i : grades) {
            if (i >= 90) {
               five.add(star);
            }
            if (i >=80 && i < 90) {
                four.add(star);
            }
            if ( i >=70 && i < 80) {
                three.add(star);
            }
            if (i >=60 && i < 70) {
                two.add(star);
            }
            if (i >=50 && i < 60) {
                one.add(star);
            }
            if (i < 50) {
                failedExam.add(star);
            }
        }
        System.out.println("5: "+ five);
        System.out.println("4: "+ four);
        System.out.println("3: "+ three);
        System.out.println("2: "+ two);
        System.out.println("1: "+ one);
        System.out.println("0: "+ failedExam);
    }

}







