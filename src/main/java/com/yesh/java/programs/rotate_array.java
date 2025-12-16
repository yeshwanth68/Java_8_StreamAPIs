package com.yesh.java.programs;

import java.util.Arrays;

public class rotate_array {

	public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;
System.out.println(arr.length);
        // Step 1: reverse whole array
        reverse(arr, 0, arr.length - 1);  // 5 4 3 2 1

        // Step 2: rotate right by k
        reverse(arr, 0, k - 1);           // 4 5 | 3 2 1
        reverse(arr, k, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
