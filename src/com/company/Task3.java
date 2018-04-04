package com.company;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Пункт 1");
        String chetNech = getChet();
        System.out.println("Пункт 2 ");
        int cickl1 = getFindOrProd();// метод с for
        int cickl2 = getFindOrProd1();// метод с while
        long n;
        System.out.println("Введите число для выведения факториала");
        Scanner scan = new Scanner(System.in);
        n = scan.nextLong();
        long fact = getFact((int) n);
        System.out.println("Факториал числа "+n+" равен "+fact);
    }

    private static long getFact(int n) {
        long fact =1;

        for(long i =1; i!=0;i++){

            fact = fact*i;
            if(i==n) break;
        }

        return fact;
    }

    private static int getFindOrProd1() {
        int i = 1;
        int a = 1;//число
        int b = 1;//произведение
        int c = 1;//сумма

        while(c < 200 && b <300) {

            System.out.println("Число "+a);
            System.out.println(c + " сумма чисел & " + b + " их произведение");
            i = i+1;
            a = a+3;
            c = c+a;
            b = b * a;

        }
        System.out.println("Число "+a);
        System.out.println(c + " sum & " + b + " prod");
        System.out.println("Количество чисел " + i);

        return i;
    }

    private static int getFindOrProd() {
        int i ;
        int a =1;//число
        int b =1;//произведение
        int c= 1;//сумма

             for( i=1;c < 200 && b <300;i++) {

            System.out.println("Число "+a);
                 System.out.println(c + " сумма чисел & " + b + " их произведение");

                a = a+3;
                c= c+a;
                b = b * a;

            }
        System.out.println("Число "+a);
        System.out.println(c + " sum & " + b + " prod");
        System.out.println("Количество чисел " + i);

    return i;
    }

    private static String getChet() {
        for (int i=1; i<11; i++) {
            if (i%2 == 0) {
                System.out.println("Число "+i+" четное");
            }
            else {
                System.out.println("Число "+i+" нечетное");
            }
        }
        return null;
    }
}
