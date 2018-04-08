package com.company;

import java.util.Scanner;

public class Task4_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x;
        double y;
        double w=0;

        System.out.println("Input number x");
        x = getNum(scan);
        System.out.println("Input number y");
        y = getNum(scan);
        while (x != y) {
            if (x < y) {
                double temp;
                temp = x;
                w = (temp + y) / 2;
                y = (temp * y) * 2;
                x = w;
            } else if (x > y) {
                double temp1=y;
                 w = (x + temp1) / 2;
                x = (x * temp1) * 2;
                y=w;
            }
            System.out.println("x=" + x + "\ny=" + y);
            break;
        }
    }

    private static int getNum(Scanner scan) {
        int x = scan.nextInt();
        return x;
    }
}
