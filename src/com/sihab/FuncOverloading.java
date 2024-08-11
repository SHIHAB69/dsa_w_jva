package com.sihab;

public class FuncOverloading {
    public static void main(String[] args) {
        fun(34);
        fun("Sihab");
    }

    static  void fun(int a){
        System.out.println(a);
    }

    static void fun(String name){
        System.out.println(name);
    }
}
