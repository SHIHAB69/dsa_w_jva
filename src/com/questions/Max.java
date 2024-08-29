package com.questions;

public class Max {
    public static void main(String[] args) {
        int[] arr = {2,1,7,34,2,143,25};
        System.out.println(max(arr));
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
}
