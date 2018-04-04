package com.company;

public class Task6 {
    public static void main(String[] args) {
        int applesPete=10;
        int applesTotal=15;
        int apples = calculate(applesPete,applesTotal);
        String result =  print(apples);
    }
    public static String print(int apples) {
        System.out.println("У васи "+apples+" яблок!" );
        return null;
    }

    private static int calculate(int applesPete, int applesTotal) {
        int applesVasia=applesTotal-applesPete;
       return applesVasia;
    }
}
