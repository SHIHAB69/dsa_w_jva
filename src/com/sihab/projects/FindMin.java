package com.sihab.projects;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {12, 5, 18, 9, 23};

        System.out.println(min(arr));

    }

    // assume arr.length != 0
    //return the min value
    static int min(int[] arr) {

        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > ans){
                ans = arr[i];
            }
        }
        return ans;

    }
}
