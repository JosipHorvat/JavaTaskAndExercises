package com.vjezba1.algorithms;

import java.util.Arrays;

public class Sorting {


    public static int smallestNumberInArray(int[] array) {
        Arrays.sort(array);
        return array[0];
    }

    // Index of the smallest value in Array(It will not work if method smallestNumberInArray is called before)
    public static int smallestIndex (int[] array) {
        int min= array[0];
        int index =0;
        for (int i=0; i<array.length; i++) {
            if (min > array[i]) {
               min = array[i];
               index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int min= table[0];
        int index =0;
        for (int i=startIndex; i<table.length; i++) {
            if (min > table[i]) {
                min = table[i];
                index = i;
            }
        }
        return index;
    }
}
