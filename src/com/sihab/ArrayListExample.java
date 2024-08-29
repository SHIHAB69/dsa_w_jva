package com.sihab;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();


    for(int i = 0; i< 5; i++) {
            arr.add(in.nextInt());
        }

        for (int i = 0; i< 5; i++) {
            System.out.println(arr.get(i));
        }
    }
}
