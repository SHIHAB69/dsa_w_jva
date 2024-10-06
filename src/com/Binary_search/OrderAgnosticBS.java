package com.Binary_search;

public class OrderAgnosticBS {
    public static void main(String[] args) {

    }

    static int orderAgnosticBS(int[]arr, int target){
        int start = 0;
        int end = arr.length - 1;
        //find whether the array is sorted in accenting or descending order
        boolean isAcc = arr[start] < arr[end];


        while(start < end){
            int mid = start + (end - start) / 2;

            if (arr[mid] == target){
                return mid;
            }
            if (isAcc){
                if(target < arr[mid]){
                    end = mid -1;
                }
                else if(target > arr[mid]){
                    start = mid + 1;
                }
            }

            else{
                if (target < arr[mid]){
                    start = mid + 1;
                }else if(target > arr[mid]){
                    end = mid - 1;
                }

            }

         }

        return -1;

    }
}
