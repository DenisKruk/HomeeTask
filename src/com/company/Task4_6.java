package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4_6 {
    public static void main(String[] args) {
        int min = 1;
        int max = 9999;
        int n = 0;
        int k = 0;
        System.out.println("Получим число");
        n = getNum(min,max);
        System.out.println("тепреь делитель");
        k = getNum(min, max);
        int summOfNums = getSum(n, k);
    }

    private static int getSum( int n, int k) {
        while (n%k==0){
        if (n >= 1 && n <= 9) {
            System.out.println("Сумма равна " + n);
        } else if (n >= 10 && n <= 99) {
            int a = n / 10;
            int b = n % 10;
            System.out.println("Сумма равна " + (a + b));
        } else if (n >= 100 && n <= 999) {
            int a = n / 100;
            int b = (n % 100) / 10;
            int c = (n % 100) % 10;
            System.out.println("Сумма равна " + (a + b + c));
        } else if (n >= 1000 && n <= 9999) {
            int a = n / 1000;
            int b = (n % 1000) / 100;
            int c = ((n % 1000) % 100) / 10;
            int d = ((n % 1000) % 100) % 10;
            System.out.println("Сумма равна " + (a + b + c + d));
        }
break;
    }
     if(n%k!=0) {
         System.out.println("Число " + n + " не кратно " + k);
     }
        return 0;
    }


    private static int getNum(int min, int max) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите число  от " + min + " до " + max);
        int result;
        try {
            result = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(" Вы ввели не число");
            return getNum(min, max);
        }
        if (result < min || result > max) {
            System.out.println("Число не от " + min + " до " + max);
            return getNum(min, max);
        }
        return result;
    }
}


