package com.sihab;

import java.util.Scanner;

public class Primitivees {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = in.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }

        if (num > 0) {
            System.out.println(num + " is a positive number.");
        } else if (num < 0) {
            System.out.println(num + " is a negative number.");
        } else {
            System.out.println(num + " is zero.");
        }

        if (num > 0 && num % 2 == 0) {
            System.out.println(num + " is an even positive number.");
        } else if (num < 0 && num % 2 == 0) {


        }
    }
}
