package com.DSA;
//find Largest sum contiguous Subarray [V. IMP] (Kadane's Algorithm)
public class Array8 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -2, 5};
        int n = arr.length;
        int MaxSum = MaxSubArray(arr, n);
        System.out.println(MaxSum);


    }

    static int MaxSubArray(int[] arr, int n) {
        int max = arr[0];
        int sum;
        for (int j = 0; j < n; j++) {
            sum = 0;
            for (int i = j; i < n; i++) {
                sum = sum + arr[i];
                if (max < sum)
                    max = sum;
            }
        }
        return max;
    }
}
