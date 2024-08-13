package com.sihab;

import java.util.Arrays;
import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];

        for(int i = 0; i< arr.length; i++){

            arr[i] = in.nextInt();
        }
        //the best way to print
        System.out.println(Arrays.toString(arr));

        //or you can use a for-each loop to print each element in the array, both will work the same way...
        for(int num : arr){ //for every element in the array print the elements
            System.out.print(num  +" ");// here num represents the elements of the array
        }


    }
}
