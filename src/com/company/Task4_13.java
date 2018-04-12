package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4_13 {
    public static void main(String[] args) {
        int num = getNum();
        findDiv(num);
    }

    private static void findDiv(int num) {
        System.out.println("Делители числа "+num);
        for(int i =num; i>0; i--){
          if(num%i==0){
              System.out.print(i+", ");
          }
        }

    }


    private static int getNum() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число");
        int result;
        try {
            result = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(" Вы ввели не числою");
            return getNum();
        }
        return result;
    }


}
