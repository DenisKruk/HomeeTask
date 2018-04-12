package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4_7 {
    public static void main(String[] args) {
        int n = 0;
        int min = 1;
        int max = 10;
        int userNum=0;
        n = getNum(min, max);
        userNum = getUserNum(min, max, n, userNum);
    }
    private static int getUserNum(int min, int max, int n, int userNum) {
        while (n != userNum) {
            System.out.println("Ведите число от " + min + " до " + max);
            Scanner scan = new Scanner(System.in);
            try {
                userNum = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(" Вы ввели не число");
                return getUserNum(min, max, n, userNum);
            }
            if (userNum < min || userNum > max) {
                System.out.println("Число не от " + min + " до " + max);
                return getUserNum(min, max, n, userNum);
            }
            else if (userNum > n) {
                System.out.println("Введенное число больше загаданного");
                return getUserNum(min,max,n,userNum);
            }
            else if (userNum < n) {
                System.out.println("Введенное число меньше загаданного");
                return getUserNum(min,max,n,userNum);
            }
            System.out.println( "Вы угадали загаданое число" );

        }
        return userNum;
    }

    private static int getNum(int min, int max) {
        int r =(int)((Math.random()*max)+min);
        System.out.println(r);
    return r;
    }
}
