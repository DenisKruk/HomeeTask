package com.company;

import java.util.Scanner;

public class Task4_1 {
    public static void main(String[] args) {
        int stepen = getStepen();
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
