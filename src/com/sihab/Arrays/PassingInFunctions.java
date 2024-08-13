package com.sihab.Arrays;

import java.util.Arrays;
import java.util.Stack;

public class PassingInFunctions {
    public static void main(String[] args) {
        int[] nums = {2,34,23,4,2};
        System.out.println(Arrays.toString(nums));
        chage(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void chage(int[] array){
        array[0] = 45;
    }
}
