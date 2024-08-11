package com.sihab;
import java.util.Scanner;

public class SUM {
    public  static void main(String[] args) {
        int ans = sum2(23,23);
        System.out.println(ans);
    }
    static int sum2(int s, int b){
        return s + b;
    }

    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter num 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter num 2; ");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println("sum is " + sum);
    }

}
