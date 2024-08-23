package com.sihab;

import java.util.Arrays;

public class swapArray {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        swapArray(array1);
        System.out.println(Arrays.toString(array1));
    }

    static void swapArray(int[] array1) {
        int start = 0;
        int end = array1.length - 1;
        while (start < end) {
            swap(array1, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
