package com.sihab.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _2DArrays {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][2];

            for(int row = 0; row < arr.length; row++) {
                //for each col in every row
                for (int col = 0; col<arr[row].length; col++) {

                    arr[row][col] = in.nextInt();
                }
            }
            //Output array 1st method

//            for (int row = 0; row< arr.length; row++) {
//                for (int col = 0;col< arr[row].length ; col++){
//                    System.out.print(arr[row][col] + " ");
//                }
//                System.out.println();
//
//            }
//         //Output array 2nd method
//        for (int row = 0; row < arr.length; row++)  {
//            System.out.println(Arrays.toString(arr[row]));
//        }

        //Output array 3rd method {Best way }

        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }


        }
    }

