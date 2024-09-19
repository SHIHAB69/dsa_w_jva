package com.sihab.projects;

import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 4, 7},
                {17, 14, 16, 20},
                {6, 9, 8, 10}
        };
        int target = 0; // Target that doesn't exist in the array
        int[] ans = search(arr, target);

        // Print result in a more explicit way
        System.out.println("Search result: " + Arrays.toString(ans));

        // Explicitly check if target is not found
        if (Arrays.equals(ans, new int[]{-1, -1})) {
            System.out.println("Target not found in the array.");
        } else {
            System.out.println("Target found at coordinates: " + Arrays.toString(ans));
        }
    }

    static int[] search(int[][] arr, int target) {
        // Iterate through the array
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                // Check if the current element is the target
                if (arr[row][col] == target) {
                    System.out.println("Found target at row: " + row + ", col: " + col); // Debugging print
                    return new int[]{row, col};
                }
            }
        }
        // If the target is not found, return [-1, -1]
        System.out.println("Target not found, returning [-1, -1]"); // Debugging print
        return new int[]{-1, -1};
    }
}
