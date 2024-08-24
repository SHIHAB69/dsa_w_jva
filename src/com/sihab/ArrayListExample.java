package com.sihab;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>(10);


        for (int i = 0; i < 5; i++){

            list.add(in.nextInt());
        }

        for (int i: list){
            System.out.println(i);
        }




    }
}
