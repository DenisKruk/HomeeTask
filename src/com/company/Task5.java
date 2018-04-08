package com.company;

import java.util.Scanner;

public class Task5 {


        public static void main (String[]args){
            Scanner scan = new Scanner(System.in);
            int n = 0;
            int max=0, min=0;
            n = getN(n, scan);
            int array[]= new int[n];
            array = getAnalis(array, scan, n);
            chetNechet(array);
            max = maxOfArray(array);
            min = minOfArray(array);
            del3Or9Or5Or7(array);
            bubleMinus(array);
            System.out.println();
            desiatichnaja(array);
            System.out.println();
            maxObschijDelitel(array, min);
            }

    private static void maxObschijDelitel(int[] array, int min) {
            int q=0;
            int i=0;

            for (int j = min; j > 0; j--) {
                while(i<array.length) {
                if (array[i] % j != 0)break;
                else if (array[i] % j == 0){
                        i += 1;
                    }
                     q=j;
            }

            }
        System.out.println("Наибольший общий делитель "+q);
        }





    private static void desiatichnaja(int[] array) {
        System.out.println("Все трехзначные числа, в десятичной записи которых нет одинаковых цифр");
            for(int i=0;i<array.length;i++){
                if(array[i]>99&&array[i]<1000) {
                    int a = (array[1] / 100);
                    int b = ((array[i] % 100) / 10);
                    int c = ((array[i] % 100) % 10);
                    if (a != b && b!=c && a!=c){
                        System.out.print(array[i]+", ");
                    }
                }
            }
    }


    private static void bubleMinus(int[] array) {
        System.out.println("Отсортировано по методу пузырька по убыванию");
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            System.out.print(array[i] + ",");
        }
    }


    private static void del3Or9Or5Or7(int[] array) {
            for(int i=0;i<array.length;i++){
                if(array[i]%3==0){
                    System.out.println(array[i]+" делится на 3");
                }
                if(array[i]%9==0){
                    System.out.println(array[i]+" делится на 9");
                }
                if(array[i]%5==0){
                    System.out.println(array[i]+" делится на 5");
                }
                if(array[i]%7==0){
                    System.out.println(array[i]+" делится на 7");
                }
            }
    }

    public static int maxOfArray(int[] array) {
            int max=array[0];
            for(int i = 0; i<array.length;i++){
                if(array[i]>max){
                    max=array[i];
                }
            }
        System.out.println("Наибольшее число "+max);
            return max;
    }

    public static int minOfArray(int[] array) {
        int min=array[0];
        for(int i = 0; i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("Наименьшее число "+min);
        return min;
    }

    private static void chetNechet(int[] array) {
            for(int i=0;i<array.length;i++){
                if(array[i]%2!=0){
                    System.out.println("Число "+array[i]+" не четное");
                }
                else {
                    System.out.println("Число "+array[i]+" четное");
                }
            }
    }

    private static int[] getAnalis(int[] array, Scanner scan, int n) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите число номер " + (i + 1));
            array[i] = scan.nextInt();
        }
        return array;
    }

    private static int getN ( int n, Scanner scan){
            System.out.println("Введите какое колличество чисел вы хотите проанализировать");
            n = scan.nextInt();
            return n;
        }
    }
