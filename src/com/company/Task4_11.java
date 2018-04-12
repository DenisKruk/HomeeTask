package com.company;

public class Task4_11 {
    public static void main(String[] args) {
        int a[] = new int[100];
        a[1] = 2;
        int res=a[1];
        for (int n = 2; res < 10000; n++) {
            System.out.print(res + " ");
            a[n] = 2 * a[n - 1] - 1;
            res = a[n];
        }
    }

}


