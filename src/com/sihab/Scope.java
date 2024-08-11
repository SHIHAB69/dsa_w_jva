package com.sihab;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b= 23;
        {
         a = 100;

        }
        System.out.println(a);
    }
}
