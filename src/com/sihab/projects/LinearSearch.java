package com.sihab.projects;

public class LinearSearch {
    public static void main(String[] args) {
            int[] nums = {1,2,3,4,5,4,3,5,6,7};
            int target = 4;
            int ans = linearsearch(nums, target);
        System.out.println(ans);
    }
    // search in the array: return the index if item founsd ;
    // return -1 if item not found
    static int linearsearch(int[] arr, int target){
        if (arr.length == 0){
            return  0;
        }

        for (int i = 0; i< arr.length; i++){
            // check for element at every index if its exists
            int element = arr[i];
            if(element == target){
                return i;
            }

        }

        return -1;  // if item not found in the array
    }


}
