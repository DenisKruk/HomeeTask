package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Task4_2 {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean trueFalse = getTrueSummOf2(scan);
        boolean chetOf3 = getChetnieFrom3Digits(scan);
        boolean chetOf2 = getChetOf2(scan);
        boolean pifagor =getPifagor(scan);
        boolean original4 =getOriginal(scan);


    }

    private static boolean getTrueSummOf2(Scanner scan) {

        boolean t = true;
        int four, a, b, c, d;
        do {
            System.out.println("Проверка суммы первых двух цифр и вторых. \n Введите четырехзначное число");

            four = scan.nextInt();
            if (four <= 999 || four >= 10000) {
                System.out.println("Введенное число не четурехзначное");
            }
        } while (four <= 999 || four >= 10000);
        a = four / 1000;
        b = (four % 1000) / 100;
        c = ((four % 1000) % 100) / 10;
        d = ((four % 1000) % 100) % 10;

        if (a + b == c + d) {
            System.out.println("2.1 True");
        } else {
            System.out.println("2.1 False");
        }
        return false;
    }
    private static boolean getChetnieFrom3Digits(Scanner scan) {

        int e, f, g, n;
        do {
            System.out.println("Проверка суммы числа на четнось. \n Введите трехзначное число");
            n = scan.nextInt();
            if (n <= 99 || n >= 1000) {
                System.out.println("Введенное число не трехзначное");
            }
        } while (n <= 99 || n >= 1000);
        e = n / 100;
        f = (n % 100) / 10;
        g = (n % 100) % 10;
        if ((e + f + g) % 2 == 0) {
            System.out.println("2.2 True");
        } else {
            System.out.println("2.2 False");
        }
        return true;
    }
    private static  boolean getChetOf2(Scanner scan) {
        int nn;
        do {
            System.out.println("Проверка числа на четность. \nВведите двухзначноезначное число");
            nn = scan.nextInt();
            if (nn <= 9 || nn >= 100) {
                System.out.println("Введенное число не двухзначноезначное");
            }

        } while (nn <= 9 || nn >= 100);
        if (nn % 2 == 0) {
            System.out.println("2.3 True");
        } else {
            System.out.println("2.3 False");
        }
        return true;
    }
    private static boolean getPifagor(Scanner scan) {
        int numb, a, b, c;
        do {
            System.out.println("пифагор. \n Введите 3 натуральных числа");
            numb = scan.nextInt();
            a = numb / 100;
            b = (numb % 100) / 10;
            c = (numb % 100) % 10;
            if (a < 0 || b < 0 || c < 0) {
                System.out.println("Введенное число не натуральное");
            }
        }
        while (a < 0 || b < 0 || c < 0);
        if ((int) Math.pow(c, 2) == (int) Math.pow(a, 2) + (int) Math.pow(b, 2)) {
            System.out.println("2.4 True");
        } else {
            System.out.println("2.4 False");
        }
        return true;
    }
    private static boolean getOriginal(Scanner scan) {
        int a, b, c, d, f;
        do {
            System.out.println("Проверка на оригинальность чисел. \nВведите четырехзначное число");
            f = scan.nextInt();
            if (f <= 999 || f >= 10000) {
                System.out.println("Введенное число не четурехзначное");
            }
        }
        while (f <= 999 || f >= 10000);
        a = f / 1000;
        b = (f % 1000) / 100;
        c = ((f % 1000) % 100) / 10;
        d = ((f % 1000) % 100) % 10;

        if (a != b && a != c && a != d && b != c && b != d && c != d) {
            System.out.println("2.5 True");
        } else {
            System.out.println("2.6 False");
        }
        return true;
    }
    private static boolean getMirror(Scanner scan){
int a, b, c, d, f;
                do {
                    System.out.println("Зеркальное число \nВведите четырехзначное число");
                    f = scan.nextInt();
                    if (f <= 999 || f >= 10000) {
                        System.out.println("Введенное число не четурехзначное");
                    }
                }
                        while (f <= 999 || f >= 10000) ;
                         a = f / 1000;
                         b = (f % 1000) / 100;
                         c = ((f % 1000) % 100) / 10;
                         d = ((f % 1000) % 100) % 10;


                        if (a==d&&b==c) {
                            System.out.println("2.5 True");
                        } else {
                            System.out.println("2.6 False");
                        }
        return true;
    }


}
