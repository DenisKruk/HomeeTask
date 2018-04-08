package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Task4_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userPassword[] = new int[4];
        int password[] = new int[4];
        password = getPassword(password);
        System.out.println();
        userPassword = getUserPassword(scan, userPassword, password);
        System.out.println("The password is correct");


    }

    private static int[] getPassword(int[] password) {
        for (int i = 0; i < password.length; i++) {
            password[i] = (int) (Math.random() * 10);
            System.out.print(password[i]);
        }
        return password;
    }

    private static int[] getUserPassword(Scanner scan, int[] userPassword, int[] password) {
        int pass = 0;
         do{
            do {
                System.out.println("Enter password (4 digits)");
                pass =Integer.valueOf(scan.next());
            }
            while (pass < 999 || pass > 10000);
            userPassword[0] = pass / 1000;
            userPassword[1] = (pass % 1000) / 100;
            userPassword[2] = ((pass % 1000) % 100) / 10;
            userPassword[3] = ((pass % 1000) % 100) % 10;
        }while (userPassword[0]!=password[0]&&userPassword[1]!=password[1]&&userPassword[2]!=password[2]&&userPassword[3]!=password[3]);

        return password;
        }
}

