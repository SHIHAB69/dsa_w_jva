package com.sihab;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8,9};
        chnage(arr);
        System.out.println(Arrays.toString(arr));
    }

    static  void chnage(int[] nums){
        nums[0] = 99;
    }
}
