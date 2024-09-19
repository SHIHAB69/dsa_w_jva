package com.sihab.projects;


public class SearchInRange {
    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 13;
        System.out.println(linearSearch(arr,target,2,7));

    }

    static int linearSearch(int[] arr, int target, int start,  int end){
        if(arr.length == 0){

            return -1;
        }

        for (int index = start; index < end; index++){

            int element = arr[index];
            if (element == target){
                return index;
            }
        }

        return -1;
    }
}
