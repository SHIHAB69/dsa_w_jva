package com.sihab;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        //fun(1,2,3,4,5);
        multy(2,3,"Kunal", "Rahul", "Johnson");
    }

    static void multy(int a, int b, String ...c){

    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));

    }
}
