package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4_5 {
    public static void main(String[] args) {
        int min = 1;
        int max = 9999;
        int n = 0;
        n = getN( min, max);
        int summOfNums=getsum(n);
    }

    private static int getsum(int n) {
        if (n>=1 && n<=9){
            System.out.println("Сумма равна "+n);
        }
        else if(n>=10 && n<=99){
            int a = n/10;
            int b = n%10;
            System.out.println("Сумма равна "+(a+b));
        }
        else if(n>=100 && n<= 999){
            int a = n/100;
            int b = (n%100)/10;
            int c = (n%100)%10;
            System.out.println("Сумма равна "+(a+b+c));
        }
        else if(n>=1000 && n<=9999){
            int a = n/1000;
            int b = (n%1000)/100;
            int c = ((n%1000)%100)/10;
            int d = ((n%1000)%100)%10;
            System.out.println("Сумма равна "+(a+b+c+d));
        }
        return 0;
    }


    private static int getN( int min, int max) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите число  от "+min+" до "+max);
        int result;
        try {
             result = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(" Вы ввели не число");
            return getN(min, max);
        }
        if (result < min || result > max) {
            System.out.println("Число не от " + min + " до " + max);
            return getN(min, max);
        }
        return result;
    }
}
