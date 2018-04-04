package com.company;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int sumOfTwo = getTwoDigits();
        int sumOfThree = getThreeDigits();
        double roundOfDouble = getRound();
        int formula = getFormula();
    }

    private static int getFormula() {
        int q, w, f, d;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число");
        q = scan.nextInt();
        System.out.println("Введите вторе число");
        w = scan.nextInt();
        f=q/w;
        d=q%w;
        System.out.println("Результат деления "+q+ " на " +w+" равен "+f+ " и " +d+ " в остатке");
       return f;
    }

    private static double getRound() {
        double n;
        System.out.println("Введите число с ненулевой дробной частью");

            Scanner scan = new Scanner(System.in);
            n = Double.valueOf(scan.next());

            System.out.println("Чиcло "+n+" было округлено до "+Math.round(n));

            return Math.round(n);
    }

    public static int getThreeDigits() {
        int n, a, b;
        int c;
        System.out.println("Введите трехзначное число");
        do {
            Scanner scan = new Scanner(System.in);
            n = scan.nextInt();


            if( n<100 || n>999 ) {
                System.out.println("Введенное число не трехзначное. \nВведите трехзначное число");
            }
        }while( n<100 || n>999 );

        a = n/100;
        b = (n%100)/10;
        c = (n%100)%10;
        System.out.println("Сумма цифр введенного числа равна "+(b+c+a));


        return n;
    }

       public static int getTwoDigits() {
        int n, a, b;
        System.out.println("Введите двузначное число");
        do {
            Scanner scan = new Scanner(System.in);
            n = scan.nextInt();


         if( n<10 || n>99 ) {
             System.out.println("Введенное число не двузначное. \nВведите двузначное число");
         }
        }while( n<10 || n>99 );

        a = n/10;
        b = n%10;
        System.out.println("сумма цифр введенного числа равна "+(a+b));

return n;
    }
}

