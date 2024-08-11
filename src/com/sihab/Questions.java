package com.sihab;

import javax.swing.*;
import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans = ArmStrong(n);
        System.out.println(ans);
    }

    static boolean ArmStrong(int n) {
        int original = n;
        int sum = 0;
        while (n > 0) {
            int rim = n % 10;
            n = n/10;
            sum = sum + rim * rim * rim;


        }
        if (sum == original){
            return true;
        }else {
            return false;
        }

    }


static boolean isPrime(int n){
    if (n <= 1) {
       return false;
    }
    for (int i = 2; i * i <= n; i++){
        if (n % i == 0){
            return false;
        }
    }
    return true;
}

}
