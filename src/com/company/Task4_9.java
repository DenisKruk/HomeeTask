package com.company;

public class Task4_9 {
    public static void main(String[] args) {
        int min = 1;
        int step =2;
        int array[]=new int[55];
        array = getArray(array,min, step);

    }

    private static int[] getArray(int[] array, int min, int step) {
        for(int i = 0;i<array.length;i++) {
            array[i]= min;
            System.out.print(array[i] + " ");
            min+=step;
        }
        return  array;
    }
}

