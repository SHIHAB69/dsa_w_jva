package com.questions;

public class SearchInRange {
    public  void main(String[] args) {

    }

    public  int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int start = search(nums, target, true);
        int end  = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;
        return ans;
    }

    //this func returns search target index val
     int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if(nums[mid] > target){
                end = mid -1;
            }else if(nums[mid] < target){
                start = mid + 1;
            }else {
                ans = mid;
                if (findStartIndex){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }

        }
        return  ans;
    }
 }
