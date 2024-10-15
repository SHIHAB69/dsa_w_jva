package com.questions;

public class PeackOfArray {
    public static void main(String[] args) {

    }

        public int peakIndexInMountainArray(int[] arr) {
            int start = 0;
            int end = arr.length - 1;

            while (start < end) {
                final int m = (start + end) / 2;
                if (arr[m] >= arr[m + 1])
                    end = m;
                else
                    start = m + 1;
            }

            return start;
        }
    }

