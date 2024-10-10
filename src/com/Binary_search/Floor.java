package com.Binary_search;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 2;
        int ans = floor(arr, target);
        System.out.println(ans);
    }
// greatest number <= target
    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        boolean isAccending = arr[start] == arr[end];

        while (start <= end ){
            int mid = start + (end - start) / 2;
            if (arr[mid] == target){
                return arr[mid];
            }
            if(isAccending){
                if (arr[mid] > target){
                    start = mid + 1;
                }else {
                    end = mid -1;
                }
            }else {
                if (arr[mid] > target){
                    end = mid - 1;
                }else {
                    start  = mid + 1;
                }
            }
        }
        return arr[end];
    }
}
