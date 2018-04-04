package com.company;

import java.util.Scanner;

public class Hello {

    public static void main(String[] args) {
        String hello, arguments, formula;
        int argsLength =  args.length;
        String[] args1 = args;
        hello = getHello();
        arguments = getStringArgs(argsLength, args1);
        formula = getFormula();
    }
    public static String getHello() {
        String name;

        System.out.println("Введите ваше имя");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println("Приветсвую "+ name );

        return name;
    }
    public static String getStringArgs(int argsLength, String[] args1) {
        int argsMax = argsLength - 1;
        for ( int i = argsMax; i>=0;i--) {
            System.out.println(args1[i]);

            //первый способ
}
        if (args1[argsMax] != null) {

            System.out.println("последний аргумент " + args1[argsMax]);
            //вывод последнего аргумента
        }
        while (argsMax >= 0) {

            if (args1[argsMax] != null) {
                System.out.println(args1[argsMax]);
            }
            argsMax = argsMax - 1;
            // второй способ
        }
        return null;
    }
    public static String getFormula() {

        double a, b , c;

        b = 5;
        c = 3.5;
        a = 4*(b+c-1)/2;
        System.out.println(a);
        return null;
    }
}
