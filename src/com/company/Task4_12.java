package com.company;

public class Task4_12 {
    public static void main(String[] args) {
        int a[] = new int[100];
        a[1] = -166;
        int res=a[1];
        for (int n = 2; res < 10000; n++) {
            if(res>-100 && res<-9 || res>9 && res<100) {
                System.out.print(res + " ");
            }
            a[n] = 2 * a[n - 1] + 200;
            res = a[n];
        }
    }
}
