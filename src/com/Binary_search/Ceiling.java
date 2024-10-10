package com.Binary_search;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 13;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }
//smallest number >= target
    static int ceiling(int[] arr, int target) {
       // But what if the target is greater than the greatest number in the array
        if (target > arr[arr.length -1]){
            return -1;
        }
        int start = 0;
        int end = arr.length -1;
        boolean isAccending = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start) / 2;

            if (isAccending){

            if (arr[mid] == target){
                return  mid;
            }
            else if (arr[mid] < target){
                    start = mid + 1;
               }else{
                end = mid - 1;
                }
            }
            else {
                if (target > arr[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return start;

    }
}
