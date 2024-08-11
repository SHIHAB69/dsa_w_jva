package com.sihab;

public class Shadowing {
    static int a =19;
    public static void main(String[] args) {

        System.out.println(a);
        int a = 10;
        System.out.println(a);
        fun();


    }
    static  void fun(){
        System.out.println(a);
    }
}
