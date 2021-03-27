package com.vjezba1.gradestats;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class GradesTask {
            /*
         *************** GRADES TASK ***************
            GradesTask task = new GradesTask();
            Grades grades = new Grades();
            grades.setOcjene(task.listOfGrades());
            System.out.println(grades.getOcjene().toString());
            task. averageGrade(grades.getOcjene());
            task.highGrade(grades.getOcjene());
            task.postotakProlaznihOcjena(grades.getOcjene());
            task.printGrades(grades.getOcjene());
            */


    public static List listOfGrades() {
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
