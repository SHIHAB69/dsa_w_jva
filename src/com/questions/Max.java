package com.questions;

import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = {2,1,7,34,2,143,25};

        reverse(arr);
        System.out.println(Arrays.toString(arr));


    }
    static int max (int[] arr) {
        int maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
    static void reverse(int[] arr){
        int strt = 0;
        int end = arr.length-1;

        while(strt < end){
            swap(arr,strt,end);
            strt++;
            end--;
        }

    }

    static void swap(int[] arr , int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
