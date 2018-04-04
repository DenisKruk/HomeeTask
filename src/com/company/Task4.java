package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int stepen = getStepen();
        boolean trueFalse = getTrue();

    }

    private static boolean getTrue() {
        Scanner scan = new Scanner(System.in);
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
    int e, f, g, n;
            do {
                System.out.println("Проверка суммы числа на четнось. \n Введите трехзначное число");
                 n = scan.nextInt();
                if (n <= 99 || n >= 1000) {
                    System.out.println("Введенное число не трехзначное");
                }
            } while (n<=99 || n>=1000) ;
             e = n/100;
             f =  (n%100)/10;
             g =  (n%100)%10;
            if ((e+f+g)%2 == 0) {
                System.out.println("2.2 True");
            }
            else {
                System.out.println("2.2 False");
            }
            int nn;
            do {
                System.out.println("Проверка числа на четность. \nВведите двухзначноезначное число");
                 nn = scan.nextInt();
                if (nn <= 9 || nn >= 100) {
                    System.out.println("Введенное число не двухзначноезначное");
                }

            }while (nn <= 9 || nn >= 100) ;
                if (nn % 2 == 0) {
                    System.out.println("2.3 True");
                } else {
                    System.out.println("2.3 False");
                }
                int numb, aa, bb, cc;
                do {
                    System.out.println("пифагор. \n Введите 3 натуральных числа");
                    numb = scan.nextInt();
                    aa = numb/100;
                    bb = (numb%100)/10;
                    cc = (numb%100)%10;
                    if (aa < 0 || bb < 0 || cc < 0) {
                        System.out.println("Введенное число не натуральное");
                    }
                }
                    while (aa < 0 || bb < 0 || cc < 0) ;
                    if ((int) Math.pow(cc, 2) == (int) Math.pow(aa, 2) + (int) Math.pow(bb, 2)) {
                        System.out.println("2.4 True");
                    } else {
                        System.out.println("2.4 False");
                    }
                    int aaa, bbb, ccc, ddd, four1;
                do {
                    System.out.println("Проверка на оригинальность чисел. \nВведите четырехзначное число");
                     four1 = scan.nextInt();
                    if (four1 <= 999 || four1 >= 10000) {
                        System.out.println("Введенное число не четурехзначное");
                    }
                }
                while (four1 <= 999 || four1 >= 10000) ;
                         aaa = four1 / 1000;
                         bbb = (four1 % 1000) / 100;
                         ccc = ((four1 % 1000) % 100) / 10;
                         ddd = ((four1 % 1000) % 100) % 10;

                        if (aaa != bbb && aaa != ccc && aaa != ddd && bbb != ccc && bbb != ddd && ccc != ddd) {
                            System.out.println("2.5 True");
                        } else {
                            System.out.println("2.6 False");
                        }
int aaaa, bbbb, cccc, dddd, four2;
                do {
                    System.out.println("Зеркальное число \nВведите четырехзначное число");
                    four2 = scan.nextInt();
                    if (four2 <= 999 || four2 >= 10000) {
                        System.out.println("Введенное число не четурехзначное");
                    }
                }
                        while (four2 <= 999 || four2 >= 10000) ;
                         aaaa = four / 1000;
                         bbbb = (four % 1000) / 100;
                         cccc = ((four % 1000) % 100) / 10;
                         dddd = ((four % 1000) % 100) % 10;


                        if (Objects.equals(aaaa, dddd) && Objects.equals(bbbb, cccc)) {
                            System.out.println("2.5 True");
                        } else {
                            System.out.println("2.6 False");
                        }


        return t;
    }

    private static int getStepen() {
        System.out.println("Введите число для возведения его в степень");
        Scanner scan1 = new Scanner(System.in);
        int n = scan1.nextInt();
        for (int i =1; i<=4; i++) {
            int f = (int) Math.pow(n,i);
            System.out.println(n+" в степени "+i+" равно "+f);

        }
     return n;
    }
}
