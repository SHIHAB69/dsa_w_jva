package com.sihab.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>(10);
//        list.add(234);
//        list.add(234);
//        list.add(2324);
//        list.add(2244);
//        list.add(2343);
//        list.add(233);
//        System.out.println(list);
//        list.set(0,99);
//        System.out.println(list);

        for (int i = 0; i < 5; i++){

            list.add(in.nextInt());
        }

        for (int i: list){
            System.out.println(i);
        }




    }
}
