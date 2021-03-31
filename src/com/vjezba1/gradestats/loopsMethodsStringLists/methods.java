package com.vjezba1.gradestats.loopsMethodsStringLists;

public class methods {

    //Method that finds all numbers divisible by 3
    public static void division(int prvi, int drugi) {
        for (int i = prvi; prvi < drugi; prvi++) {
            if (prvi % 3 == 0) {
                System.out.println(prvi);
            }
        }
    }
    // sum method
    /*
     Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    int first = Integer.valueOf(scanner.nextLine());

    System.out.print("Enter the second number: ");
    int second = Integer.valueOf(scanner.nextLine());

    System.out.print("The combined sum of the numbers is: " + sum(first, second));
     */

    public static int sum(int first, int second) {
        return first + second;
    }

    /*
     int manjiOdTaDVa = najmanji(31, 31 );
           System.out.println("manji broj je: " + manjiOdTaDVa);
    */
    // Manji od 2 broja
    public static int najmanji(int number1, int number2) {
        if (number1 < number2) {
            return number1;
        }

        return number2;
    }

//    int answer =  greatest(3, 1, 2);
//            System.out.println("Greatest: " + answer);

    //GREATEST OF 3 NUMBERS
    public static int greatest(int number1, int number2, int number3) {
        if (number1 > number2 && number1 > number3) {
            return number1;
        }
        if (number2 > number1 && number2 > number3) {
            return number2;
        }
        return number3;
    }

    // AVERAGE OF GIVEN NUMBERS
//    double averageNumber =average(5,5,5,5);
//        System.out.println(averageNumber);

    public static int sum(int first, int second, int third, int fourth) {
        return first + second + third + fourth;
    }

    public static double average(int number1, int number2, int number3, int number4) {
        return sum(number1, number2, number3, number4) / 4;
    }

    //MULTIPLICATION TABLE:
//   multiplicationTable(10);

    public static void multiplicationTable(int max) {
        int number = 1;

        while (number <= max) {
            printMultiplicationTableRow(number, max);
            number++;
        }
    }

    public static void printMultiplicationTableRow(int number, int coefficient) {

        int printable = number;
        while (printable <= number * coefficient) {
            System.out.print("  " + printable);
            printable += number;
        }

        System.out.println("");
    }

    // PRINT SQUARE WITH *
    //printstars(5);
    public static void printStars(int size) {
        int i = 1;
        while (i <= size) {
            printSize(size);
            i++;
        }
        System.out.println("");
    }


    public static void printSize(int number) {
        int j = 1;
        while (j <= number) {
            System.out.print("*");
            j++;
        }
        System.out.println("");
    }

    //PRINT RECTANGLE WITH *
    //printRectangle(15,3);
    public static void printRectangle(int height, int width) {

        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= height; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

//            *
//            **
//            ***
//            ****
//            *****
    //printStars1(5);

    public static void printStars1(int size) {
        int i = 1;
        while (i <= size) {
            printTriangle(i);
            i++;
            System.out.println("");
        }

    }

    private static void printTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            System.out.print("*");
        }
    }

/*
     x
    xx
   xxx
  xxxx
 xxxxx
 */
//int n = 5;
//        for (int i=1; i<=n; i++){
//        for (int j=0; j<=n-i; j++) {
//            System.out.print(" ");
//        }
//        for (int k=1; k<=i; k++){
//            System.out.print("x");
//        }
//        System.out.println();
//    }

//     *
//     ***
//     *****
//     *******
//     *********

//    int i = 0;
//        while(i<5){
//        int j = 0;
//        int k = 0;
//        while(j<5-i){
//            System.out.print(" ");
//            j++;
//        }
//        while(k<(2*i)+1){
//            System.out.print("*");
//            k++;
//        }
//        ++i;
//        System.out.println("");
//     }


    }




